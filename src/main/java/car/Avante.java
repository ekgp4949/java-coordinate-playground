package car;

public class Avante extends Car {
    private final static double DISTANCE_FOR_LITER = 15;
    private final int tripDistance;

    public Avante(int distance) {
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
        return "Avante";
    }
}
