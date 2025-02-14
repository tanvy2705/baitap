package quanlybenhviendakhoa;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Danh sách các đối tượng quản lý
        ArrayList<Khoa> danhSachKhoa = new ArrayList<>();
        ArrayList<BacSi> danhSachBacSi = new ArrayList<>();
        ArrayList<Phong> danhSachPhong = new ArrayList<>();
        ArrayList<Benhnhan> danhSachBenhNhan = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n=== QUẢN LÝ BỆNH VIỆN ĐA KHOA ===");
            System.out.println("1. Thêm khoa");
            System.out.println("2. Thêm bác sĩ");
            System.out.println("3. Thêm phòng");
            System.out.println("4. Thêm bệnh nhân");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Xóa bỏ ký tự xuống dòng

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập ID khoa: ");
                    String idKhoa = scanner.nextLine();
                    System.out.print("Nhập tên khoa: ");
                    String tenKhoa = scanner.nextLine();
                    Khoa khoa = new Khoa(idKhoa, tenKhoa);
                    danhSachKhoa.add(khoa);
                    System.out.println("Thêm khoa thành công!");
                }
                case 2 -> {
                    System.out.print("Nhập ID bác sĩ: ");
                    String idBacSi = scanner.nextLine();
                    System.out.print("Nhập tên bác sĩ: ");
                    String tenBacSi = scanner.nextLine();
                    System.out.print("Nhập ID khoa đảm nhiệm: ");
                    String idKhoaDamNhiem = scanner.nextLine();
                    BacSi bacSi = new BacSi(idBacSi, tenBacSi, idKhoaDamNhiem);
                    danhSachBacSi.add(bacSi);
                    System.out.println("Thêm bác sĩ thành công!");
                }
                case 3 -> {
                    System.out.print("Nhập ID phòng: ");
                    String idPhong = scanner.nextLine();
                    System.out.print("Nhập tên phòng: ");
                    String tenPhong = scanner.nextLine();
                    System.out.print("Nhập số lượng giường: ");
                    int soLuongGiuong = scanner.nextInt();
                    scanner.nextLine();
                    Phong phong = new Phong(idPhong, tenPhong, soLuongGiuong);
                    danhSachPhong.add(phong);
                    System.out.println("Thêm phòng thành công!");
                }
                case 4 -> {
                    System.out.print("Nhập ID bệnh nhân: ");
                    String idBenhNhan = scanner.nextLine();
                    System.out.print("Nhập tên bệnh nhân: ");
                    String tenBenhNhan = scanner.nextLine();
                    System.out.print("Nhập ID bệnh: ");
                    String idBenh = scanner.nextLine();
                    System.out.print("Nhập ID phòng: ");
                    String idPhong = scanner.nextLine();
                    System.out.print("Nhập ngày nhập viện (dd/MM/yyyy): ");
                    String ngayNhapVien = scanner.nextLine();
                    System.out.print("Nhập ID bác sĩ đảm nhiệm: ");
                    String idBacSiDamNhiem = scanner.nextLine();
                    Benhnhan benhNhan = new Benhnhan(idBenhNhan, tenBenhNhan, idBenh, idPhong, ngayNhapVien, idBacSiDamNhiem);
                    danhSachBenhNhan.add(benhNhan);
                    System.out.println("Thêm bệnh nhân thành công!");
                }
                case 5 -> System.out.println("Thoát chương trình!");
                default -> System.out.println("Chức năng không hợp lệ!");
            }
        } while (choice != 5);

        scanner.close();

    }
}
