/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhaDat {

    private int donGia;
    private float dienTich;
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private DiaChi diaChi;
    private String trangThai;
    
    public NhaDat() {
    }

    public NhaDat(int donGia, float dienTich, String maGiaoDich, Date ngayGiaoDich, String trangThai) {
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.trangThai = trangThai;
    }

    public NhaDat(int donGia, float dienTich) {
        this.donGia = donGia;
        this.dienTich = dienTich;
      
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

   

    
    
    
    
}
