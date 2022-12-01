package car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private final List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }


    public void addCar(Car car) {
        this.cars.add(car);
    }

    public String generateReport() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars) {
            stringBuilder.append(car.getName());
            stringBuilder.append(" : ");
            stringBuilder.append((int)car.getChargeQuantity());
            stringBuilder.append("리터");
            stringBuilder.append(System.getProperty("line.separator"));
        }
        return stringBuilder.toString();
    }
}
