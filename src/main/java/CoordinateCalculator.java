
public class CoordinateCalculator {
    public static Line getLine(Coordinate firstCoordinate, Coordinate secondCoordinate) {
        return new Line(firstCoordinate.calculateDistanceTo(secondCoordinate));
    }
}
