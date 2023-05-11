package com.example.myapplication.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ControlFlow {
    public static void main(String[] args) {
        int number = 1;
        while (number < 10) {
            System.out.println(number);
            number++;
        }
        int i = 5;
        int j = 4;
        do {
            j = j + i;
            System.out.println(j);
        } while (j <= 10);

        int[] numList = {10, 30, 20, 40, 50};
        for (int k : numList) {
            System.out.println(k);
        }
        String[] names = {"A", "B", "C", "D", "E", "f"};
        for (String l : names) {
            System.out.println(l);
        }
        String s = null;
        try {
            throw new NullPointerException("Null Occurred");
        } catch (Exception e) {
            System.out.println("Catch block");
        }
        int c = 1;
        while (c < 5) {
            System.out.println("Count is " + c);
            c++;
        }
    }
}

class ForLoopExamples {
    public static void main(String[] args) {
        List<String> cars = new LinkedList<>();
        cars.add("One");
        cars.add("Two");
        cars.add("Three");
        cars.add("Four");
        for (String e : cars) {
            System.out.println(e);
        }
        for (String e : cars) {
            System.out.println(e);
        }
        ArrayList[] Num = new ArrayList[]{new ArrayList(10), new ArrayList(15)};
        String name[] = {"AAA", "BBB", "DDD", "FFF", "CCC"};
        Arrays.sort(name);
        for (String e: name) {
            System.out.println(e);
        }
    }
}
class ConditionalFoeLoops {
    public static void main(String[] args) {
        for(int i = 0;i <10;i++){
            if (i % 2 == 0) {
                System.out.println("The Even numbers are" + i);
            }
            else {
                System.out.println("The odd numbers are" + i);
            }
        }
        int z;
        for (z =0;z < 100; z++) {
            if(z % 5 == 0) {
                System.out.println("The number multiple of 5 is" + z);
            }
        }
        int one = 22, two = -1;
        if (one > 0 && two > 0) {
            System.out.println(one + two);
        }
        int x = 123, y = 321;
        if(x <y){
            System.out.println(y -x);
        }
    }
}