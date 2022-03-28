package com.javacourse.se.lesson28;

public class Robot <T extends Head>
{
    private Body body;
    private T Head;

    public Robot(Body body, T head)
    {
        this.body = body;
        Head = head;
    }

    public Body getBody()
    {
        return body;
    }

    public void setBody(Body body)
    {
        this.body = body;
    }

    public T getHead()
    {
        return Head;
    }

    public void setHead(T head)
    {
        Head = head;
    }
}
