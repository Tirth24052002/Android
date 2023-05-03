package com.example.myapplication.javapractice;
public class Inheritance {
}
    // Inhertance
    class Animal {
        void eat(){ System.out.println("eating...");}
    }
    class Doggy extends  Animal {
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
        void  msg() {
            System.out.println("Hello!");
        }
    }
    class B {
        void  msg() {
            System.out.println("Welcome");
        }
    }
//class C extends A, B {}
//Multiple Inheritance is not possible in java
//Only multilevel inheritance is possible

