package com.javacourse.se.lesson22;

public class Crow2 extends Birds2
{
    public void fly()
    {
        System.out.println("Я ворона, я летаю!");
    }

    @Override
    public void walk()
    {
        System.out.println("Я ворона, я летаю, но тоже хожу!!!");
    }
}
