package com.example.myapplication.javapractice;

public class Inheritance {
}

// Inhertance
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Doggy extends Animal {
    void bark() {
        System.out.println("Barkking...");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Doggy d1 = new Doggy();
        d1.bark();
        d1.eat();
    }
}

class A {
    void msg() {
        System.out.println("Hello!");
    }
}

class B {
    void msg() {
        System.out.println("Welcome");
    }
}

//class C extends A, B {}
//Multiple Inheritance is not possible in java
//Only multilevel inheritance is possible
class Employees {
    private float salary;

    Employees(float salary) {
        System.out.println("emp created!");
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

class Programmers extends Employees {
    int bonus;

    Programmers(float salary) {
        super(salary);
        this.bonus = 100_000;
        System.out.println("Programmer Created!");

    }
}
class classInheritanceExp {
    public static void main(String[] args) {
        final Programmers anm = new Programmers(150_000);
        System.out.println(anm.bonus);
    }
}
class ParentsName {
    int age;
    void paretnName(String n) {
        System.out.println("The name of Parent is " + n);
    }
    ParentsName(int a){
        this.age = a;
        System.out.println("Age"+ a);
    }
}
class ChildClass extends ParentsName {
    ChildClass(int a) {
        super(a);
    }

    public ChildClass() {
        super(22);
    }

    public static void main(String[] args) {
        ChildClass cls = new ChildClass();
        cls.paretnName("Parent");
    }
}
class AnAnimal {
    String color = "Red";
    void eat(){
        System.out.println("The animal is eating");
    }
}
class AnimalDog extends AnAnimal {
    String color = "Black";
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
    void eat() {
        System.out.println("The animal is eating");
    }
    void  bark() {
        System.out.println("The animal is barking");
    }
    void work() {
        super.eat();
        bark();
    }
}
class TstSp {
    public static void main(String[] args) {
        AnimalDog d = new AnimalDog();
        d.printColor();
        d.work();
    }
}
