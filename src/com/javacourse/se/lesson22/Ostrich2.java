package com.javacourse.se.lesson22;

public class Ostrich2 extends Birds2
{
    public void hideHand() //прячет голову
    {
        System.out.println("Я в домике!");
    }

    public void walk(String str) //два одинаковых метода, но с различными принимаемыми  параметрами
                                 //являются одним ПЕРЕГРУЖЕННЫМ МЕТОДОМ
    {
        System.out.println("Я хожу!"+str);
    }
//ДИНАМИЧЕСКИЙ ПОЛИФОРМИЗМ - переопределение метода в дочернем классе
    @Override               //ПЕРЕОПРЕДЕЛЕННЫЙ МЕТОД
    public void walk()      //точно такой же метод
    {                       //но с переопределенным функционалом
        System.out.println("Я очень быстро хожу");
    }
}
