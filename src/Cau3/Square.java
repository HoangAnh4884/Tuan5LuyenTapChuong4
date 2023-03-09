/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau3;

/**
 *
 * @author sonnlh
 */
class Squaren extends Rectangle{
    private double side;
    
    public Squaren() {
    }
    public Squaren(double side) {
    }
    public Squaren(double side, String color, boolean filled) {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Squaren{" + "side=" + side + '}';
    }
}