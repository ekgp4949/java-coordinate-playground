package coordinate.figure;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Figure {
    public abstract String getName();
    public abstract String getCalculateType();
    public abstract double getCalculateResult();

    @Override
    public String toString() {
        return this.getName() + "의 " + this.getCalculateType()+ "는 "+
                       BigDecimal.valueOf(this.getCalculateResult())
                               .setScale(6, RoundingMode.HALF_UP)
                               .doubleValue();
    }
}
