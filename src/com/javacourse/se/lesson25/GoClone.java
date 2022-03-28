package com.javacourse.se.lesson25;

public class GoClone
{
    public static DollySheet goClone(DollySheet dolly)
    {
        DollySheet dolly2 = null;
        try
        {
            dolly2 = (DollySheet)dolly.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return dolly2;
    }
}
