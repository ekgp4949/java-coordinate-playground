import coordinate.Coordinate;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SquareTest {
    //좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
    //좌표값을 네 개 입력한 경우, 네 점을 연결하는 사각형으로 가정한다.
    //네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용하도록 검사한다.
    //사각형인 경우 사각형의 넓이를 계산해서 출력한다.

    @Test
    void calculateSquareArea() {
        Coordinate coordinate1 = Coordinate.create(1, 1);
        Coordinate coordinate2 = Coordinate.create(1, 2);
        Coordinate coordinate3 = Coordinate.create(2, 1);
        Coordinate coordinate4 = Coordinate.create(2, 2);

        int result = (int)CoordinateCalculator.calculate(List.of(coordinate1, coordinate2, coordinate3, coordinate4));
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void calculateArea() {
        Coordinate coordinate1 = Coordinate.create(1, 1);
        Coordinate coordinate2 = Coordinate.create(1, 2);
        Coordinate coordinate3 = Coordinate.create(2, 1);
        Coordinate coordinate4 = Coordinate.create(2, 2);

        int result = (int)CoordinateCalculator.calculate(List.of(coordinate1, coordinate2, coordinate3, coordinate4));
        Assertions.assertThat(result).isEqualTo(1);
    }
}
