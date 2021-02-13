package CarClass;

import java.util.concurrent.Callable;

public class Car {
    private String nameOfCylinders;
    private int numberOfCylinders;
    private int wheels;
    private boolean engine;

    public Car(String nameOfCylinders, int numberOfCylinders, int wheels, boolean engine) {
        this.nameOfCylinders = nameOfCylinders;
        this.numberOfCylinders = numberOfCylinders;
        this.wheels = wheels;
        this.engine = engine;
    }

    public String startEngine(){
        return getClass().getSimpleName()  + "-> startEngine()";
    }

    public void accelerate(int velocity, int direction){
        int speed = velocity * direction;
        System.out.println("the car is accelerating at a speed of: " + speed + "m/s");
    }

    public void brake(int velocity , int direction){
        int speed = velocity * direction;
        int reduceSpeed = speed/2;
        System.out.println("the car is braking at a reduced speed of : " + reduceSpeed + "m/s");
    }

    public String getNameOfCylinders() {
        return nameOfCylinders;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}

class Jaguar extends Car{

    private String model;
    private int doors;


    @Override
    public String startEngine() {
        System.out.println("push button to start Jaguar Engine");
        return super.startEngine();
    }

    @Override
    public void accelerate(int velocity, int direction) {
        int speed = ( 2 * velocity) * direction;
        System.out.println("The car is accelerating at a speed of : " + speed + "m/s");
    }

    @Override
    public void brake(int velocity, int direction) {
        System.out.println("jaguar steps on brakes");
        super.brake(velocity, direction);
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public Jaguar(String model, int doors) {
        super("SpeedRacer Sports", 12, 4, true);

        this.doors = 2;
        this.model= model;
    }

}

class ferrari extends Car {

    private int doors;
    private String model;


    @Override
    public String startEngine() {
        System.out.println("ferrari engine starts");
        return super.startEngine();
    }

    @Override
    public void accelerate(int velocity, int direction) {
        System.out.println("ferrari increases speed");
        super.accelerate(velocity, direction);
    }

    @Override
    public void brake(int velocity, int direction) {
        System.out.println("ferrari steps on brakes");
        super.brake(velocity, direction);
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }

    public ferrari(int doors, String model) {
        super("Voltron Speed Racers", 24, 4, true);
        this.doors = 4;
        this.model = model;


    }
static class Main {

    public static void main(String[] args) {


        Car car = new Car("Speed Racers", 12, 4, true);
        car.startEngine();
        System.out.println("*****************");
        car.accelerate(120,23);
        System.out.println("*******************");
        car.brake(124,23);
        System.out.println("*****************");

        Jaguar jaguar = new Jaguar("Fierce", 2);
        jaguar.startEngine();
        System.out.println("******************");
        jaguar.accelerate(124,2);
        System.out.println("*******************");
        jaguar.brake(123,5);

    }
    }


}
