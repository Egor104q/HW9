package ua.Slivenko.hw;
public class ChessBoard {
    private Converter converter;

    public ChessBoard() {
    }

    public ChessBoard(Converter converter) {
        this.converter = converter;
    }



    public int convert(String position) {
        return converter.convert(position);
    }
}
