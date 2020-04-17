package com.testmaximum;
import org.junit.Assert;
import org.junit.Test;
public class FindMaximumTest
{
    TestMaximum findMaximum = new TestMaximum();
    //TC:1.1
    @Test
    public void givenMaximumNumber_whenAtFirstPosition_shouldReturnFirstNumber()
    {
        Comparable maximumNumber = findMaximum.findMaximumValue(30, 10, 20);
        Assert.assertEquals(30, maximumNumber);
    }
    //TC:1.2
    @Test
    public void givenMaximumIntegerNumber_whenAtSecondPosition_shouldReturnSecondPosition()
    {
        Comparable maximumNumber = findMaximum.findMaximumValue(10, 30, 20);
        Assert.assertEquals(30, maximumNumber);
    }
    //TC:1.3
    @Test
    public void givenMaximumIntegerNumber_whenAtThirdPosition_shouldReturnThirdPosition()
    {
        Comparable maximumNumber = findMaximum.findMaximumValue(10, 20, 30);
        Assert.assertEquals(30, maximumNumber);
    }
    //TC:2.1
    @Test
    public void givenMaximumFloatNumber_whenAtFirstPosition_shouldReturnFirstPosition()
    {
        Comparable maximumFloat = findMaximum.findMaximumValue(30.5, 20.5, 10.5);
        Assert.assertEquals(30.5, maximumFloat);
    }
    //TC:2.2
    @Test
    public void givenMaximumFloatNumber_whenAtSecondPosition_shouldReturnSecondPosition()
    {
        Comparable maximumFloat = findMaximum.findMaximumValue(10.5, 30.5, 20.5);
        Assert.assertEquals(30.5, maximumFloat);
    }
    //TC:2.3
    @Test
    public void givenMaximumFloatNumber_whenAtThirdPosition_shouldReturnThirdPosition()
    {
        Comparable maximumFloat = findMaximum.findMaximumValue(10.5, 20.5, 30.5);
        Assert.assertEquals(30.5, maximumFloat);
    }
    //TC:3.1
    @Test
    public void givenMaximumString_whenAtFirstPosition_shouldReturnFirstPosition()
    {
        Comparable maximumString=findMaximum.findMaximumValue("peach", "apple", "banana");
        Assert.assertEquals("peach",maximumString);
    }
    //TC:3.2
    @Test
    public void givenMaximumString_whenAtSecondPosition_shouldReturnSecondPosition()
    {
        Comparable maximumString=findMaximum.findMaximumValue("apple","peach","banana");
        Assert.assertEquals("peach",maximumString);
    }
    @Test
    //TC:3.3
    public void givenMaximumString_whenAtThirdPosition_shouldReturnThirdPosition()
    {
        Comparable maximumString=findMaximum.findMaximumValue("apple","banana","peach");
        Assert.assertEquals("peach",maximumString);
    }
    //TC:4.1
    @Test
    public void givenMoreThanThreeInteger_whenMaximum_shouldReturnMaximumInteger()
    {
        Comparable maximumValue=findMaximum.findMaximumValue(10,20,30,40,50,60);
        Assert.assertEquals(60,maximumValue);
    }
    //TC:4.2
    @Test
    public void givenMoreThanThreeFloatNumber_whenMaximum_shouldReturnMaximumFloatNumber()
    {
        Comparable maximumValue=findMaximum.findMaximumValue(5.5,3.5,1.2,7.4,4.2);
        Assert.assertEquals(7.4,maximumValue);
    }
    //TC:4.3
    @Test
    public void givenMoreThanThreeString_whenMaximum_shouldReturnMaximumString()
    {
        Comparable maximumValue=findMaximum.findMaximumValue("apple", "banana", "peach", "strawberry", "mango");
        Assert.assertEquals("strawberry",maximumValue);
    }
}

