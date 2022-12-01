import Coordinate.Coordinate;
import Coordinate.Line;
import util.InputCoordinates;
import util.ScannerUtil;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Scanner;

public class CoordinateCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerUtil scannerUtil = new ScannerUtil(scanner);
        try {
            execute(scannerUtil);
        } catch (Exception e) {
            execute(scannerUtil);
        } finally {
            scannerUtil.close();
        }
    }

    public static void execute(ScannerUtil scannerUtil) {
        InputView inputView = new InputView();
        inputView.start();

        InputCoordinates inputCoordinates = scannerUtil.getCoordinatesFromScanner();

        List<Coordinate> coordinates = inputCoordinates.getCoordinates();
        Line line = getLine(coordinates.get(0), coordinates.get(1));

        OutputView outputView = new OutputView(inputCoordinates, line);
        outputView.print();
    }

    public static Line getLine(Coordinate firstCoordinate, Coordinate secondCoordinate) {
        return new Line(firstCoordinate.calculateDistanceTo(secondCoordinate));
    }
}
