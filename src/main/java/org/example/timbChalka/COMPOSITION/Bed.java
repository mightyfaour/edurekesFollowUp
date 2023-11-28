package org.example.timbChalka.COMPOSITION;

public class Bed {
    private String style;
    private int pillow;
    private int height;
    private int sheet;
    private int quil;

    public Bed(String style, int pillow, int height, int sheet, int quil) {
        this.style = style;
        this.pillow = pillow;
        this.height = height;
        this.sheet = sheet;
        this.quil = quil;
    }

    public void make(){
        System.out.println("Bed --> making");
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getPillow() {
        return pillow;
    }

    public void setPillow(int pillow) {
        this.pillow = pillow;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSheet() {
        return sheet;
    }

    public void setSheet(int sheet) {
        this.sheet = sheet;
    }

    public int getQuil() {
        return quil;
    }

    public void setQuil(int quil) {
        this.quil = quil;
    }
}
