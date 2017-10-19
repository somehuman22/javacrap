package com.company;
import gpdraw.*;

public class Muller{
    static SketchPad poster = new SketchPad(600,600);
    static DrawingTool pen = new DrawingTool(poster);
    public Muller(){}

    public void drawLines() {
        pen.up();
        pen.move(0,40);
        pen.down();
        pen.setDirection(180);
        pen.forward(100);

        pen.up();
        pen.move(0,-40);
        pen.down();
        pen.setDirection(180);
        pen.forward(100);
    }

    public void drawSlanted(){
        pen.up();
        pen.setDirection(145);
        pen.down();
        pen.forward(20);
        pen.up();
        pen.move(-100,-40);
        pen.down();
        pen.setDirection(215);
        pen.forward(20);
        pen.up();

        pen.move(0,-40);
        pen.setDirection(35);
        pen.down();
        pen.forward(20);
        pen.up();
        pen.move(0,-40);
        pen.down();
        pen.setDirection(325);
        pen.forward(20);




        pen.up();
        pen.move(-100,40);
        pen.down();
        pen.setDirection(325);
        pen.forward(20);
        pen.move(-100,40);
        pen.setDirection(35);
        pen.forward(20);

        pen.up();

        pen.move(0,40);
        pen.setDirection(215);
        pen.down();
        pen.forward(20);
        pen.up();
        pen.move(0,40);
        pen.down();
        pen.setDirection(145);
        pen.forward(20);

    }
}
