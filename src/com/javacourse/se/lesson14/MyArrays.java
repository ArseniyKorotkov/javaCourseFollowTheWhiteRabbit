package com.javacourse.se.lesson14;

public class MyArrays
{
    //что лежит в массиве+знак [] массива+имя массива=new+что лежит в массиве+[кол-во объектов в массиве];
    int [] array = new int[3];
    int [] array2 = {10, 8, 7};


    public void ArrayGo()
    {
        //System.out.println(array2[0]);

       for(int i = 0; i < array2.length; i++)
       {
           System.out.println(array2[i]);
       }

       //для примитивных типов незаполненная ячейка массива = 0
        System.out.println(array[0]);

    }


    int [][] fullArray = new int[2][2];
    int [][] fullArray2 = {{1,2},{3,4}};
    int [][][] fullArray3 = {{{1,2},{3,4}},{{5,6},{7,8},{9,10,11}}};

    public void FullArrayGo()
    {
        System.out.println(fullArray2[1][0]);
        System.out.println(fullArray3[1][0][1]);
    }



    Candy [] box = new Candy[3];


    Candy C1 = new Candy();
    Candy C2 = new Candy();
    Candy C3 = new Candy();

    Candy [] box2 = {C1, C2, C3};


    Candy [] box3;


    public void ArrayCandyBoxGo()
    {


        System.out.println(box2[0]);
        System.out.println(C1);

        //для ссылочных типов незаполненная ячейка массива = null
        System.out.println(box[1]);
    }
}
