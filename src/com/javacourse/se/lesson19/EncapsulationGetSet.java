package com.javacourse.se.lesson19;

public class EncapsulationGetSet
        /*
         инкапсуляция - принцип, объединяющий данные и код,
          манипулирующий этими данными, а так же
          защищающий данные от прямого доступа и неправильного использования
         */
{
    private int a = 5, b = 7;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int showResult()
    {
        return a+b;
    }
}
