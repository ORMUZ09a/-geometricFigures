package com.tecmilenio.ormuz;

public class Rectangle implements Shape{
    private double sideLength;   // cm
    private double heightLength; // cm

    public Rectangle(double sideLength,double heigthLegth) {
        this.sideLength = sideLength;
        this.heightLength = heigthLegth;
    }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    public void setHeightLength(double heightLength) {
        this.heightLength = heightLength;
    }
    public double getSideLength() {
        return sideLength;
    }

    public double getHeightLength() {
        return heightLength;
    }

    @Override
    public double area() {
        return sideLength * heightLength;
    }

    @Override
    public double perimeter() {
        return (2 * sideLength) + (2 * heightLength);
    }
}
