package com.javacourse.se.lesson15;

public class Constructor
{
    public void Flowers()
    {
        Flower rouse = new Flower();
        rouse.name = "роза";
        rouse.color = "красная";

        Flower romashka = new Flower("ромашка", "белая");

        System.out.println(rouse.name + rouse.color);
        System.out.println(romashka.name + romashka.color);
    }
}
