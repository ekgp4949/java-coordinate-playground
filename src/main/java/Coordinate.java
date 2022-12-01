import axis.XAxis;
import axis.YAxis;

public class Coordinate {

    private final XAxis xAxis;
    private final YAxis yAxis;

    public Coordinate(XAxis xAxis, YAxis yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public static Coordinate create(XAxis xAxis, YAxis yAxis) {
        return new Coordinate(xAxis, yAxis);
    }


    public double calculateDistanceTo(Coordinate targetCoordinate) {
        return Math.sqrt(
                Math.pow(xAxis.getDistanceTo(targetCoordinate.xAxis), 2)
                        + Math.pow(yAxis.getDistanceTo(targetCoordinate.yAxis), 2)
        );
    }
}
