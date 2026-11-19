package Lab06_Challenges;
import java.util.ArrayList;

class RentalItem {
    protected String name;

    RentalItem(String name) {
        this.name = name;
    }

    double calculateCost(int days) {
        return 0;
    }
}

class CarRental extends RentalItem {
    CarRental(String name) {
        super(name);
    }

    @Override
    double calculateCost(int days) {
        return days * 40.0;
    }
}

class BikeRental extends RentalItem {
    BikeRental(String name) {
        super(name);
    }

    @Override
    double calculateCost(int days) {
        return days * 8.0;
    }
}

class ToolRental extends RentalItem {
    ToolRental(String name) {
        super(name);
    }

    @Override
    double calculateCost(int days) {
        return days * 12.0 + 5.0;     
    }
}

class CameraRental extends RentalItem {
    CameraRental(String name) {
        super(name);
    }

    @Override
    double calculateCost(int days) {
        return days * 25.0;
    }
}

public class Ch8_RentalSystem {
    public static void main(String[] args) {
        ArrayList<RentalItem> rentals = new ArrayList<>();
        rentals.add(new CarRental("Toyota Camry"));
        rentals.add(new BikeRental("Mountain Bike"));
        rentals.add(new ToolRental("Power Drill"));
        rentals.add(new CameraRental("Canon DSLR"));

        int days = 3;
        for (RentalItem r : rentals) {
            System.out.println(r.name + " (" + days + " days): $" + r.calculateCost(days));
        }
    }
}
