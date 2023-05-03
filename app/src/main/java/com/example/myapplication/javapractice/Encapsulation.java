package com.example.myapplication.javapractice;
public class Encapsulation {
}
class StudentDet {
    String name;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Test {
    public static void main(String[] args) {
        StudentDet s = new StudentDet();
        s.setName("Manan");
        System.out.println(s.getName());
    }
}
//Rad Only class
class Stud{
    private String college = "GTU";
    public String getCollege() {
        return college;
    }
}
class AccountDetail {
    private long accNo;
    private String name, email;
    private float amount;
    public long getAccNo() {
        return  accNo;
    }
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
    public String getName() {
        return  name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getAmount() {
        return  amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
}
class TestEncapsulate {
    public static void main(String[] args) {
        AccountDetail ac = new AccountDetail();
        ac.setAccNo(9645426103L);
        ac.setName("Son Jin");
        ac.setEmail("iueafb@gmail.com");
        ac.setAmount(500000f);
        System.out.println(ac.getAccNo() + " " + ac.getName() + " " + ac.getEmail() + " " + ac.getAmount());
    }
}