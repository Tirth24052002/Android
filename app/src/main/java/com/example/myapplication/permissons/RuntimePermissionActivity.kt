package com.example.myapplication.permissons

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityRuntimePermissionBinding

class RuntimePermissionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRuntimePermissionBinding
    private val readStoragePermission = Manifest.permission.READ_EXTERNAL_STORAGE

    private val requestPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
                filePickerContract.launch(Unit)
            } else if (shouldShowRequestPermissionRationale(readStoragePermission)) {
                showRationaleDialog(
                    title = "External Storage Permission Required",
                    message = "This permission is needed to access the file.",
                    permission = readStoragePermission,
                    handlePermission = { handlePermission(it) }
                )
            } else {
                showGrantPermissionFromSettingsDialog(
                    title = "Goto Settings to grant External Storage Permission",
                    message = "This is required permission, without this we can't access the file",
                )
            }
        }

    private val filePickerContract = registerForActivityResult(FilePickerContract()) {
        Toast.makeText(this, "URI: $it", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_runtime_permission)
        binding.btnRuntimePermission.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                filePickerContract.launch(Unit)
            } else {
                handlePermission(Manifest.permission.READ_EXTERNAL_STORAGE)
            }
        }
    }

    private fun handlePermission(permission: String) {
        when {
            ContextCompat.checkSelfPermission(
                this,
                permission
            ) == PackageManager.PERMISSION_GRANTED -> {
                filePickerContract.launch(Unit)
            }

            shouldShowRequestPermissionRationale(permission) -> {
                requestPermissionLauncher.launch(permission)
            }
            else -> {
                requestPermissionLauncher.launch(permission)
            }
        }
    }
}