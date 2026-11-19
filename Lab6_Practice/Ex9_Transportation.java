import java.util.ArrayList;

abstract class Transport {
    protected double distance;

    Transport(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    void displayFare() {
        System.out.printf("%-15s distance: %5.1f km -> fare: $%.2f%n",
                getClass().getSimpleName(), distance, calculateFare());
    }
}

class BusTransport extends Transport {
    BusTransport(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 1.5;
    }
}

class MetroTransport extends Transport {
    MetroTransport(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return 10 + (distance * 2);
    }
}

class TaxiTransport extends Transport {
    TaxiTransport(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return 20 + (distance * 5);
    }
}

public class Ex9_Transportation {
    public static void main(String[] args) {
        ArrayList<Transport> trips = new ArrayList<>();
        trips.add(new BusTransport(10));
        trips.add(new MetroTransport(8));
        trips.add(new TaxiTransport(5));
        trips.add(new BusTransport(25.5));
        trips.add(new TaxiTransport(12));

        for (Transport t : trips) {
            t.displayFare();
        }
    }
}
