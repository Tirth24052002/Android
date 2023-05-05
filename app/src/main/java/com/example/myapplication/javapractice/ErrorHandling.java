package com.example.myapplication.javapractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorHandling {

    public static void main(String[] args) {
        try {
            //  throwDevisonByException();
            throwFileNotFoundException();
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Use of finally to clean up resources ");
        }
        //Nested try catch
        try {
            try {
                throw new ArrayIndexOutOfBoundsException(1);
            } catch (ArithmeticException ae) {
                System.out.println("Some arithmetic exception occured");
            } finally {
                System.out.println("The Nested try Catch");
            }
        } catch (Exception e) {
            System.out.println("Some Erroe occures!" + e.getLocalizedMessage());
        } finally {
            System.out.println("Outer Finally");
        }
    }

    static class NullClass {
        String noName;
    }

    static void throwFileNotFoundException() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("no-such-file.txt");
    }

    static void throwDevisonByException() {
        int dividedByZeo = 50 / 0;
    }

    static void throwsNPE() throws NullPointerException {
        NullClass nullClass = null;
        nullClass.noName = "Some Name";
    }

    static void throwOutOfMemoryError() throws OutOfMemoryError {
        throw new OutOfMemoryError();
    }
}

class UserCustomException {
    public static void main(String[] args) {
        try {
            throw new NewException(5);
        } catch (NewException ex) {
            System.out.println(ex);
        }
    }
}

class NewException extends Exception {
    int x;

    NewException(int y) {
        x = y;
    }

    public String toString() {
        return ("Exception value =" + x);
    }
}

class ExceptionOne {
    public static void main(String[] args) {
        try {
            getInt();
        } catch (NumberFormatException nfe) {
            System.out.println("The input is not the Integer");
        } finally {
            System.out.println("Finally will always execute");
        }
        System.out.println("The execution ends here");
    }
    private static  void getInt() {
        int myInt = Integer.parseInt("pants");
    }
}
class ExceptionError {
    public static void main(String[] args) {
    }
}