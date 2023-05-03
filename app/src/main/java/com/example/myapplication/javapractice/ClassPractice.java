package com.example.myapplication.javapractice;

import java.util.Date;

//Class
class ClassPractice {
    String manager;
    public static void main(String[] args) {
        System.out.println("Hello world");
        class callManager {
            String man;
            callManager mana = new callManager();

        }
    }
}

//Classes and Objects
class Student {
    String name;
    int no;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mohit";
        s1.no = 1;
        System.out.println(s1.no);
        System.out.println(s1.name);
        Student s2 = new Student();
        s2.name = "Rafal";
        s2.no = 2;
        System.out.println(s2.no);
        System.out.println(s2.name);
    }
}

//Class inhertance
class Car {
    String carName;
    int price;

    public static void main(String[] args) {
        Car Mercedes = new Car();
        Mercedes.carName = "G30";
        Mercedes.price = 1_00_00_000;
        System.out.println(Mercedes.carName);
        System.out.println(Mercedes.price);
    }
}

class domestic  {
    Car tata = new Car();

    public static void main(String[] args) {
        Car ae = new Car();
        ae.price = 10_00_000;
        ae.carName = "Maruti";
        System.out.println(ae.carName);
        System.out.println(ae.price);
    }
}

//Initializing through method
class StudentOne {
    String name;
    int rollNo;

    void insertRecord(int a, String b) {
        rollNo = a;
        name = b;
    }

    void displayInformation() {
        System.out.println(rollNo + " " + name);
    }
}

class TestStudent {
    public static void main(String[] args) {
        StudentOne testStudet = new StudentOne();
        testStudet.name = "Vaibhav";
        testStudet.rollNo = 22;
        System.out.println(testStudet.rollNo);
        System.out.println(testStudet.name);
        testStudet.displayInformation();
    }
}

class Employee {
    String name;
    int id;
    float salary;

    void insert(int i, String nam, float sa) {
        id = i;
        name = nam;
        salary = sa;
    }
    void  disaplay(){
        System.out.println(id + " " + name + " " + salary);
    }
}
class TestEmp {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
                e1.insert(1, "EMP1", 22000);
                e2.insert(2,"Emp2", 50000);
                e3.insert(3,"EMp3",40000);
                e1.disaplay();
                e2.disaplay();
                e3.disaplay();
    }
}
class Rectangle {
    int length;
    int bredth;
    void enter(int l, int b) {
        length = l;
        bredth = b;
    }
    void calculateArea() {
        System.out.println(bredth * length);
    }
}
class  RectangleOne {
    public static void main(String[] args) {
        Rectangle smallRectangle = new Rectangle(), bigRectangle = new Rectangle();
        smallRectangle.length = 22;
        smallRectangle.bredth = 20;
        bigRectangle.length = 40;
        bigRectangle.bredth = 45;
        smallRectangle.calculateArea();
        bigRectangle.calculateArea();
    }
}
class Calculation {
    void fact(int n) {
        int fact = 1;
        for(int i=1;i<=n;i++) {
            fact = fact*i;
        }
        System.out.println("Factorial is "+ fact);
    }

    public static void main(String[] args) {
      new Calculation().fact(4);
    }
}

class  Account {
    int accNo;
    String personName;
    float amount;
    void insert(int an, String pN, float amt) {
        accNo = an;
        personName = pN;
        amount = amt;

    }
    void deposite(float amt) {
        amount=amount + amt;
        System.out.println(amt + "deposited");
    }
    void  withDraw(float amt) {
        if(amount<amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + "withdrawn");
        }
    }
    void checkBalance(){System.out.println("Balanece is " + amount);}
    void display(){System.out.println(accNo+ " "+personName+" "+ amount);}
}
class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(454324,"amit", 5000);
        a1.display();
        a1.checkBalance();
        a1.withDraw(2000);
        a1.checkBalance();
    }
}
class Dog {
    String name, breed, color;
    int age, weight;
    public Dog(String name, String breed, String color, int age, int weight) {
        this.age = age;
                this.breed = breed;
                this.name = name;
                this.color = color;
                this.weight = weight;
    }
//    public  String getName() { return name; }
//    public  String getBreed() { return  breed; }
//    public  String getColor() { return  breed;}
//    public  int getAge() { return  age;}
//    public  int getWeight() { return weight;}
     public  String  toString() {
        return  ("Hi my naem " + this.name + "My bree is " + breed  + " My color is " + color + " My Age is " + age + " my weight is " + 33);
    }

    public static void main(String[] args) {
        Dog meon = new Dog("Meon","Pomerian","White", 3,33);
        System.out.println(meon.toString());
    }
}
class Newday {
    void doSometing(String nam) {
       nam =   "esf";
    }

    public static void main(String[] args) {
        Newday mam = new Newday();
        String som = "mknjkn";
        mam.doSometing(som);
        System.out.println(som);
    }
}
final  class Custom {
      String nameing;
    int value;

    public static void main(String[] args) {
        Custom ne = new Custom();
        ne.nameing = "Menbers";
        ne.value = 12344;
    }
}