/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau1;

public class HoaQua {
    
    private String maHQ;
    private String tenHQ;
    private float giaBan;
    private String xuatXu;
    private String ngayNhap;
    private float soLuong;
    
    public HoaQua() {
        
    }

    public HoaQua(String maHQ, String tenHQ, float giaBan, String xuatXu, String ngayNhap, float soLuong) {
        this.maHQ = maHQ;
        this.tenHQ = tenHQ;
        this.giaBan = giaBan;
        this.xuatXu = xuatXu;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
    }
    
    public String getMaHQ() {
        return maHQ;
    }

    public void setMaHQ(String maHQ) {
        this.maHQ = maHQ;
    }

    public String getTenHQ() {
        return tenHQ;
    }

    public void setTenHQ(String tenHQ) {
        this.tenHQ = tenHQ;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }
    
     void cat() {
        System.out.println("Cắt");
    }
    void got() {
        System.out.println("Gọt");
    }
}