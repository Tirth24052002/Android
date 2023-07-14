package com.example.myapplication.webView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.myapplication.R

class WebViewActivity : AppCompatActivity() {
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webViewSetup()
    }

    private fun webViewSetup() {
        webView = findViewById(R.id.wv_WebView)
        webView.webViewClient = WebViewClient()
        webView.apply {
            loadUrl("https://google.com")
            settings.builtInZoomControls
        }
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) webView.goBack() else super.onBackPressed()
    }
}