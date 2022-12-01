package car;

public class Sonata implements Car {
    private final static int DISTANCE_FOR_LITER = 10;
    private final int tripDistance;
    public Sonata(int distance) {
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
        return "Sonata";
    }
}
