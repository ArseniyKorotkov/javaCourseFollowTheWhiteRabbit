package com.javacourse.se.lesson17;

public class Bus {
    //поля - свойства и составляющие класса. Имя существительное
    public String model, color;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "WER06DXZ";

    //методы -
    public void go()
    //void - ничего не возвращает
    {
        System.out.println("Go");
    }

    public int showDistanceInt()
    {
        int km = 65;
        return km;
    }

    public String showDistanceString()
    {
        String str = "70";
        return str;
    }


    public Transmission showTransmission()
    {
        Transmission trans = new Transmission();
        return trans;
    }

    public void showMaxSpeed(int speed)
    {
        int maxSpeed = speed + 10;
        System.out.println(maxSpeed);
    }
}