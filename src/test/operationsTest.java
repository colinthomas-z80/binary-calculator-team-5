package java;

import org.junit.Test;
import org.junit.Assert;

import java.operations;

public class operationsTest {
    @Test
    public void testBdivide() {
        Assert.assertEquals("1100", operations.Bdivide("1111000", "1010"));
    }
    @Test
    public void testBsubtract() {
        Assert.assertEquals("1010", operations.Bsubtract("1111", "101"));
    }
    @Test
    public void testBsquare() {
        Assert.assertEquals("10000", operations.Bsquare("100"));
    }
    @Test
    public void testBroot() {
        Assert.assertEquals("100", operations.Broot("10000"));
    }


}
