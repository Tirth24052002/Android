package com.example.myapplication.javapractice;
public class JavaKtQuestion {
    //1.) Access modifiers not understood
    //Private:only modifier in class
    //Default: It can be accessed inside the package
    //Protected: available in package and outside the package through sub class and inheritance.
    // If you do not make the child class it is not accessible outside the package
    //Public: It can be accessed from within the class, outside the class, within the package and outside the package.

    //2.) Open keyword not understood
    //Open — This is where you can access all data members and member functions
    // within the same module(target) and outside of it.
    // You can subclass or override outside the module(target).
    // Public — This is the same as open,
    // the only difference is you can't subclass or override outside the module(target).



}
class Constructing {
    //3.) Java constructors not understood
    public static void main(String[] args) {
        System.out.println();
    }
    String nam;
    int age;
    Constructing(String name, int age ) {
         name = this.nam;
         age = this.age;
    }
}
