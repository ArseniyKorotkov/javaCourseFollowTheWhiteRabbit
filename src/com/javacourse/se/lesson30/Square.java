package com.javacourse.se.lesson30;

public class Square
{
    private double side;

    public double getSide()
    {
        return side;
    }

    public void setSide(double side) throws PerimetrExeption
    {
        if(side<=0)
        {
            throw new PerimetrExeption("Side is incorrect");
        }

        else
        {
            this.side = side;
        }


    }
}
