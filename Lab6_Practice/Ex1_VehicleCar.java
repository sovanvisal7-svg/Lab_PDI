class Vehicle {
    protected String brand;
    protected int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start() {
        System.out.println(brand + " (" + year + ") is starting.");
    }
}

class Car extends Vehicle {
    private int numDoors;

    Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    void honk() {
        System.out.println(brand + " with " + numDoors + " doors says: Beep beep!");
    }
}

public class Ex1_VehicleCar {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic", 2015);
        vehicle.start();

        Car car = new Car("Toyota", 2022, 4);
        car.start();   
        car.honk();    
    }
}
