package com.javacourse.se.lesson20;

public enum Music
{
    CLASSIC(2,"ClassicMusic" ), ROCK(4,"RockMusic"), POP(6,"PopMusic");

    private int i;
    private String name;

    Music(int i, String name)
    {
        this.i = i;
        this.name = name;
    }

    public int getI()
    {
        return i;
    }

    public String getName()
    {
        return name;
    }

    public void showText()
    {
        System.out.println("ShowMusic");
        System.out.println(Music.CLASSIC.getI());
    }
}
