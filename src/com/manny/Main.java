package com.manny;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}
class Honda extends Car{

    public Honda(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Honda -> brake()";
    }
}

class Chevy extends Car{

    public Chevy(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Chevy -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Chevy -> accelerate()";
    }

    @Override
    public String brake() {
        return "Chevy -> brake()";
    }
}

class Audi extends Car{

    public Audi(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Audi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Audi -> brake()";
    }
}
public class Main {

    public static void main(String[] args) {
	// Challenge!
        // Create a base class call Car.
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake.
        //
        // Show a message for each in the base class
        // Now, create 3 subclasses for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // Put all classes in the one java file(this one).

        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Honda honda = new Honda(6, "Accord");
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());

        Chevy chevy = new Chevy(8, "Silverado");
        System.out.println(chevy.startEngine());
        System.out.println(chevy.accelerate());
        System.out.println(chevy.brake());

        Audi audi = new Audi(8, "R8");
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
    }


}


