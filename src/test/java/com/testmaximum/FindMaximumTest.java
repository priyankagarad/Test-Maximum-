package com.testmaximum;
import org.junit.Assert;
import org.junit.Test;
public class FindMaximumTest {
    TestMaximum findMaximum = new TestMaximum();
    //TC:1.1
    @Test
    public void givenMaximumNumberAtFirstPosition_shouldReturnFirstNumber()
    {
        Comparable maximumNumber = findMaximum.findMaximumInteger(30, 10, 20);
        Assert.assertEquals(30, maximumNumber);
    }
    //TC:1.2
    @Test
    public void givenMaximumIntegerAtSecondPosition_shouldReturnSecondPosition()
    {
        Comparable maximumNumber = findMaximum.findMaximumInteger(10, 30, 20);
        Assert.assertEquals(30, maximumNumber);
    }
    //TC:1.3
    @Test
    public void givenMaximumIntegerAtThirdPosition_shouldReturnThirdPosition()
    {
        Comparable maximumNumber = findMaximum.findMaximumInteger(10, 20, 30);
        Assert.assertEquals(30, maximumNumber);
    }
    //TC:2.1
    @Test
    public void givenMaxFloatAtFirstPosition_shouldReturnFirstPosition()
    {
        Comparable maximumFloat = findMaximum.findMaximumFloat(30.5, 20.5, 10.5);
        Assert.assertEquals(30.5, maximumFloat);
    }
    //TC:2.2
    @Test
    public void givenMaximumFloatAtSecondPosition_shouldReturnFirstPosition()
    {
        Comparable maximumFloat = findMaximum.findMaximumFloat(10.5, 30.5, 20.5);
        Assert.assertEquals(30.5, maximumFloat);
    }
    //TC:2.3
    @Test
    public void givenMaximumFloatAtThirdPosition_shouldReturnFirstPosition()
    {
        Comparable maximumFloat = findMaximum.findMaximumFloat(10.5, 20.5, 30.5);
        Assert.assertEquals(30.5, maximumFloat);
    }
    //TC:3.1
    @Test
    public void givenMaximumStringAtFirstPosition_shouldReturnFirstPosition()
    {
        String maximumString=findMaximum.findMaximumString("peach", "apple", "banana");
        Assert.assertEquals("peach",maximumString);
    }
    //TC:3.2
    @Test
    public void givenMaximumStringAtSecondPosition_shouldReturnSecondPosition()
    {
        String maximumString=findMaximum.findMaximumString("apple","peach","banana");
        Assert.assertEquals("peach",maximumString);
    }
    @Test
    //TC:3.3
    public void givenMaximumStringAtThirdPositiom_shouldReturnThirdPosition()
    {
        String maximumString=findMaximum.findMaximumString("apple","banana","peach");
        Assert.assertEquals("peach",maximumString);
    }
}

