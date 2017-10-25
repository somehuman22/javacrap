public class Polygon {
    public int myNumSides;
    public double mySidesLength;
    public double myR;
    public double myr;

    public Polygon(){
        myNumSides = 3;
        mySidesLength = 10;
        myr = 0.5 * mySidesLength * (1.0 / Math.tan( (Math.PI / myNumSides) ));
        myR = .5 * mySidesLength * ( 1.0 / Math.sin((Math.PI / myNumSides)));
    }

    public Polygon(int numSides, double sideLength){
        myNumSides = numSides;
        mySidesLength = sideLength;
        myr = 0.5 * mySidesLength * (1.0 / Math.tan( (Math.PI / (double)myNumSides) ));
        myR = 0.5 * mySidesLength * ( 1.0 / Math.sin((Math.PI / (double)myNumSides)));
    }

    /*
    private void calcr(){
        myr = 0.5 * mySidesLength * (1.0 / Math.tan( (Math.PI / myNumSides) ));
    }

    private void calcR(){
        myR = .5 * mySidesLength * ( 1.0 / Math.sin((Math.PI / myNumSides)));
    }
    */

    public double getVertexAngle(){
        return ((double)(myNumSides-2) / myNumSides) * 180;
    }

    public double getPerimeter(){
        return mySidesLength * myNumSides;
    }

    public double getArea(){
        return 0.5 * myNumSides * Math.pow(myR,2) * (1.0/Math.sin( (2*Math.PI) / myNumSides ));
    }



}
