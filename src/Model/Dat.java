/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class Dat extends NhaDat {
    private String loaiDat;
    private long thanhTien;

    public Dat() {
    }

    public Dat(String loaiDat, int donGia, float dienTich) {
        super(donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien() {
        if("A".equals(this.loaiDat))
        this.thanhTien =  (long) ( 1.5*(super.getDonGia() * super.getDienTich()));
        else{
            this.thanhTien =  (long) (super.getDonGia() * super.getDienTich());
        }
    }

    @Override
    public String toString() {
        return "---   " + "loaiDat : " + loaiDat + ", thanhTien :  " + this.thanhTien +", don gia : "+ super.getDonGia() + ", dien tich :  "+super.getDienTich()
                +", trang thai : "+super.getTrangThai() + ", ma giao dich : "+ super.getMaGiaoDich() + "\n dia chi :" +super.getDiaChi()+"\n Ngay giao dich: "+super.getNgayGiaoDich();
    }

   
    
    
    
    
    
}
