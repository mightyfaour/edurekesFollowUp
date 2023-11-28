package org.example.timbChalka.COMPOSITION;

public class Ceiling {
    private int wall;
    private int paintedColor;

    public Ceiling(int wall, int paintedColor) {
        this.wall = wall;
        this.paintedColor = paintedColor;
    }

    public int getWall() {
        return wall;
    }

    public void setWall(int wall) {
        this.wall = wall;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

    public void setPaintedColor(int paintedColor) {
        this.paintedColor = paintedColor;
    }
}
