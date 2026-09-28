class Vehicle{
    void start() {
        System.out.println("Vehicle starts");
    }
}
class Car extends Vehicle {
    void drive(){
        System.out.println("Car Is Driving");
    }
}
class Bike extends Vehicle{
    void ride(){
        System.out.println("Bike Is Riding");
    }
}
public class Inheritance2 {
    public static void main(String[] args){
        Car c = new Car();
        c.drive();
        c.start();

        Bike b = new Bike();
        b.start();
        b.ride();
    }
}
