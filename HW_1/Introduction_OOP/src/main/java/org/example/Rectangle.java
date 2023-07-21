package org.example;

public class Rectangle
{
    private int width;
    private int height;

    public void setWidth(int value){width = value;}
    public int getWidth(){return width;}
    public void setHeight(int value){height = value;}
    public int getHeight(){return height;}

    public int calculateArea(){return width * height;}
    public int calculatePerimeter(){return (2*(width + height));}
    Rectangle()
    {
        width = 10;
        height = 10;
    }
    Rectangle(int width,int height)
    {
        this.width = width;
        this.height = height;
    }

}
