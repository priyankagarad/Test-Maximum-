package com.testmaximum;
public class TestMaximum < V extends Comparable <V> >
{
    //class parameter
    V firstValue;
    V secondValue;
    V thirdValue;

    //default constructor
    public TestMaximum()
    {

    }
    //Paramerized Constructor
    public TestMaximum(V firstValue,V secondValue,V thirdValue)
    {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }
    // Generic Method to find Maximum Value
    public V findMaximumValue(V firstValue,V secondValue,V thirdValue)
    {
        V maximumValue=firstValue;
        if(secondValue.compareTo(maximumValue)>0)
        {
            maximumValue=secondValue;
        }
        if(thirdValue.compareTo(maximumValue)>0)
        {
            maximumValue=thirdValue;
        }
        return maximumValue;
    }
    public static void main(String args[])
    {
        //Welcome Message
        System.out.println("Welcome To Test maximum");
    }
    // Internally call findMaximum
    public <V extends Comparable<V>> V findMaximumValue()
    {
        return (V) findMaximumValue(firstValue,secondValue,thirdValue);
    }
}
