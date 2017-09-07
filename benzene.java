import gpdraw.*;

public class Main {

    public static void main(String[] args) {

        //create stuff
        SketchPad poster = new SketchPad(600,600);
        DrawingTool marker = new DrawingTool(poster);

        //draw circle
        marker.drawCircle(50);


        //hexagon
        marker.up();
        marker.move(37,-65);
        marker.setDirection(60);
        marker.down();
        marker.forward(75);
        marker.turnLeft(60);
        marker.forward(75);
        marker.turnLeft(60);
        marker.forward(75);
        marker.turnLeft(60);
        marker.forward(75);
        marker.turnLeft(60);
        marker.forward(75);
        marker.turnLeft(60);
        marker.forward(75);

    }
}

