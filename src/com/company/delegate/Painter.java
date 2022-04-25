package com.company.delegate;

public class Painter {
    /*
    //Zamiast tak
    public void drawCircle()
    {
        System.out.println("drawing circle");

    }
    public void drawSuare()
    {
        System.out.println("drawing square");

    }

     */
    IDraw iDraw;
    public void draw(){
        iDraw.draw();
    }
    public void setiDraw(IDraw g)
    {
        iDraw = g;
    }
}
