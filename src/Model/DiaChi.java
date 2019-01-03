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
public class DiaChi {
    private String soNha;
    private String ngoNha;
    private String tenDuong;
    private String xaPhuong;
    private String quanHuyen;
    private String tinhThanhPho;

    public DiaChi() {
    }

    public DiaChi(String soNha, String ngoNha, String tenDuong, String xaPhuong, String quanHuyen, String tinhThanhPho) {
        this.soNha = soNha;
        this.ngoNha = ngoNha;
        this.tenDuong = tenDuong;
        this.xaPhuong = xaPhuong;
        this.quanHuyen = quanHuyen;
        this.tinhThanhPho = tinhThanhPho;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getNgoNha() {
        return ngoNha;
    }

    public void setNgoNha(String ngoNha) {
        this.ngoNha = ngoNha;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getTinhThanhPho() {
        return tinhThanhPho;
    }

    public void setTinhThanhPho(String tinhThanhPho) {
        this.tinhThanhPho = tinhThanhPho;
    }

    @Override
    public String toString() {
        return " soNha : " + soNha + ", ngoNha : " + ngoNha + ", tenDuong  : " + tenDuong + " xaPhuong : " + 
                xaPhuong + ", quanHuyen : " + quanHuyen + ", tinhThanhPho : " + tinhThanhPho ;
    }
    
    
    
    
    
}
