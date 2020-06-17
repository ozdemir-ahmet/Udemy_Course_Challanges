package com.ozdemir;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid (double width, double length, double height) {
        super(Rectangle);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (height * super.getAreea());
    }
}
