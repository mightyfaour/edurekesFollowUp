package org.example.timbChalka.Interface1;

public class interface_example {
    interface Computer{
        void code();
    }

    class Laptop implements Computer{

        @Override
        public void code() {
            System.out.println("Code, Compile, Run...");
        }
    }
    class Desktop implements Computer{

        @Override
        public void code() {
            System.out.println("Code, Compile, Run... : FASTER!!!");
        }
    }

    public void main(String[] args) {
        Computer Lap = new Laptop();
        Lap.code();
        Computer Desk = new Desktop();
        Desk.code();

        // Future support for Tablet
         Computer tablet = new Tablet();
         tablet.code();
    }
}
