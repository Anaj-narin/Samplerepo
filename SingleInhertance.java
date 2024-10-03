
class Vechicle {
    
    public void Start() {
        System.out.println("Vechicle can Start");
    }
}


class Car extends Vechicle {
    
    public void Honk() {
        System.out.println("Car Honks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        
        
        myCar.Start(); 
        myCar.Honk();  
    }
}