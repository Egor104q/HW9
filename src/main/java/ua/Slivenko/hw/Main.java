package ua.Slivenko.hw;

public class Main {
    public static void main(String[] args) {

        Converter converter = new Converter();
        ChessBoard chessBoard = new ChessBoard(converter);


        int index1 = chessBoard.convert("A3");
        System.out.println("index A3 = " + index1);
        int index2 = chessBoard.convert("B6");
        System.out.println("index B6 = " + index2);
    }
}
