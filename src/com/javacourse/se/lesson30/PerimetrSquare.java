package com.javacourse.se.lesson30;

public class PerimetrSquare
{
    public void getPerimetr()
    {
        Square square = new Square();
        try
        {
            square.setSide(0);
        }
        catch (PerimetrExeption perimetrExeption)
        {
            perimetrExeption.printStackTrace();
        }
    }
}
