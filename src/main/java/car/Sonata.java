package car;

public class Sonata extends Car {
    private final static double DISTANCE_FOR_LITER = 10;
    private final int tripDistance;

    public Sonata(int distance) {
        this.tripDistance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_FOR_LITER;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    String getName() {
        return "Sonata";
    }
}
