import gpdraw.DrawingTool;
import gpdraw.SketchPad;

public class CirclesHorizontal {
        public static void main(String[] args) {
            // write your code here
            SketchPad poster = new SketchPad(600,900);
            DrawingTool marker = new DrawingTool(poster);

            //left circle
            marker.drawCircle(30);
            marker.drawString("Left");

            //big circle
            marker.up();
            marker.move(100,0);
            marker.down();
            marker.drawCircle(70);
            marker.drawString("Big");
            //right circle
            marker.up();
            marker.move(220,0);
            marker.down();
            marker.drawCircle(50);
            marker.drawString("Right");
            
            //above circle
            marker.up();
            marker.move(100,110);
            marker.down();
            marker.drawCircle(40);
            marker.drawString("Above");
        }
}

