package car;

public class Avante implements Car {
    private final static int DISTANCE_FOR_LITER = 15;
    private final int tripDistance;
    public Avante(int distance) {
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
        return "Avante";
    }
}
