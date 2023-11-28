package org.example.timbChalka.InheritanceCharllenge;

public class OutLander extends Car {
    private  int roadServiceMonths;

//    String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear  THESE ARE THE INHERITED FIELDS FROM THE SUPERCLASS
    public OutLander(int roadServiceMonths) {
        super("OutLander","4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;

    }
    public  void accelerate(int rate){
//        rate is the increase in speed either high speed + (positive numbers or low speed-(negative numbers)
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity ==0){
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        }else {
            changeGear(4);
        }

        if ( newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }


}
