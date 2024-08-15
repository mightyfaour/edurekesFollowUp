package org.example.NextedClass.AccessingMembers;

public class Car {
    String carName;
    String carType;

    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }
    private String getCarName() {
        return this.carName;
    }


    public class Engine{
        String engineType;

        public String getEngineType() {
            return this.engineType;
        }

        public void setEngineType() {
            if (Car.this.carType.equals("4WD")) {
                if (Car.this.getCarName().equals("Crysla")) {
                    this.engineType = "Smaller";
                }
                else{
                    this.engineType = "Bigger";
                }
            }
            else {
                this.engineType = "Bigger";
            }
        }

    }
}
