public class Rectangle {

    //variables
    private double myX;
    private double myY;
    private double myWidth;
    private double  myHeight;
    private DrawingTool pen;
    private SketchPad paper;

    //constructor
    public Rectangle(double x, double y, double width, double height){
        this.myX = x;
        this.myY = y;
        this.myHeight = height;
        this.myWidth = width;
        this.paper = new SketchPad(600,600);
        this.pen = new DrawingTool(this.paper);
    }


    public double getArea(){
        return this.myHeight * this.myWidth;
    }

    public double getPerimiter(){
        return (2 * this.myHeight) + (2 * this.myWidth);
    }

    public void draw(){
        this.pen.drawRect(this.myHeight,this.myWidth);
    }
}
