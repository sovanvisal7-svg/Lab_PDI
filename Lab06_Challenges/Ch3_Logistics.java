package Lab06_Challenges;
interface Trackable {
    void track();
}

abstract class DeliveryService {
    abstract double calculateEta();   
}

class CourierService extends DeliveryService implements Trackable {
    @Override
    public void track() {
        System.out.println("Courier: package is with the rider on Street 271.");
    }

    @Override
    double calculateEta() {
        return 3.0;
    }
}

class DroneDelivery extends DeliveryService implements Trackable {
    @Override
    public void track() {
        System.out.println("Drone: flying at 80 m altitude, GPS locked.");
    }

    @Override
    double calculateEta() {
        return 0.5;
    }
}

class CargoTruck extends DeliveryService implements Trackable {
    @Override
    public void track() {
        System.out.println("Cargo Truck: on National Road 4, 120 km remaining.");
    }

    @Override
    double calculateEta() {
        return 36.0;
    }
}

public class Ch3_Logistics {
    public static void main(String[] args) {
        DeliveryService[] services = { new CourierService(), new DroneDelivery(), new CargoTruck() };

        for (DeliveryService s : services) {
            ((Trackable) s).track();
            System.out.println("  ETA: " + s.calculateEta() + " hours");
        }
    }
}
