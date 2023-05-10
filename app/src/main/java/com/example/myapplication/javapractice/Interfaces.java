package com.example.myapplication.javapractice;

public class Interfaces {
    interface Animal {
        public void animalSound();

        public void sleep();
    }

    interface AnimalTwo {
        static void animalType() {
            System.out.println("The animal Type");
        }
    }
    static class Pig implements Animal, AnimalTwo {

        public void animalSound() {
            System.out.println("The pig says: Wee Wee");
        }

        public void sleep() {
            System.out.println("The Pig is sleeping : Zzz");
        }

        public void animalType() {
            //System.out.println("The animal is wild animal");
        }
    }

    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        myPig.animalType();

    }
}

interface Printable {
    void print();
}

interface Showable {
    void print();
}

class MultipleTestInterface implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MultipleTestInterface test = new MultipleTestInterface();
        test.print();
    }
}

interface Engine {
    void changeGear(int a);

    void speedUp(int b);
}

class CarEngine implements Engine {
    int gear, speed;

    @Override
    public void changeGear(int a) {
        this.gear = a;
        System.out.println("The car Engine gear is " + gear);
    }

    @Override
    public void speedUp(int b) {
        this.speed = b;
        System.out.println("The car Engine Speed is " + speed);

    }

    public static void main(String[] args) {
        CarEngine carTest = new CarEngine();
        carTest.changeGear(2);
        carTest.speedUp(70);
    }
}

abstract class EmployeeDetails {
    private String name;
    private int emp_id;

    public void commonEmpDetails() {
        System.out.println("The Employee name is " + name);
        System.out.println("The Employee id is " + emp_id);
    }
    public abstract void confedentialDetails(String s, int p );
}
class Hr extends EmployeeDetails {
    private  int salary;
    private  String performance;
    @Override
    public void confedentialDetails(String s, int p) {
        this.salary = p;
        this.performance = s;
        System.out.println("Salary "+ p);
        System.out.println("Performance " + s);
    }
    public static void main(String[] args) {
     Hr checkDetails = new Hr();
     checkDetails.confedentialDetails("Excellent", 200000);
    }
}
interface StaticInterface {
    static void printDetails(){
        System.out.println("My name is ");
    }
}
class ApplyInterface implements StaticInterface {
    public static void main(String[] args) {
        StaticInterface.printDetails();
    }
}
interface MathOperation {
    void add(int noOne, int noTwo);
    void sub(int noOne, int noTwo);
}
class DoMath implements MathOperation {

    @Override
    public void add(int noOne, int noTwo) {
        System.out.println("The sum of numbers is " + (noOne + noTwo));
    }

    @Override
    public void sub(int noOne, int noTwo) {
        System.out.println("The Substraction is " + (noOne-noTwo));
    }

    public static void main(String[] args) {
        DoMath add = new DoMath();
        add.add(123,321);
        add.sub(321,123);
    }
}