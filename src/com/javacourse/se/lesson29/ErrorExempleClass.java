package com.javacourse.se.lesson29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorExempleClass
{
    private NotClass not;
    private NotClass not1;

    public void GoErrors() throws FileNotFoundException
    {
        FileInputStream fileInputStream = new FileInputStream("");//эта ошибка обработается
        //                                                     через throws FileNotFoundException
        //System.out.println(1/0);

        //int array [] = {1,2,3};
        //System.out.println(array[5]);


        try//содержит блок кода, в котором возможна ошибка
        {
            not.poshow();
            System.out.println(1/0);

        }
        //catch (Exception e)                //если ошибка соответствует введенной или ее дочерней
        catch (NullPointerException | ArithmeticException e)//то выполняется следующий блок...
        {
            e.printStackTrace();//выводит ошибку на экран
            //System.err.println("Ссылка на несуществующий объект или деление на ноль");
        }
        catch (AbstractMethodError ex)
        {
            ex.printStackTrace();//выводит ошибку на экран
            //System.err.println("Ошибка абстрактного метода");
        }
        finally//выполняется этот блок после обработки ошибки. Обычно это удаление подвисших операций
        {

        }


/*
        //хотя простые ошибки обрабатываюся if
        if(not == null)
        {
            System.err.println("Ссылка на несуществующий объект");
        }
        else
        {
            not.poshow();
        }
*/



    }
}
