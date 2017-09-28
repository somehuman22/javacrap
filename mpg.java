public class Car {
    //declarations
    int myStartMiles;
    int myEndMiles;
    double myGallonsUsed;
    
    //constructor
    public Car(int odometerReading) {
        this.myStartMiles = odometerReading;
    }
    
    //get mpg
    double calculateMPG() {
        return (this.myEndMiles - this.myStartMiles) / this.myGallonsUsed;
    }
    
    //?????
    void fillUp(int odometerReading, double gallons) {
        this.myGallonsUsed += gallons;
        this.myEndMiles += odometerReading;
    }
}
