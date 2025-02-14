package qlsach;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Qlsach ql = new Qlsach();
            Scanner sc = new Scanner(System.in);
            int luachon;
            do {
                System.out.println("------------------");
                System.out.println("1.Hiển thị sách ");
                System.out.println("2.thêm sách");
                System.out.println("3.sửa thông tin");
                System.out.println("4 xoa danh sach");
                System.out.println("5.thoát");
                System.out.println("chọn:");
                luachon = sc.nextInt();
                sc.nextLine();
                switch (luachon) {
                    case 1:
                        ql.hienthi();

                        break;
                    case 2:
                        System.out.println("nhap id sách");
                        String masach = sc.nextLine();
                        System.out.println(" nhap ten sach");
                        String ten = sc.nextLine();
                        System.out.println("nhap ten tác giả");
                        String tentg = sc.nextLine();
                        System.out.println("nhap ten nha xuat ban");
                        String tennxbb = sc.nextLine();
                        ql.themsach(new Sach(masach, ten, tentg, tennxbb));
                        break;
                    case 3:
                        System.out.println("nhap ma sach can sua:");
                        String sua = sc.nextLine();
                        System.out.println("nhap ten sach moi");
                        String newName = sc.nextLine();
                        System.out.println("nhap tac gia moi");
                        String tg = sc.nextLine();
                        System.out.println("nhap nha xuat ban moi");
                        String b = sc.nextLine();
                        ql.suasach(sua, newName, tg, b);
                        break;
                    case 4:
                        System.out.print("Nhập ID sách cần xóa: ");
                        String idXoa = sc.nextLine();
                        ql.xoaSach(idXoa);
                        break;

                    case 5:
                        System.out.println("thoat chuong trinh");
                        break;
                    default:
                        System.out.println("lua chon khong hop le");

                }
            } while (luachon != 0);
            sc.close();
        }

    }


