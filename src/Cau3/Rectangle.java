/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau3;

/**
 *
 * @author sonnlh
 */
class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {
    }
    
    public Rectangle(double width, double length) {
    }

    public Rectangle(double width, double length, String color, boolean filled) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(double area) {
        return area;
    }
    public double getPerimeter(double perimeter) {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
}