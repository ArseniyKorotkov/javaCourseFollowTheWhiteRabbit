package com.javacourse.se.lesson18;

public class ModStatic
{
    //модификатор static делает это поле одним для всех объеков
    //модификатор static делает это поле полем КЛАССА, а не ОБЪЕКТА
    /*
    public static int var;
    public int var2;

    public static void StaticGo() //в статических методах используются только статичекие переменные т.к. они должны работать для всех объектов
    {
        System.out.println(var);
        //System.out.println(var2); !ошибка
    }
    */

    public static int StaticGoGo() //в статических методах используются только статичекие переменные т.к. они должны работать для всех объектов
    {
        int q = 7;
        return q;
    }

    static
    {
        System.out.println(StaticGoGo());
    }
}
