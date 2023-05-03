package com.example.myapplication.javapractice;
public class Polymorphism {
}
class Vehicle{
    String company, model;
    int price, milage;
    void getDetails(String company, String model, int price, int milage) {
        this.milage = milage;
        this.model = model;
        this.company = company;
    }
    String getDetails() {
        return "The Car name is " + company + " the car model is " + model + " the car price is " + price + "the car milage is " + milage;
    }

    public static void main(String[] args) {
        Vehicle Gtr = new Vehicle();
        Gtr.company = "nissan";
        Gtr.milage = 22;
        Gtr.model = "Model";
        Gtr.price = 2000000;
        System.out.println(Gtr.getDetails());
    }
}
//
class Bike {
    void  run(){ System.out.println("Running");}
}
class Splendor extends  Bike {
    void  run(){System.out.println("Running Dangerously at 100Km/hr");}

    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }
}
class Bank {
    float getRateOfinterst() {return  0;}
}
class  SBI extends Bank {
    float getRateOfinterst() {
        return 8.4f;
    }
}
class ICIC extends  Bank {
    float getRateOfinterst() {
        return 7.3f;
    }
}
class AXIS extends Bank {
    float getRateOfinterst() {
        return 9.7f;
    }
}
class TestPolymerphism {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI rate of intrest: " + b.getRateOfinterst());
        b = new ICIC();
        System.out.println("ICICI Rate of interst:" + b.getRateOfinterst());
        b = new AXIS();
        System.out.println("Axis Bank rate of intrest: " + b.getRateOfinterst());
    }
}
class BankingSystem {
    String name;
    int blance;
    static double accountNumber;

    public static void main(String[] args) {
        new BankingSystem();
        System.out.println(accountNumber);
    }
}
class Animals {
    void  eat() {
        System.out.println("Animal eating food");
    }
}
class Goat extends  Animals {
    @Override
    void eat() {
        System.out.println("GOAT is eating grass");
    }
}
class Lion extends Animals {
    @Override
    void eat() {
        System.out.println("The Lion is king of the jungle");
    }
}
class Poly {
    public static void main(String[] args) {
        Animals got = new Goat();
        got.eat();
        Animals[] animals = { new Goat(), new Lion()};
        for (Animals animal: animals){
            animal.eat();
        }
    }
}