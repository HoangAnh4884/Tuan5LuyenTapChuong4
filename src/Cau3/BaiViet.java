/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau3;

/*
    có tất cả 3 quan hệ thừa kế
        lớp cha Shape - con Circle
        lớp cha Shape - con Rectangle
        lớp cha Rectangle - con Square

    Vì lớp Circle là con của lớp Shape chứ ko phải là con lớp Rectangle
*/

class BaiViet {
    public static void main(String[] args) {
        Circle ce = new Circle();
        ce.setColor("Vàng");
        ce.setFilled(true);
        ce.setRadius(2.5);
        ce.getArea(2);
        ce.getColor();
        ce.getPerimeter(10);
        ce.getRadius();
        
        Rectangle re = new Rectangle();
        re.setColor("Xanh");
        re.setFilled(true);
    }
}