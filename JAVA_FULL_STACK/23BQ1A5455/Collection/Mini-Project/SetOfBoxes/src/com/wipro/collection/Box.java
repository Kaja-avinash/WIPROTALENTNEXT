package com.wipro.collection;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box() {

    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(getVolume()).hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Box other = (Box) obj;

        return Double.compare(this.getVolume(), other.getVolume()) == 0;
    }

    @Override
    public String toString() {

        return "Length =" + length +
               " Width =" + width +
               " Height =" + height +
               " Volume =" + String.format("%.2f", getVolume());

    }

}