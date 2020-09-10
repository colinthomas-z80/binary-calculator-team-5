import org.junit.Test;
import org.junit.Assert;

import calculator.operations;

public class operationsTest {
    @Test
    public void testBdivideTrue() {
        Assert.assertEquals("1100", operations.Bdivide("1111000", "1010"));
    }
    @Test
    public void testBsubtractTrue() {
        Assert.assertEquals("1010", operations.Bsubtract("1111", "101"));
    }
    @Test
    public void testBsquareTrue() {
        Assert.assertEquals("10000", operations.Bsquare("100"));
    }
    @Test
    public void testBrootTrue() {
        Assert.assertEquals("100", operations.Broot("10000"));
    }
    @Test
    public void testBdivideFalse() {
        Assert.assertNotEquals("1100", operations.Bdivide("1111000", "1111"));
    }
    @Test
    public void testBsubtractFalse() {
        Assert.assertNotEquals("1111", operations.Bsubtract("1111", "101"));
    }
    @Test
    public void testBsquareFalse() {
        Assert.assertNotEquals("10000", operations.Bsquare("110100"));
    }
    @Test
    public void testBrootFalse() {
        Assert.assertNotEquals("100", operations.Broot("1101000"));
    }
    @Test
    public void testBmultiplyTrue() {
        Assert.assertEquals("1100100", operations.Bmultiply("10100", "101"));
    }
    @Test
    public void testBmultiplyFalse() {
        Assert.assertNotEquals("1101101", operations.Bmultiply("11", "11"));
    }
    @Test
    public void testBaddTrue() {
        Assert.assertEquals("1111", operations.Badd("1010", "101"));
    }
    @Test
    public void testBaddFalse() {
        Assert.assertNotEquals("1111", operations.Badd("1111", "101"));
    }
}
