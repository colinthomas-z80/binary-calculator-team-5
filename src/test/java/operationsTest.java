import org.junit.Test;
import org.junit.Assert;

import calculator.Operations;

public class operationsTest {
    @Test
    public void testBdivideTrue() {
        Assert.assertEquals("1100", Operations.Bdivide("1111000", "1010"));
    }
    @Test
    public void testBsubtractTrue() {
        Assert.assertEquals("1010", Operations.Bsubtract("1111", "101"));
    }
    @Test
    public void testBsquareTrue() {
        Assert.assertEquals("10000", Operations.Bsquare("100"));
    }
    @Test
    public void testBrootTrue() {
        Assert.assertEquals("100", Operations.Broot("10000"));
    }
    @Test
    public void testBdivideFalse() {
        Assert.assertNotEquals("1100", Operations.Bdivide("1111000", "1111"));
    }
    @Test
    public void testBsubtractFalse() {
        Assert.assertNotEquals("1111", Operations.Bsubtract("1111", "101"));
    }
    @Test
    public void testBsquareFalse() {
        Assert.assertNotEquals("10000", Operations.Bsquare("110100"));
    }
    @Test
    public void testBrootFalse() {
        Assert.assertNotEquals("100", Operations.Broot("1101000"));
    }
    @Test
    public void testBmultiplyTrue() {
        Assert.assertEquals("1100100", Operations.Bmultiply("10100", "101"));
    }
    @Test
    public void testBmultiplyFalse() {
        Assert.assertNotEquals("1101101", Operations.Bmultiply("11", "11"));
    }
    @Test
    public void testBaddTrue() {
        Assert.assertEquals("1111", Operations.Badd("1010", "101"));
    }
    @Test
    public void testBaddFalse() {
        Assert.assertNotEquals("1111", Operations.Badd("1111", "101"));
    }

    //Additional Tests for division method
    @Test
    public void testBdivisonRemainderLow() {
        Assert.assertEquals("10100", Operations.Bdivide("1100101", "101"));
    }
    @Test
    public void testBdivisonRemainderHigh() {
        Assert.assertEquals("10100", Operations.Bdivide("1101000", "101"));
    }
}
