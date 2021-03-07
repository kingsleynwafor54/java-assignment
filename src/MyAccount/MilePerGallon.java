package MyAccount;

import java.util.Scanner;

public class MilePerGallon {
private  double miles;
private  double gallons;
    public void setMiles(double miles){
        this.miles=miles;
    }
public void setGallons(double gallons){
        this.gallons=gallons;
}
    public double milePerGallons(double miles, double gallons) {
        double trip = 0;

        if (miles > 0 && gallons > 0) {

            trip = miles / gallons;



        }
        return trip;
    }



    public double getMiles() {
        return miles;
    }
public double getGallons(){
        return gallons;
}
}