package asm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyMyPham {
    ArrayList<MyPham> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    MyPham mp;

    public void nhap(){
        int nhapTieps;
        do {
            mp = new MyPham();
            System.out.print("Nhập tên: ");
            mp.setName(sc.nextLine());
            System.out.print("Nhập giá: ");
            mp.setPrice(Double.parseDouble(sc.nextLine()));
            System.out.print("Nhập số lượng: ");
            mp.setQuanlity(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhập loại (1-son/2-phan): ");
            mp.setLoai(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhập hãng sản phẩm: ");
            mp.setBrand(sc.nextLine());

            list.add(mp);
            System.out.print("Nhập tiếp hay không (1-có, 2-không): ");
            nhapTieps = Integer.parseInt(sc.nextLine());
        }while (nhapTieps==1);
    }

    public void inThongTin(){
        for (MyPham mps : list) {
            mps.inThongTin();
            System.out.println("\nTrạng thái: " + mps.trangThai());
        }
    }

    public void search(){
        MyPham max = list.get(0);
        for (MyPham mp : list) {
            if (mp.getQuanlity() > max.getQuanlity()) {
                max = mp;
            }
        }
        System.out.println("Sản phẩm có số lượng mua nhiều nhất là: ");
        max.inThongTin();
    }

    public void sapXep(){
        System.out.println("Sắp xếp theo tổng tiền giảm dần:");
        Collections.sort(list, Comparator.comparing(MyPham::tinhTien).reversed());
        inThongTin();
    }

    public void keThua(){
        Son s = new Son("A12", 30, 5, 1, "hhh", "hshs" );
        s.inThongTin();
    }
}
