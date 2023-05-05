package com.example.myapplication.javapractice;

public class DecisionStatements {
    public static void main(String[] args) {
        int i = -1;
        if (i < 20) {
            if (i < 15) {
                System.out.println("the num is less than 15");
            } else {
                System.out.println("The num is less than 20");
            }
        } else if (i <= 50) {
            System.out.println("The number is more than 20 and less than 50");
        } else if (i <= 80) {
            System.out.println("The number is less than 80");
        } else if (i <= 100) {
            System.out.println("The number is less than 100");
        } else {
            System.out.println("The number is greater than 100");
        }
        int day = 9;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not Present");
        }
        int num = 40;
        for (int z = 0; z < num; z++) {
            if (z % 2 != 0 )
                continue;
            System.out.println(z + " ef");
        }
        boolean t = true;
        System.out.println("Before the return");
    }
}
