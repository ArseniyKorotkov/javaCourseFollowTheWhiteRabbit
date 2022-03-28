package com.javacourse.se.lesson10;

public class ControlOperators
{
    int a = 5, b = 6;
    boolean value = true;

    public void printResultOperatorsIf()
    {
        if(a<b)
        {
            System.out.println("True");
            a++;
            if(a<b)
            {
                System.out.println("and a>b not one");
            }
            else
            {
                System.out.println("but a>b one");
            }
        }
        else
        {
            System.out.println("False");
        }
    }
}
