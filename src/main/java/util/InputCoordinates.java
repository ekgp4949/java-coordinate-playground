package util;

import Coordinate.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class InputCoordinates {
    private final List<int[]> coordinates = new ArrayList<>();

    public List<int[]> getCoordinatesInts() {
        return coordinates;
    }

    public List<Coordinate> getCoordinates() {
        List<Coordinate> coordinateList = new ArrayList<>();
        for (int[] coordinate : coordinates) {
            coordinateList.add(Coordinate.create(coordinate[0], coordinate[1]));
        }
        return coordinateList;
    }

    public void addCoordinate(int[] coordinate) {
        if(coordinate.length != 2) {
            throw new RuntimeException("올바른 좌표 값이 아닙니다.");
        }
        this.coordinates.add(coordinate);
    }
}
