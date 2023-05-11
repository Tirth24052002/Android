package com.example.myapplication.javapractice;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Abstraction {
    public static void main(String[] args) {
        Animal newAnimal = new Pig();
        newAnimal.animalSound();
        newAnimal.sleep();
    }

    public static abstract class Animal {
        public abstract void animalSound();

        public void sleep() {
            System.out.println("Animal is Sleeping...");
        }
    }

    static class Pig extends Animal {
        public void animalSound() {
            System.out.println("Mahhhhhh..... Mahhhhhh....");
        }
    }
}

abstract class Veh {
    abstract void run();
}

class pulser extends Veh {
    void run() {
        System.out.println("Running Safely");
    }

    public static void main(String[] args) {
        Veh obj = new pulser();
        obj.run();
    }
}

abstract class Vehiclz {
    String model, color;
    FuelType fuelType;

    enum FuelType {
        petrol, diesel
    }

    abstract void startEngine();

    public String toString() {
        return color + " " + model + " runs on " + fuelType;
    }
}

class Scorpio extends Vehiclz {
    Scorpio(String model, String color, FuelType fuelType) {
        this.color = color;
        this.model = model;
        this.fuelType = fuelType;
    }

    @Override
    void startEngine() {
        System.out.println(this + "\nStarts engine");
    }
}

class AbstarctCar {
    public static void main(String[] args) {
        Scorpio scorp = new Scorpio("Scorpio Classic", "Black", Vehiclz.FuelType.diesel);
        scorp.startEngine();
    }
}

abstract class MathRequirement {
    abstract void add(int a, int b);

    abstract void sub(int c, int d);

    void div(int a, int b) {
        System.out.println(a / b);
    }
}

class DoCalculations extends MathRequirement {
    public static void main(String[] args) {
        DoCalculations addition = new DoCalculations();
        addition.add(123, 321);
        addition.sub(321, 123);
        addition.div(22, 2);
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void sub(int c, int d) {
        System.out.println(c - d);
    }
}

abstract class AnimalInJungle {
    public static void main(String[] args) {
        String type;
        int weight;
    }
}

abstract class Fish {
    final String name;
    String[] funfacts;

    public static void main(String[] args) {

    }
    protected Fish(String name) {
        this.name = name;
    }

    void swim() {
        System.out.println(this + "is swimming }");
    }

    public String toString() {
        return "Fish{" + "name= " + name + (funfacts == null ? "" : ", funfacts" + Arrays.toString(funfacts));
    }

    static void whois() {
        System.out.println("This is fish");
    }
}

class Shark extends Fish {
    Shark(String name) {
        super(name);
        funfacts = new String[]{"Sharks are very good at adapting environments"};
    }
}

interface Flyable {
    void fly();

    static boolean canFly() {
        return true;
    }
}

class FlyingFish extends Fish implements Flyable {
    FlyingFish(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this + " is flying } " );
    }
}
class TestInterface {
    public static void main(String[] args) {
        Fish shark = new Shark("pica");
        shark.swim();

        FlyingFish flyFish = new FlyingFish("nemo");
        flyFish.fly();

        Fish.whois();
        System.out.println("Fish can fly" + Flyable.canFly());

    }
}