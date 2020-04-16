package com.testmaximum;
public class TestMaximum
{
    //Method to Find Maximum Integer Number
    public static int findMaximumInteger(int firstNumber,int secondNumber,int thirdNumber)
    {
        int maximumNumber=0;
        if(firstNumber>secondNumber && firstNumber>thirdNumber)
        {
            return maximumNumber=firstNumber;
        }
        else if (secondNumber>firstNumber && secondNumber>thirdNumber)
        {
            return maximumNumber=secondNumber;
        }
        else
        {
            return maximumNumber=thirdNumber;
        }
    }
    //Method to Find Maximum Number
    public static double findMaximumFloat( double firstNumber,double secondNumber,double thirdNumber)
    {
        double maximumNumber = 0;
        if (firstNumber > secondNumber && firstNumber > thirdNumber)
        {
            return maximumNumber = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber)
        {
            return maximumNumber = secondNumber;
        } else {
            return maximumNumber = thirdNumber;
        }
    }
    public String findMaximumString(String string1,String string2,String string3)
    {
        String maximumString=string1;
        if(string2.compareTo(maximumString)>0)
        {
            maximumString=string2;
        }
        if(string3.compareTo(maximumString)>0)
        {
            maximumString=string3;
        }
        return maximumString;
    }
    public static void main(String args[])
    {
        //Welcome Message
        System.out.println("Welcome To Test maximum");
    }
}
