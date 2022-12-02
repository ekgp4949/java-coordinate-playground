package coordinate.axis;

public class XAxis {
    private final int location;
    public XAxis(int location) {
        if(location < 0 || location > 24) {
            throw new RuntimeException("x좌표는 0~24 사이여야 합니다.");
        }
        this.location = location;
    }

    private int getLocation() {
        return this.location;
    }

    public int getDistanceTo(XAxis targetXAxis) {
        return Math.abs(this.location - targetXAxis.getLocation());
    }
}
