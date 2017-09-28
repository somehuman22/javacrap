public class Car {
    int myStartMiles;
    int myEndMiles;
    double myGallonsUsed;

    public Car(int odometerReading) {
        this.myStartMiles = odometerReading;
    }

    double calculateMPG() {
        return (this.myEndMiles - this.myStartMiles) / this.myGallonsUsed;
    }

    void fillUp(int odometerReading, double gallons) {
        this.myGallonsUsed += gallons;
        this.myEndMiles += odometerReading;
    }
}
