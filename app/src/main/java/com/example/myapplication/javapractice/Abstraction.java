package com.example.myapplication.javapractice;
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
abstract  class Veh {
 abstract void run();
}
class pulser extends  Veh {
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

 enum  FuelType {
   petrol, diesel
 }

 abstract void startEngine();
  public String toString() {
  return  color + " " + model + " runs on " + fuelType;
 }
}
class Scorpio extends  Vehiclz {
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