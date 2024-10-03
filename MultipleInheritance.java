class Vehicle {
    
    public void start() {
        System.out.println("Vehicle starts");
    }

interface Engine {
    
    void startEngine();
}


interface Horn {
    
    void honkHorn();
}


class Car extends Vehicle implements Engine, Horn {
    /
    public void startEngine() {
        System.out.println("Car engine starts");
    }

 
    public void honkHorn() {
        System.out.println("Car horn honks");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        
       
        myCar.start();       
        myCar.startEngine();  
        myCar.honkHorn();   
    }
}
}
