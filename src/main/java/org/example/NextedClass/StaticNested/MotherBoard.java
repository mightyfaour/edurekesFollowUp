package org.example.NextedClass.StaticNested;

public class MotherBoard {
    String color;
    static class USB{
        int USB1 = 2;
        int USB2 = 3;
        int getTotalPort(){
//            String x = MotherBoard.this.color;
            return USB1 + USB2;
        }
    }
    class Processor{
        double score;
        String manufacturer;
        double getCache(){
            return 4.5;
        }
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard();
        MotherBoard.USB usb = new USB();
        System.out.println("Total number of ports are: " + usb.getTotalPort());
        System.out.println();

        MotherBoard.Processor processor = motherBoard.new Processor();
        

//        System.out.println(processor.getCache());
//        System.out.println(processor.manufacturer);
//        System.out.println(processor.score);
    }
}
