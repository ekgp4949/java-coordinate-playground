package car;

public class K5 extends Car {
    private final static double DISTANCE_FOR_LITER = 13;
    private final int tripDistance;

    public K5(int distance) {
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
        return "K5";
    }
}
