import coordinate.Coordinate;
import coordinate.axis.XAxis;
import coordinate.axis.YAxis;
import coordinate.figure.Figure;
import coordinate.figure.FigureFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class CoordinateTest {
    //사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
    //좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
    //X, Y좌표 모두 최대 24까지만 입력할 수 있다.
    //입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
    //정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.
    //좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
    //직선인 경우는 두 점 사이 거리를 계산해서 출력한다.


    @Test
    void calculateDistanceBetweenTwoXAxis() {
        XAxis xAxis = new XAxis(1);
        int xDistance = xAxis.getDistanceTo(new XAxis(2));

        assertThat(xDistance).isEqualTo(1);
    }

    @Test
    void calculateDistanceBetweenTwoCoordinate() {
        Coordinate firstCoordinate = Coordinate.create(new XAxis(1), new YAxis(1));
        Coordinate secondCoordinate = Coordinate.create(new XAxis(2), new YAxis(2));

        double distance = firstCoordinate.calculateDistanceTo(secondCoordinate);

        assertThat(distance).isEqualTo(1.414, offset(0.00099));
    }

    @Test
    void calculateDistanceByFigureFactory() {
        Coordinate firstCoordinate = Coordinate.create(new XAxis(1), new YAxis(1));
        Coordinate secondCoordinate = Coordinate.create(new XAxis(2), new YAxis(2));

        FigureFactory figureFactory = new FigureFactory();
        Figure figure = figureFactory.createFigure(List.of(firstCoordinate, secondCoordinate));

        double result = figure.getCalculateResult();
        assertThat(result).isEqualTo(1.414, offset(0.00099));
    }

    @Test
    void calculateLineDistance() {
        Coordinate firstCoordinate = Coordinate.create(new XAxis(1), new YAxis(1));
        Coordinate secondCoordinate = Coordinate.create(new XAxis(2), new YAxis(2));

        double result = CoordinateCalculator.calculate(List.of(firstCoordinate, secondCoordinate));

        assertThat(result).isEqualTo(1.414, offset(0.00099));
    }

    @Test
    void throwAxisRangeException() {
        assertThatThrownBy(() -> new XAxis(-1))
                .isInstanceOf(RuntimeException.class);
        assertThatThrownBy(() -> new XAxis(25))
                .isInstanceOf(RuntimeException.class);
    }
}
