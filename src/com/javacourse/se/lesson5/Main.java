package com.javacourse.se.lesson5;

import com.javacourse.se.lesson8.*;

import java.io.*;

public class Main
{
    public static void main(String[] args) {
        //lesson6

        //Примитивные типы данных и литералы. Объявление и инициализация переменных

        /* вывод чисел
        Numbers b = new Numbers();
        b.h = 65;
        b.egg();
        */


        //lesson7

        //Введение в классы и объекты

        /* вывод автобусов
        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();

        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Blue";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
        */


        //lesson8

        //Ссылочные типы данных. Оболочки примитивных типов

        //new References().printStr();


        //lesson9

        //Арифметичкские и логические операции. Операторы отношения. Класс Math

        //new Operation().operecionGo();


        //lesson10

        //Условный оператор if или оператор ветвления

        //new ControlOperators().printResultOperatorsIf();


        //lesson11

        //Оператор Swith(оператор множественного выбора)

        //OperatorSwith qw = new OperatorSwith();
        //qw.OpSwith();
        //или так:
        //new OperatorSwith().OpSwith();


        //lesson12

        //Циклы While и DoWhole

        //new LoopWhileAndDoWhile().LoopWhile();
        //new LoopWhileAndDoWhile().LoopDoWhile();


        //lesson13

        // Циклы For и ForEach

        //new LoopForAndForEach().LoopFor();
        //new LoopForAndForEach().LoopForEach();


        //lesson14

        //Массивы

        //new MyArrays().ArrayGo();
        //new MyArrays().FullArrayGo();
        //new MyArrays().ArrayCandyBoxGo();


        //lesson15

        //Конструкторы

        //new Constructor().Flowers();
        //Flower F3 = new Flower();


        //lesson16

        //Модификаторы доступа

        //Modifiers mod = new Modifiers();
        //mod.ModifiersGo();
        //ClassPrivat - недоступен
        //String name = mod.name;


        //lesson17

        //Поля и методы

        //Bus maz = new Bus();
        //maz.go();
        //int distanceInt = maz.showDistanceInt();
        //System.out.println(distanceInt);
        //String distanceStr = maz.showDistanceString();
        //System.out.println(distanceStr);
        //System.out.println(maz.showTransmission());
        //int speedOnRace = 60;
        //maz.showMaxSpeed(speedOnRace);


        //lesson18

        //Модификатор Static

        //ModStatic MS1 = new ModStatic();
        //ModStatic MS2 = new ModStatic();
        //ModStatic MS3 = new ModStatic();

        // MS1.var = 5;
        // MS2.var = 6;

        //System.out.println(MS1.var); // выведет 6 т.к. var на все объекты один

        //ModStatic.var = 7; //логичное применение статической переменной

        //ModStatic.StaticGoGo();


        //lesson19

        //Инкапсуляция. Методы get и set

        //EncapsulationGetSet c = new EncapsulationGetSet();
        //System.out.println(c.showResult());

        //c.setA(10);
        //System.out.println(c.getA());


        //lesson20

        //ПЕРЕЧИСЛЕНИЯ ENUM

        /*
        for (Music sound: Music.values()) //метод Music.values() - выводит все списки перечисления Enum
        {
            System.out.println(sound);
        }

        */
        //Music mc = Music.CLASSIC; //1й способ создания объекта класса Enum
        //Music mc2 = Music.valueOf(Music.class,"ROCK"); //2й способ создания объекта класса Enum

        /*
        switch (mc)
        {
            case CLASSIC:
                System.out.println("Classic music");
                break;
            case ROCK:
                System.out.println("Rock music");
                break;
            case POP:
                System.out.println("Pop music");
                break;
        }
         */

        //System.out.println(mc2.getI());
        //System.out.println(mc2.getName());

        //mc.showText();


        //lesson21

        //Наследование. Использование this и super

        //наследование - отношение между классами, при котором хар-ки одного класса передаются другому
        //классу без необходимости копирования и повторного определения

        //наследоваться можно только от одного объекта

        //Wings krilo = new Wings();

        //Ostrich straus =new Ostrich("Страус", krilo); //у птиц есть как и все общие методы
        //Crow vorona = new Crow("Ворона", krilo);      //так и у каждой индивидуальные

        //straus.setName("Страус");
        //Birds straus2 = new Ostrich("Страус2", krilo);//здесь страус является птицей в чистом виде
        //                                              //без доп. функций страусов


        //lesson22

        //Полиформизм. Перегрузка и переопределение методов

        //ПОЛИФОРМИЗМ - это свойство позволяющее с помощью одного интерфеса
        // обращаться к общему классу действий

        //или свойство позволяющее одному методу работать для разных объектов по разному

        //Ostrich2 straus2 = new Ostrich2();
        //Crow2 vorona2 = new Crow2();

        //straus2.setName("Страус2");
        //straus2.walk();                         //ПЕРЕГРУЗКА метода в дочернем классе
        //straus2.walk("Действительно хожу!!!");  //называется СТАТИЧЕСКИЙ ПОЛИФОРМИЗМ

        //                                       //ПЕРЕОПРЕДЕЛЕНИЕ метода в дочернем классе
        //                                       //называется ДИНАМИЧЕСКИЙ ПОЛИФОРМИЗМ

        //Birds2 straus2i2 = new Ostrich2();
        //Birds2 vorona2i2 = new Crow2();

        //Test tests = new Test();

        //tests.test(vorona2i2);
        //tests.test(straus2i2);


        //lesson23

        //Абстрактные классы и методы

        //АБСТРАКТНЫЕ МЕТОДЫ - общий метод для создания на его базе объектов
        //от абстрактного метода можно только наследоваться

        //Weapon weapon = new Weapon(); ОШИБКА!!! Нельзя создать объект абстрактного метода

        //AK47 kalash = new AK47();


        //lesson24

        //Интерфейсы

        //Mi8 mi8 = new Mi8();
        //Boeing737 boeing737 = new Boeing737();

        //Test test = new Test();
        //test.go(mi8);
        //test.go(boeing737);
        //test.go2(mi8);


        //lesson25

        //Клонирование объектов

        //DollySheet dolly1 = new DollySheet();

        //DollySheet dolly2 = GoClone.goClone(dolly1);

        //dolly1.setName("d1");
        //dolly2.setName("d2");

        //System.out.println(dolly1.getName());
        //System.out.println(dolly2.getName());


        //lesson26

        //Класс String и его методы

        //Все подробности в методе WriteString

        //WriteString write = new WriteString();
        //write.Write();


        //lesson27

        //Классы StringBuilder и StringBuffer. Их методы.

        //StringBuilderClass Builder = new StringBuilderClass();
        //Builder.goBuilder();


        //lesson28

        //Generic - Параметритизация - Обобщения
/*
        Body body = new Body();
        SmollHead smollHead = new SmollHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();

        Robot<SmollHead> robot = new Robot<SmollHead>(body, smollHead);
        Robot<BigHead> robot1 = new Robot<BigHead>(body, bigHead);
        Foot foot = new Foot();

        robot.getHead().burn();
        robot1.getHead().turn();

        Robot robot2 = new Robot(body, mediumHead);
        robot2 = robot1;

        //Robot robot3 = new Robot(body, foot);//благодаря extends Head ного вмемто головы не поставится
*/


        //lesson29

        //Исключения, ошибки, иерархия. Блоки try, catch, finaly
/*
        ErrorExempleClass errorExemple = new ErrorExempleClass();
        try {
            errorExemple.GoErrors();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/


        //lesson30

        //Создание собственных исключений

        //PerimetrSquare perimetrSquare = new PerimetrSquare();
        //perimetrSquare.getPerimetr();


        //lesson31

        //Потоки ввода и вывода(I-O)
        /*
        //чтение текста
        FileInputStream fis = null; //байтовый поток
        InputStreamReader isr = null; //символьный поток
        int b = 0;

        try
        {
            fis = new FileInputStream("D:/Arseniy/JavaProekty/FollowTheWhiteRabbit/src/com/javacourse/se/lesson31/1.txt");
            isr = new InputStreamReader(fis, "UTF8");

            //while((b=fis.read()) != -1)//выводит текст перегоняя через байтовую кодировку
            //                                //может некорректно отображать текст

            while((b = isr.read()) != -1)//Должно отображать текст полностью корректно
            {
                System.out.print((char) b);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fis.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            try
            {
                isr.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        */


        /*
        //запись текста
        //FileOutputStream fileOutputStream = null;
        FileWriter fileWriter = null;
        String str = "Работай же!";

        try
        {
            //true - дописывает вайл...false переписыввает файл
            fileWriter = new FileWriter("D:/Arseniy/FollowTheWhiteRabbit/src/com/javacourse/se/lesson31/1.txt", true);
            //переписыввает файл
            //fileOutputStream = new FileOutputStream("D:/Arseniy/JavaProekty/FollowTheWhiteRabbit/src/com/javacourse/se/lesson31/1.txt");

            fileWriter.write(str);
            //fileOutputStream.write(str.getBytes());
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fileWriter.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        */


        //lesson32

        //Сериализация - Десиализация объектов
        //процесс сохранения объекта в поток

        /*
        Cat32 cat32 = new Cat32();
        cat32.setName("Barsic");

        Serializator serializator = new Serializator();
        //serializator.seroalization(cat32);//по указанному адресу создался файл

        try
        {
            Cat32 cat = serializator.desiarilization();
            System.out.println(cat.getName());
        }
        catch (InvalidObjectException e)
        {
            e.printStackTrace();
        }
        */


        //lesson33

        //Колекции Java

        //lesson34

        //ArrayList and LinkedList

        /*
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");

        list.add(person1);
        list.add(person2);

        Person person1FromCollrction = list.get(0);
        Person person2FromCollrction = list.get(1);

        System.out.println(person1FromCollrction);
        System.out.println(person2FromCollrction);

        System.out.println(list.size());//длина листа

        System.out.println(list.contains(person1));//проверка на наличие элемента
         */


        //lessonWorkOut1

        //Окошки JFrame

        //GUI window = new GUI();
        ////делаем окно видимым
        //window.setVisible(true);
    }
}
