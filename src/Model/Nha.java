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
public class Nha extends NhaDat{
    private String loaiNha;
   
    public double thanhTien;

    public Nha() {
    }

    public Nha(String loaiNha,  long thanhTien, int donGia, float dienTich) {
        super(donGia, dienTich);
        this.loaiNha = loaiNha;
        
        this.thanhTien = thanhTien;
    }

    public Nha(String loaiNha, long thanhTien, int donGia, float dienTich, String maGiaoDich, Date ngayGiaoDich, String trangThai) {
        super(donGia, dienTich, maGiaoDich, ngayGiaoDich, trangThai);
        this.loaiNha = loaiNha;
        this.thanhTien = thanhTien;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien() {
        switch (this.loaiNha) {
            case "caocap":
                this.thanhTien =   (super.getDonGia() * super.getDienTich());
                break;
            case "tamtrung":
                this.thanhTien =  0.85 * (super.getDonGia() * super.getDienTich());
                break;
            default:
                this.thanhTien = 0.595 * (super.getDonGia()*super.getDienTich());
                break;
        }
        
    }

    @Override
    public String toString() {
        return "---   " + " loaiNha : " + loaiNha +  ", thanhTien : " + this.thanhTien + ", dien tich : "+ super.getDienTich()+
                ", don gia : "+ super.getDonGia() + ", trang thai : "+ super.getTrangThai()+ ", "
                + "ma giao dich : " + super.getMaGiaoDich() + "\n dia chi :"+super.getDiaChi()+"\n ngay giao dich: "+super.getNgayGiaoDich();
        
    }

    
    
    
    
}
