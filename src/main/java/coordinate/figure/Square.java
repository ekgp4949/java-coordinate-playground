package coordinate.figure;

import coordinate.Coordinate;

import java.util.List;
import java.util.stream.Stream;

public class Square extends Figure {
    private final List<Coordinate> coordinates;
    public Square(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String getName() {
        return "사각형";
    }

    @Override
    public String getCalculateType() {
        return "넓이";
    }

    @Override
    public double getCalculateResult() {
        double firstLine = coordinates.get(0).calculateDistanceTo(coordinates.get(1));
        double secondLine = coordinates.get(0).calculateDistanceTo(coordinates.get(2));
        double thirdLine = coordinates.get(0).calculateDistanceTo(coordinates.get(3));

        return Stream.of(firstLine, secondLine, thirdLine)
                       .sorted()
                       .limit(2)
                       .reduce(1d, (a, b) -> a * b);
    }
}
