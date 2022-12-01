package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerUtil {

    private final static String SEPERATOR = "-";

    private final Scanner scanner;

    public ScannerUtil(Scanner scanner) {
        this.scanner = scanner;
    }

    public void close() {
        this.scanner.close();
    }

    public InputCoordinates getCoordinatesFromScanner() {
        //(10,10)-(14,15)

        InputCoordinates coordinates = new InputCoordinates();
        String input = this.scanner.nextLine();
        String[] inputs = input.split(SEPERATOR);
        for (String s : inputs) {
            String[] splits = s.split(",");
            coordinates.addCoordinate(new int[] {
                    Integer.parseInt(splits[0].substring(1)),
                    Integer.parseInt(splits[1].substring(0, splits[1].length()-1))
            });
        }

        return coordinates;
    }
}
