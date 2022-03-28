package com.javacourse.se.lesson13;

public class LoopForAndForEach
{
    int a = 5, b = 0;

    public void LoopFor()
    {
        for (int a = 5; a<100; a=a+5)
        {
            b++;
            System.out.println(b+"."+a);
        }
    }

    int [] array = {1, 2, 3};

    public void LoopForEach()
    {
        for(int number : array)
        {
            System.out.println(number);
        }
    }
}
