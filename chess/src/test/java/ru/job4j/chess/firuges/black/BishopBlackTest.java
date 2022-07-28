package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void bishopBlackposition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        bishopBlack.position();
        assertThat(bishopBlack.position(), is(Cell.F8));
    }

    @Test
    public void bishopBlackWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(result, expected);
    }

    public void testIsDiagonal() {
    }

    @Test
    public void bishopBlackCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure f = bishopBlack.copy(Cell.F8);
        assertThat(bishopBlack.position(), is(f.position()));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void bishopBlackIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G4);
    }
}