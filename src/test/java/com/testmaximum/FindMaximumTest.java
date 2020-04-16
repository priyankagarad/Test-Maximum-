package com.testmaximum;
import org.junit.Assert;
import org.junit.Test;
public class FindMaximumTest
{
    TestMaximum findMaximum=new TestMaximum();
    @Test
    public void givenMaximumNumberAtFirstPosition_shouldReturnFirstNumber()
    {
        Comparable maximumNumber=findMaximum.findMaximumInteger(30,10,20);
        Assert.assertEquals(30,maximumNumber);
    }
    @Test
    public void givenMaxIntegerAtSecondPosition_shouldReturnSecondPosition()
    {
        Comparable maximumNumber=findMaximum.findMaximumInteger(10,30,20);
        Assert.assertEquals(30,maximumNumber);
    }
    @Test
    public void givenMaxIntegerAtThirdPosition_shouldReturnThirdPosition()
    {
        Comparable maximumNumber = findMaximum.findMaximumInteger(10, 20, 30);
        Assert.assertEquals(30, maximumNumber);
    }
}