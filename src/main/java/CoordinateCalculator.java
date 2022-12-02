import coordinate.Coordinate;
import coordinate.figure.Figure;
import coordinate.figure.FigureFactory;
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

    private static void execute(ScannerUtil scannerUtil) {
        InputView inputView = new InputView();
        inputView.start();

        InputCoordinates inputCoordinates = scannerUtil.getCoordinatesFromScanner();

        List<Coordinate> coordinates = inputCoordinates.getCoordinates();

        FigureFactory figureFactory = new FigureFactory();
        Figure figure = figureFactory.createFigure(coordinates);

        OutputView outputView = new OutputView(inputCoordinates, figure);
        outputView.print();
    }

    public static double calculate(List<Coordinate> coordinates) {
        FigureFactory figureFactory = new FigureFactory();
        Figure figure = figureFactory.createFigure(coordinates);
        return figure.getCalculateResult();
    }
}
