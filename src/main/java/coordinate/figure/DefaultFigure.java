package coordinate.figure;

public class DefaultFigure extends Figure{
    @Override
    public String getName() {
        return "좌표";
    }

    @Override
    public String getCalculateType() {
        return "좌표";
    }

    @Override
    public double getCalculateResult() {
        return 0;
    }

    @Override
    public String toString() {
        return "좌표입니다.";
    }
}
