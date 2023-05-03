package com.example.myapplication.javapractice;
public class Abstraction {

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