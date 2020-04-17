package com.testmaximum;
import java.util.Arrays;
public class TestMaximum < V extends Comparable <V> >
{
    // Array of Values
    V[] valuesArray;

    //default constructor
    public TestMaximum()
    {
    }
    // Generic method to find Maximum Value
    public <V extends Comparable<V>> V findMaximumValue(V... valuesArray)
    {
        Arrays.sort(valuesArray);
        V maximumValue= valuesArray[valuesArray.length-1];
        printMaximumValue(maximumValue);
        return valuesArray[valuesArray.length-1];
    }

    // Generic Method to Print the Maximum Value
    private <V extends Comparable<V>> void printMaximumValue(V maximumValue)
    {
        System.out.println("Maximum Value is:"+maximumValue);
    }

    //Main Method
    public static void main(String args[])
    {
        //Welcome Message
        System.out.println("Welcome To Test maximum");
    }
}
