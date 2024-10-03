class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();   
        Vehicle myBike = new Bike();

        myCar.start();   
        myBike.start(); 
    }
}