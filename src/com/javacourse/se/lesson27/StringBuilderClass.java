package com.javacourse.se.lesson27;

public class StringBuilderClass  //быстрый, нет потокобезопасности
{//изменяет строку не создавая новый объект
    StringBuilder stringBuilder = new StringBuilder("Java");

    public void goBuilder()
    {
        //// ensureCapacity позволяет установить минимум выделяемого места
        stringBuilder.ensureCapacity(40);
        //// метод capacity показывает кол-во выделенного под объект места
        System.out.println(stringBuilder.capacity());
        ////append добавляет в конец строки
        System.out.println(stringBuilder.append(" Hot"));
        ////insert - добавляет в указанное индексом место
        stringBuilder.insert(5,"Very ");
        System.out.println(stringBuilder);
        ////delete - удаление указанной области не включая последнюю
        System.out.println(stringBuilder.delete(0, 0));
        ////reverse - переворот строки задом на перед
        System.out.println(stringBuilder.reverse());
    }

}
