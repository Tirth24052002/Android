package com.example.myapplication.javapractice;

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
final class Custom {
      String nameing;
    int value;

    public static void main(String[] args) {
        Custom ne = new Custom();
        ne.nameing = "Menbers";
        ne.value = 12344;
    }
}
class Abc {
    String name;
    int age;
    void details(String name, int age) {
        this.age = age;
        this.name = name;
    }
    void printDetails() {
        System.out.println("The Person Name is " + name + " Person Age is " + age );
    }


//    public static void main(String[] args) {
//        Abc Vivek = new Abc();
//        Vivek.age = 12;
//        Vivek.name = "Vivek Singh";
//        //Vivek.details(Vivek.name, Vivek.age);
//        Vivek.printDetails();
//    }
    class Xyz {
        Abc objOne = new Abc();
        public void main(String[] args) {
            objOne.name = "mohir";
            objOne.age = 22;
            objOne.printDetails();
            super.toString();
        }
    }

}
class Carz {
    String name = "Mercedes";
    int price = 3_00_000;
}
class CheckCar extends Carz {
    String name;
    void  someOtherColor() {
        System.out.println(super.name);
        System.out.println(super.price);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Carz mustinag = new Carz();
        System.out.println(mustinag.name);
        System.out.println(mustinag.price);
    }
}
 class TestCarz {
    static class engineDetails {
        int engineCapacity, engineHorsePower;
    }
     public static void main(String[] args) {
         Carz callCarz = new Carz();
         System.out.println(callCarz.name);
         System.out.println(callCarz.price);

     }
}
class otherCar extends  TestCarz {
    String aboutCar;

    public static void main(String[] args) {

    }
}

class JavaStaticExample {
   static String s = "The Static Data";
    static class NestedClass {
        public void show() {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        JavaStaticExample.NestedClass obj = new JavaStaticExample.NestedClass();
                obj.show();
    }
}
class  InheritStaticData extends  JavaStaticExample {
    static String otherStaticData;
    public static void main(String[] args) {
        JavaStaticExample.NestedClass getDat = new JavaStaticExample.NestedClass();
        getDat.show();
        otherStaticData = "The other Static Dat is intialized";
        System.out.println(otherStaticData);
    }

}

class InheritanceStaticMethod {
    void  printData() {
        System.out.println("The Data of Main Methos");
    }
}
class MethodOverride extends InheritStaticData {
    void printData() {
        super.toString();
        System.out.println("Get DAta");
    }
}
class Employ {
    private  float salary;
    Employ(float salary) {
        System.out.println("Emp Create!");
        this.salary = salary;
    }
    public float getSalary() {
        return  salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
class Programmer extends  Employ {
    int bonus;
    Programmer(float salary) {
        super(salary);
        this.bonus = 120_000;
        System.out.println("Programmer Created");
    }
}
class Inherit {
    public static void main(String[] args) {
        final Programmer Kimmich = new Programmer(10_00_000);
        System.out.println(Kimmich.bonus);
    }
}