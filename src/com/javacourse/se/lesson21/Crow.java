package com.javacourse.se.lesson21;

public class Crow extends Birds// Ворона
{
    public Crow(String name, Wings wings)
    {
        super(name, wings);
    }

    public void fly()
    {
        System.out.println("I fly");
    }
}
