package com.company;

import com.company.delegate.Circle;
import com.company.delegate.IDraw;
import com.company.delegate.Painter;
import com.company.delegate.Square;

public class Main {

    public static void main(String[] args) {
	singleton singleton1 = singleton.getInstance("numer1");
    singleton singleton2 = singleton.getInstance("numer2");
    singleton singleton3 = singleton.getInstance("numer3");
    System.out.println(singleton3.value);

        Painter painter= new Painter();
        painter.setiDraw(new Circle());
        painter.draw();
        painter.setiDraw(new Square());
        painter.draw();
    }
}
