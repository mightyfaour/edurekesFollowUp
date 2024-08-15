package org.example.timbChalka.OOP.ENCAPSULATION;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {

        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        else {this.tonerLevel = -1;}
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else {
            return -1;
        }
    }
    public int printPages(int pages){
        int pagesToPrint = (pages / 2) + (pages % 2);
        if (this.duplexPrinter){
//            pagesToPrint /= 2;
            pagesToPrint = (pages/2)+(pages%2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
