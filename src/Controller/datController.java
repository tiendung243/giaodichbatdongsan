/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dat;
import Model.DiaChi;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class datController {
    public static void nhapttDat(){
        Dat d = new Dat();
         DiaChi chi = new DiaChi();
        System.out.println("moi nhap dien tich:");
        d.setDienTich( new Scanner(System.in).nextInt());
        System.out.println("moi nhap don gia:");
        d.setDonGia(new Scanner(System.in).nextInt());
        System.out.println("moi nhap loai dat(A,B,C):");
        d.setLoaiDat(new Scanner(System.in).nextLine());
        System.out.println("moi nhap ma giao dich:");
        d.setMaGiaoDich(new Scanner(System.in).nextLine());
        d.setNgayGiaoDich(new java.util.Date());
        System.out.println("moi nhap trang thai: ");
        d.setTrangThai(new Scanner(System.in).nextLine());
        System.out.println("moi nhap dia chi");
        System.out.println("so nha:");
        chi.setSoNha(new Scanner(System.in).nextLine());
        System.out.println("ngo nha:");
        chi.setNgoNha(new Scanner(System.in).nextLine());
        System.out.println("moi nhap ten duong.");
        chi.setTenDuong(new Scanner(System.in).nextLine());
        System.out.println("moi nhap xa phuong");
        chi.setXaPhuong(new Scanner(System.in).nextLine());
        System.out.println("moi nhap quan huyen:");
        chi.setQuanHuyen(new Scanner(System.in).nextLine());
        System.out.println("moi nhap tinh thanh pho :");
        chi.setTinhThanhPho(new Scanner(System.in).nextLine());
        d.setDiaChi(chi);
        
        Common.listDat.add(d);  
        
    }
    public static void xuatttDat(String ma){
        
        
        ArrayList<Dat> list = Common.listDat;
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMaGiaoDich().contains(ma)){
                System.out.println(i +" : "+list.get(i));
        }
            
    }
    
    }
    
    
}
