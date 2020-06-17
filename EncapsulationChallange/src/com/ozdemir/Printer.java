package com.ozdemir;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
    }

    public int fillUp (int inkAdded) {
        if (tonerLevel + inkAdded <= 100) {
            tonerLevel += inkAdded;
        } else {
            System.out.println("too much ink added");
            return -1;
        }
        return tonerLevel;
    }

    public int printing (int pages) {
        int pagesToPrint = pages;
        if (isDuplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("printing in duplex mode");
        }
        pagesPrinted += pagesToPrint ;
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
