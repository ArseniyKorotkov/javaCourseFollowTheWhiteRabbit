package com.javacourse.se.lesson24;

public class Mi8 extends Helicopter implements VerticalTakeOff //implements - это реализация чего либо
    //                                                         //внутри класса. Их может быть много
    //                                                         //через запятую
{

    @Override
    public void fly()
    {
        System.out.println("Mi8 fly");
    }

    @Override
    public void verticalTakeOff()
    {
        System.out.println("Mi8 fly vertical");
    }
}
