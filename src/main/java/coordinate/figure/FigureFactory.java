package coordinate.figure;

import coordinate.Coordinate;

import java.util.List;

public class FigureFactory {

    public Figure createFigure(List<Coordinate> coordinates) {
        if(coordinates.size() == 2) {
            return new Line(coordinates);
        }
        if(coordinates.size() == 4) {
            return new Square(coordinates);
        }

        return new DefaultFigure();
    }
}
