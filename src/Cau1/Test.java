/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau1;

class Test {
    
    public static void main(String[] args) {
        CamSanh camSanh = new CamSanh();
        camSanh.setGiaBan(100);
        camSanh.setMaHQ("CS01");
        camSanh.setNgayNhap("11/11/2020");
        camSanh.setSoLuong(1000);
        camSanh.setTenHQ("Cam Sành");
        camSanh.setXuatXu("China");
        camSanh.getGiaBan();
        camSanh.getMaHQ();
        camSanh.getNgayNhap();
        camSanh.getSoLuong();
        camSanh.getTenHQ();
        camSanh.getXuatXu();
        
        QuaTao quaTao = new QuaTao();
        quaTao.setGiaBan(200);
    }
}