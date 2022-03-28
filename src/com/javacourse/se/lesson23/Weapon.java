package com.javacourse.se.lesson23;

public abstract class Weapon //абстрактный класс может иметь:
    //                          абстрактные методы
    //                          обычные методы
    //                          никаких методов
{
    private String name;

    public abstract void tatata(); //абстрактный метод не имеет тело
    //                              // и обязательно переопределяется в объектах

    public void perezaryadka()
    {
        System.out.println("Перезаряжаюсь");
    }
}
