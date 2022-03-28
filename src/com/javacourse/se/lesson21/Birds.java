package com.javacourse.se.lesson21;

public class Birds //птицы
{
    private String name;
    private Wings wings;

    public Birds(String name, Wings wings)
    {
        this.name = name;
        this.wings = wings;
    }

    public void walk()
    {
        System.out.println("I am walk");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Wings getWings()
    {
        return wings;
    }

    public void setWings(Wings wings)
    {
        this.wings = wings;
    }
}
