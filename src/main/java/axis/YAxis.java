package axis;

public class YAxis {
    private final int location;
    public YAxis(int location) {
        if(location < 0 || location > 25) {
            throw new RuntimeException("Y좌표는 0~24 사이여야 합니다.");
        }
        this.location = location;
    }

    private int getLocation() {
        return this.location;
    }

    public int getDistanceTo(YAxis targetYAxis) {
        return Math.abs(this.location - targetYAxis.getLocation());
    }
}
