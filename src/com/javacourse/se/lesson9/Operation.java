package com.javacourse.se.lesson9;

public class Operation
{
    Integer a = 5, b = 7, c;
    String str1 = "Hello ", str2 = "World", result = str1+str2;

    public void operecionGo()
    {
        c=a+b;
        System.out.println(c);
        System.out.println(result);
    }

    public void logicOperacion()
    {
        a += b;
        a = a + b;

        a++; //инкримент
        a = a + 1;
        a--; //деримент
        a = a - 1;


    }

}
