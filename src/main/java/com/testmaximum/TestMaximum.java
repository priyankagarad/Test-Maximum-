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
        double maximumNumber=0;
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
    public static void main(String args[])
    {
        //Welcome message display
        System.out.println("Welcome to Test Maximum");
    }
}
