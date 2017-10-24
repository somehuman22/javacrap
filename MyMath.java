public class MyMath {
    public static double fToC(double f){
        return (f-32) * .5556;
    }
    public static double cToF(double c) {
        return (1.8 * c) + 32;
    }
    public static double sphereVolume(double r){
        return (4.0/3.0) * 3.1415 * Math.pow(r,3);
    }
    public static double getHypothenuse(double a, double b){
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
    public static void quadratic(double a, double b, double c){
        double x1 = ( -b + Math.sqrt(Math.pow(b,2) - 4.0*a*c) ) / (2 * a);
        double x2 = ( -b - Math.sqrt(Math.pow(b,2) - 4.0*a*c) ) / (2 * a);
        System.out.println(x1 + ", "+   x2);
    }

}
