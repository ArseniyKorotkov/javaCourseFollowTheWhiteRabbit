package com.javacourse.se.lesson11;

public class OperatorSwith
{
   //для использования переменных в switch они должны быть объявлены как final
    final int V1 = 1, V2 = 2, V3 = 3, V4 = 4;
    final String S1 = "Str1",  S2 = "Str2",  S3 = "Str3";

    public void OpSwith()
            //работает с byte, short, char, enum, String
    {
       /*
        switch(44)
        {
            case 25:
                System.out.println(25);
                break;
            case 48:
                System.out.println(48);
                break;
            case 44:
                System.out.println(44);
                break;

            //если ни один из кейсов не выполняется, можно в заключении использовать:
            default:
                System.out.println("нет такого числа");
         }
        */

        /*
                switch(V3)
                {
                    case V1:
                        System.out.println(V1);
                        //из-за final менять константы нельзя!
                        //V1 = V1+2; -- это недопустимо!
                        break;
                    case V2:
                        System.out.println(V2);
                        break;
                    case V3:
                        System.out.println(V3);
                        break;
                    case V4:
                        System.out.println(V4);
                        break;

                    //если ни один из кейсов не выполняется, можно в заключении использовать:
                    default:
                        System.out.println("нет такого V");
                }
            */

        switch(S2)
        {
            case S1:
                System.out.println(S1);
                //из-за final менять константы нельзя!
                //V1 = V1+2; -- это недопустимо!
                break;
            case S2:
                System.out.println(S2);
                break;
            case S3:
                System.out.println(S3);
                break;


            //если ни один из кейсов не выполняется, можно в заключении использовать:
            default:
                System.out.println("нет такого V");
        }
    }
}
