import coordinate.Coordinate;
import coordinate.figure.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FigureFactoryTest {


    static FigureFactory figureFactory;

    @BeforeAll
    static void setup() {
        figureFactory = new FigureFactory();
    }

    @Test
    void getLine() {
        Coordinate coordinate1 = Coordinate.create(1, 1);
        Coordinate coordinate2 = Coordinate.create(1, 2);

        Figure figure = figureFactory.createFigure(List.of(coordinate1, coordinate2));

        Assertions.assertThat(figure).isInstanceOf(Line.class);

    }

    @Test
    void getSquare() {
        Coordinate coordinate1 = Coordinate.create(1, 1);
        Coordinate coordinate2 = Coordinate.create(1, 2);
        Coordinate coordinate3 = Coordinate.create(2, 1);
        Coordinate coordinate4 = Coordinate.create(2, 2);

        Figure figure = figureFactory.createFigure(List.of(coordinate1, coordinate2, coordinate3, coordinate4));

        Assertions.assertThat(figure).isInstanceOf(Square.class);
    }

    @Test
    void getDefaultFigure() {
        Coordinate coordinate1 = Coordinate.create(1, 1);

        Figure figure = figureFactory.createFigure(List.of(coordinate1));

        Assertions.assertThat(figure).isInstanceOf(DefaultFigure.class);
    }

}
