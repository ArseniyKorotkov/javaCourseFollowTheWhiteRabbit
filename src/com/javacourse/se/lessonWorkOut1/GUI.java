package com.javacourse.se.lessonWorkOut1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI extends JFrame //наследуемся от класса создания окон
{
    //СОЗДАЕМ ПОЛЯ ДЛЯ ФОРМОЧКИ

    //создаем кнопку с надписью "конвертировать"
    private JButton button1 = new JButton("конвертировать");

    //создаем текстовое поле без текста в пять колонок
    private JTextField input = new JTextField("", 5);

    //создаем надпись
    private JLabel label = new JLabel("Input: ");

    //создаем строки для выбора
    private JRadioButton radioButton1 = new JRadioButton("qestion1");
    private JRadioButton radioButton2 = new JRadioButton("qestion2");

    //создаем место для галочки  с надписью "Check" и отсутствием галочки галочки false
    private JCheckBox box1 = new JCheckBox("Check", false);

    //СОЗДАЕМ КОНСТРУКТОР
    public GUI()
    {
        //обращаемся к классу-родителю JFrame через слово  super
        super("RunCalculator");//и вписываем название формочки

        //определяем положение "x" и "y" верхнего левого угла формочки
        // и определяем размер для самой формочки
        this.setBounds(100, 100 , 300,400);

        //при закрытии формочки завершатся все рперации с ней связанные
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //создаем место для полей нашей формочки
        Container container = this.getContentPane();

        //определяем кол-во рядов, колонок и отступы для нашего контейнера
        container.setLayout(new GridLayout(3,2,2,2));


        //ПОМЕЩАЕМ НАШИ ЭЛЕМЕНТЫ В ФОРМОЧКУ

        //добавляем надпись
        container.add(label);
        //добавляем текстовое поле
        container.add(input);

        //логически объединяем строки выбора в одно поле с ответами
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        //добавляем первую строку выбора
        container.add(radioButton1);

        //объявляем строку выбора "radioButton1" изначально выбранной
        radioButton1.setSelected(true);

        //добавляем вторую строку выбора
        container.add(radioButton2);

        //добавляем место для галочки
        container.add(box1);

        //реализуем кнопке возможность действовать
        // (при нажатии будет реализован метод "ButtonEvent")
        button1.addActionListener(new ButtonEventAct());

        //добавляем кнопку
        container.add(button1);
    }



    //создаем класс вызываемый кнопкой
    class ButtonEventAct implements ActionListener
    {
        //название обязательно такое, оно идет из "ActionListener"
        public void actionPerformed (ActionEvent e)
        {
            String message = "";
            message += "Вы нажали кнопку\n";
            message += "Вы написали: " + input.getText() + "\n";


            message += (radioButton1.isSelected() ? "Radio#1" : "Radio#2")+ "is selected" + "\n";


            message += "CheckBox is " + ((box1.isSelected()) ? "Press" : "not Press");

            //вывод сообщения новым окном
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }
}

