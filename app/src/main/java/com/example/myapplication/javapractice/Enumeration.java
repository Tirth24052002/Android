package com.example.myapplication.javapractice;

public class Enumeration {
    public static void main(String[] args) {
        Colors checkRes = Colors.Red;
        System.out.println(checkRes);
    }
}

enum Colors {
    Red,
    White,
    Black,
    Orange;
}

enum Levels {
    low,
    medium,
    high
}

class SwitchWithEnum {
    public static void main(String[] args) {
        Levels currentLevel = Levels.low;
        switch (currentLevel) {
            case low:
                System.out.println("Low level");
                break;
            case medium:
                System.out.println("Medium Level");
                break;
            case high:
                System.out.println("High Level");
        }
        for (Levels allLec : Levels.values()) {
            System.out.println(allLec);
        }
    }
}

class EnumExample {
    enum Season {
        Winter,
        Spring,
        Summer,
        fall
    }

    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }
        for (numbers no : numbers.values()) {
            System.out.println(no);
        }
        System.out.println(Season.valueOf("Winter"));
        System.out.println(Season.valueOf("Summer").ordinal());
        System.out.println("The index of fall is " + Season.valueOf("fall").ordinal());
    }

    enum numbers {
        one, two, three, four, five
    }
}

class ExampleFOUR {
    enum Season {
        WINTER(5), SPRING(10), SUMMER(15), FALL(33);
        private int value;

        private Season(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.value);
        }
    }
}

