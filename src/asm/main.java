package asm;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyMyPham ql = new QuanLyMyPham();
        do {
            System.out.println("\n+=========Menu=========+");
            System.out.println("| 1. Nhập danh sách mỹ phẩm");
            System.out.println("| 2. Xuất danh sách mỹ phẩm");
            System.out.println("| 3. Tìm mỹ phẩm có số lượng mua nhiều nhất");
            System.out.println("| 4. Sắp xếp theo tổng tiền giảm dần");
            System.out.println("| 5. Kế thừa");
            System.out.println("| 0. Thoat             ");
            System.out.println("+======================+");

            System.out.print("Nhập chương trình cần chạy: ");
            int n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1 -> ql.nhap();
                case 2 -> ql.inThongTin();
                case 3 -> ql.search();
                case 4 -> ql.sapXep();
                case 5 -> ql.keThua();
                case 0 -> System.exit(0);
                default -> System.out.println("Nhập sai, yêu cầu nhập lại");
            }
        } while (true);
    }
}
