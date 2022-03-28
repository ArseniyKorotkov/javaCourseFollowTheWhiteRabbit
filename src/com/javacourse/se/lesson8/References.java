package com.javacourse.se.lesson8;

public class References
{
    String str = "Моя строка";
    String str2 = new String("Моя строка2");

    public void printStr()
    {
        System.out.println(str);
        System.out.println(new String("Моя строка3"));
    }
}
