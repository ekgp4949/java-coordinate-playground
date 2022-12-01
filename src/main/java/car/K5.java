package car;

public class K5 implements Car {
    private final static int DISTANCE_FOR_LITER = 13;
    private final int tripDistance;
    public K5(int distance) {
        this.tripDistance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return DISTANCE_FOR_LITER;
    }

    @Override
    public double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
