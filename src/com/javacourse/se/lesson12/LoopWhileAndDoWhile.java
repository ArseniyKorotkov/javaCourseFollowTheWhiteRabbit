package com.javacourse.se.lesson12;

public class LoopWhileAndDoWhile
{
    int a = 5, b = 7;

    public void LoopWhile()
    {

        while (a <= b)
        {
            System.out.println(a+" "+b);
            a=a+2;
            b++;
        }
    }

    public void LoopDoWhile()
    {
        do
        {
            System.out.println(a+" "+b);
            a=a+2;
            b++;
        }
        while (a < b);
    }
}
