package com.example.myapplication.javapractice;
public class Operators {
    public static void main(String[] args) {
        System.out.println(2 + 2);
        System.out.println(2 - 1);
        System.out.println(3 + 1);
        System.out.println(32 % 3);
        int num1 = 5;
        System.out.println("Post Increment" + num1++);
        System.out.println("Increment" + num1);
        System.out.println("Pre Increment:" + ++num1);
        System.out.println("Increment:" + num1);
        System.out.println(1 == 1);
        System.out.println(1 == Integer.parseInt("1"));
        System.out.println(2 > 0);
        System.out.println(9 < 100);

        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is " + b);
        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is :" + b);

        String color = "Red";
        String colorCheck = "Reds";
        color = (colorCheck == "Red") ? "True" : "false";
        System.out.println(color);

        String name = "James";
        boolean result = name instanceof String;
        System.out.println(result);

        Vehicle aa = new Vehicle();
        boolean rest = aa instanceof Vehicle;
        System.out.println(rest);

        boolean thePersonWord = false;
        String justice = thePersonWord ? "Innocent" : "Jail";
        System.out.println(justice);

        // Urinary Operator
        int i = 100;
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(--i);

        int ab = 10;
        int ac = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);
        System.out.println(ab++ + ac++);
        System.out.println(ab++ + ab++);
        System.out.println(ab-- + ab--);
        System.out.println(10<<2);
        System.out.println(10<<4);
        System.out.println(20<<2);
        int ad = 12;
        ad += 2;
        System.out.println(ad);
        ad -= 1;
        System.out.println(ad);
        ad *= 2;
        System.out.println(ad);
        ad /= 2;
        System.out.println(ad);
        int x = 11, y = 12, z = 10;
        System.out.println(x<y&&z<y);
        System.out.println(z<y||x>y);
        System.out.println(z<y&&x>y);
    }
}
