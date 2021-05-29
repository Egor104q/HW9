package ua.Slivenko.hw;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)

public class ChessBoardMockTest {

    @InjectMocks
    ChessBoard chessBoard;

    @Mock
    Converter converter;

    @Test
    public void converter_nominal_first_cell() {
        when(converter.convert("A3")).thenReturn(3);
        int expectedOutput = 3;
        String input = "A3";
        int actualOutput = chessBoard.convert(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void converter_nominal_second_cell() {
        when(converter.convert("B6")).thenReturn(14);
        int expectedOutput = 14;
        String input = "B6";
        int actualOutput = chessBoard.convert(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

}
