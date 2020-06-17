package com.ozdemir;

public class Rectangle {
    private double width;
    private double lenght;

    public Rectangle(double width, double lenght) {
        if (width < 0) {
            this.width = 0;
        }else {
            this.width = width;
        }

        if (length < 0) {
            this.lenght = 0;
        } else {
            this.lenght = lenght;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getAreea() {
        return (lenght * width);
    }
}
