/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau3;

/**
 *
 * @author sonnlh
 */
class Circle extends Shape {
    
    private double radius = 1.0;

    public Circle(double radius) {
    }

    public Circle(double radius, String color, boolean filled) {
    }
    
    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(double area) {
        return area;
    }
    public double getPerimeter(double perimeter) {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}
