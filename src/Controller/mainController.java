/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dat;
import Model.Nha;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class mainController {

    public static void controller() {
        while (true) {
            System.out.println("----------- MAIN MENU -------------");
            System.out.println("1: Them thong tin can nha moi.");
            System.out.println("2: Them thong tin mau dat moi.");
            System.out.println("3: Hien thi danh sach nha trong he thong.");
            System.out.println("4: Hien thi danh sach dat trong he thong");
            System.out.println("5: Xuat danh sach nha dat theo ma giao dich.");
            System.out.println("6: Tinh trung binh thanh tien nha va dat.");
            System.out.println("7  Hien thi tong doanh thu.");
            System.out.println("8: Thoat khoi he thong.");
            System.out.println("Moi ban chon phuong thuc .");
            try {
                int a = new Scanner(System.in).nextInt();

                switch (a) {
                    case 1:
                        System.out.println("THEM THONG TIN NHA MOI\n MOI NHAP CHINH XAC CAC THONG TIN");
                        nhaController.nhapttNha();
                        for (Nha n : Common.listNha) {
                            System.out.println(n.toString());
                        }
                        break;
                    case 2:
                        System.out.println("THEM THONG TIN DAT MOI\n MOI NHAP CHINH XAC CAC THONG TIN");
                        datController.nhapttDat();
                        break;
                    case 3:
                        showDanhSachNha();
                        break;
                    case 4:
                        showDanhSachDat();
                    case 5:
                        timKiemTheoMa();
                        break;
                    case 6:
                        avgThanhTien();
                        break;

                    case 7:
                        hienThiTongDoanhThu();
                        break;

                    case 8:
                        System.exit(8);
                    default:
                        System.out.println("Phuong thuc nay chua duoc xay dung.");

                }
            } catch (Exception e) {
                //  printStackTrace(e);
                System.out.println("Nhap sai dinh dang! vui long nhap lai.");
            }

        }
    }

    public static void showDanhSachNha() {
        try {
            System.out.println("----------- DANH SACH NHA ------------");
            ArrayList<Nha> list = Common.listNha;
            for (Nha nha : list) {
                System.out.println(nha.toString());

            }
        } catch (NullPointerException e) {
            System.out.println("Danh sach trong!");
        }

    }

    public static void showDanhSachDat() {
        try {
            System.out.println("----------- DANH SACH DAT ------------");
            ArrayList<Dat> list = Common.listDat;
            for (Dat dat : list) {
                System.out.println(dat.toString());

            }
        } catch (NullPointerException e) {
            System.out.println("Danh sach trong!");
        }

    }

    public static void avgThanhTien() {
        try {
            System.out.println("--- Trung binh thanh tien cua nha va dat.");
            ArrayList<Nha> list1 = Common.listNha;
            long tongThanhTien = 0;
            for (Nha list11 : list1) {
                tongThanhTien += list11.getThanhTien();
            }
            ArrayList<Dat> list2 = Common.listDat;
            for (Dat dat : list2) {
                tongThanhTien += dat.getThanhTien();
            }
            int x = list1.size() + list2.size();
            System.out.println("-----   " + x + "   ------   (VND)");
        } catch (NullPointerException e) {
            System.out.println("Danh sach nha va dat dang trong!");
        }
    }

    public static void timKiemTheoMa() {
        System.out.println("----- Tim Kiem Theo Ma Giao Dich -----");

        System.out.println("----- Moi Ban Nhap Ma Giao Dich -----");
        String ma = new Scanner(System.in).nextLine();
        System.out.println("DANH SACH NHA: ");
        nhaController.xuatttNha(ma);
        System.out.println("--------------\n\n");
        System.out.println("DANH SACH DAT: ");
        datController.xuatttDat(ma);
        System.out.println("--------------");

    }

    public static void hienThiTongDoanhThu() {

        try {
            System.out.println("------ Tong Doanh Thu ------");
            ArrayList<Nha> list1 = Common.listNha;
            long tongThanhTien = 0;

            for (Nha list11 : list1) {
                tongThanhTien += list11.getThanhTien();
            }
            ArrayList<Dat> list2 = Common.listDat;
            for (Dat dat : list2) {
                tongThanhTien += dat.getThanhTien();
            }
            System.out.println("-----   " + tongThanhTien + "   ------   (VND)");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("danh sach trong!");
        }
    }

}
