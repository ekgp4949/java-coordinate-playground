package coordinate.figure;

import coordinate.Coordinate;

import java.util.List;

public class Line extends Figure {
    private final List<Coordinate> coordinates;
    public Line(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String getName() {
        return "두 점 사이";
    }

    @Override
    public String getCalculateType() {
        return "거리";
    }

    @Override
    public double getCalculateResult() {
        return coordinates.get(0).calculateDistanceTo(coordinates.get(1));
    }
}
