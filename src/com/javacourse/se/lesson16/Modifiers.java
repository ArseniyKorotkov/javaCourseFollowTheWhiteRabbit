package com.javacourse.se.lesson16;

public class Modifiers
{
    // private
    // виден в классе, в котором находится
    // применим для вложенных классов(к обычному классу не применим!) и его составляющих

    // default по умолчанию
    // виден внутри пакета, в котором находится
    // применим для всех

    // protected
    // виден внутри пакета, в котором находится + классам наследникам
    // применим для вложенных классов(к обычному классу не применим!) и его составляющих

    // public
    // виден всем
    // применим для классов и его составляющих

    private class ClassPrivat
    {
        public String color;
    }

    public String name;

    public Modifiers()
    {
    }

    public void ModifiersGo()
    {
        ClassPrivat privat = new ClassPrivat();
        privat.color = "do not";

    }
}
