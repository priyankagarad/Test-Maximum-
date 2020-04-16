package com.testmaximum;
import org.junit.Assert;
import org.junit.Test;
public class FindMaximumTest
{
    TestMaximum findMaximum = new TestMaximum();
    //TC:1.1
    @Test
    public void givenMaximumNumberAtFirstPosition_shouldReturnFirstNumber()
    {
        Comparable maximumNumber = findMaximum.findMaximumValue(30, 10, 20);
        Assert.assertEquals(30, maximumNumber);
    }
    //TC:1.2
    @Test
    public void givenMaximumIntegerAtSecondPosition_shouldReturnSecondPosition()
    {
        Comparable maximumNumber = findMaximum.findMaximumValue(10, 30, 20);
        Assert.assertEquals(30, maximumNumber);
    }
    //TC:1.3
    @Test
    public void givenMaximumIntegerAtThirdPosition_shouldReturnThirdPosition()
    {
        Comparable maximumNumber = findMaximum.findMaximumValue(10, 20, 30);
        Assert.assertEquals(30, maximumNumber);
    }
    //TC:2.1
    @Test
    public void givenMaximumFloatAtFirstPosition_shouldReturnFirstPosition()
    {
        Comparable maximumFloat = findMaximum.findMaximumValue(30.5, 20.5, 10.5);
        Assert.assertEquals(30.5, maximumFloat);
    }
    //TC:2.2
    @Test
    public void givenMaximumFloatAtSecondPosition_shouldReturnFirstPosition()
    {
        Comparable maximumFloat = findMaximum.findMaximumValue(10.5, 30.5, 20.5);
        Assert.assertEquals(30.5, maximumFloat);
    }
    //TC:2.3
    @Test
    public void givenMaximumFloatAtThirdPosition_shouldReturnFirstPosition()
    {
        Comparable maximumFloat = findMaximum.findMaximumValue(10.5, 20.5, 30.5);
        Assert.assertEquals(30.5, maximumFloat);
    }
    //TC:3.1
    @Test
    public void givenMaximumStringAtFirstPosition_shouldReturnFirstPosition()
    {
        Comparable maximumString=findMaximum.findMaximumValue("peach", "apple", "banana");
        Assert.assertEquals("peach",maximumString);
    }
    //TC:3.2
    @Test
    public void givenMaximumStringAtSecondPosition_shouldReturnSecondPosition()
    {
        Comparable maximumString=findMaximum.findMaximumValue("apple","peach","banana");
        Assert.assertEquals("peach",maximumString);
    }
    @Test
    //TC:3.3
    public void givenMaximumStringAtThirdPosition_shouldReturnThirdPosition()
    {
        Comparable maximumString=findMaximum.findMaximumValue("apple","banana","peach");
        Assert.assertEquals("peach",maximumString);
    }
}

