package ua.Slivenko.hw;

public class Converter {

    String letterCoordinates = "ABCDEFGH";
    String numberCoordinates = "12345678";

    public int convert(String position) {
        char letter = position.charAt(0);
        char number = position.charAt(1);
        System.out.println("letter = " + letter + ", " + "number = " + number);
        int row = letterCoordinates.indexOf(letter);
        System.out.println("row = " + row);
        int col = numberCoordinates.indexOf(number);
        System.out.println("col = " + col);
        return row * 8 + (col + 1);
//        return row * 8 + Character.getNumericValue(number);
    }
}
