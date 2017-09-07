class Main {

    public static void main(String[] args) {
	    // write your code here
        SketchPad poster = new SketchPad(600,900);
        DrawingTool marker = new DrawingTool(poster);

        //small circle
        marker.drawCircle(50);
        marker.drawString("Small");

        //middle circle
        marker.up();
        marker.move(0,120);
        marker.down();
        marker.drawCircle(70);
        marker.drawString("Middle");

        //big circle
        marker.up();
        marker.move(0,280);
        marker.down();
        marker.drawCircle(90);
        marker.drawString("Big");
    }
}
