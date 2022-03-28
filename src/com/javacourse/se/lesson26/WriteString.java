package com.javacourse.se.lesson26;

public class WriteString
{
    public String str1 = new String("Первый способ");
    public String str2 = "Второй способ";

    public void Write()
    {
        ////charAt - отображает символ по индексу из заданного массива String
        //System.out.println(str1.charAt(0));
        //System.out.println(str1.charAt(1));

        ////codePointAt - отображает символ по индексу из заданного массива String в форме юникод
        //System.out.println(str1.codePointAt(0));
        //System.out.println(str1.codePointAt(1));

        ////compareTo - сравнивает строки на полную идентичность элементов массива String
        ////в числовом иквиваленте. При равенстве выводит ноль
        //System.out.println(str1.compareTo(str2));

        ////compareToIgnoreCase - сравнивает строки по принципу compareTo, но без учета регистра
        //System.out.println(str1.compareToIgnoreCase(str2));

        ////concat - сложение строк. Аналогично str1+str2
        //System.out.println(str1.concat(str2));

        ////equals - сравнивает строки на полную идентичность. Выводит булиеновкий результат
        //System.out.println(str1.equals(str2));

        ////equalsIgnoreCase - сравнивает строки на идентичность без учета регистра.
        ////Выводит булиеновкий результат
        //System.out.println(str1.equalsIgnoreCase(str2));

        ////hashCode - возвращает хешкод
        //System.out.println(str1.hashCode());

        ////indexOf - возвращает индекс объекта из массива String,
        ////которому соответствует введенное юникод число
        ////иначе выводит -1
        //System.out.println(str1.indexOf(65));
        //System.out.println(str1.indexOf(1077));//буква "е"

        ////isEmpty - возвращает true, если длина строки = 0 т.е. если строка пуста
        //System.out.println(str1.isEmpty());

        ////length - возвращает длину строки в формате количества символов в ней
        //System.out.println(str1.length());

        ////split - разделяет строку на несколько строк в местах введенных в качество regex
        ////строка используемая как разделитель regex стирается
        ////вписывает полученные строки в массив
        /*
        String [] strings = str1.split(" ");
        for (String s : strings)
        {
            System.out.println(s);
        }
        */

        ////substring - вырезает из строки часть с первого указанного индекса по второй указанный индекс
        //System.out.println(str1.substring(2,9));

        ////toCharArray - разделяет строку на несколько строк по одному элементу в каждой
        //char [] charArray = str1.toCharArray();
        /*
        for(char c : charArray)
        {
            System.out.println(c);
        }
        */

        ////toLowerCase - делает все буквы в строке маленькими
        //System.out.println(str1.toLowerCase());

        ////toUpperCase - делает все буквы в строке большими
        //System.out.println(str1.toUpperCase());

        ////trim - обрезает пробелы в начале и в конце строки
        //System.out.println(str1.trim());

        ////valueOf - форматирует число в строку
        //int x = 5;
        //String str3 = String.valueOf(x);
        //System.out.println(str3);

        ////copyValueOf - делает из массива char  одну строку
        // char[] textArray = {'I', ' ', 'l', 'o', 'v', 'e', ' ', 'j', 'a', 'v', 'a'};
        // String str4 = String.copyValueOf(textArray);
        //System.out.println(str4);

        //contains - находит определенный символ или группу символов в строке определяя наличие через true-false
        //System.out.println(str2.contains("орp"));  //false
        //System.out.println(str2.contains("ор"));   //true
    }
}
