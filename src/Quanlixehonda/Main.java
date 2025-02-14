package Quanlixehonda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Danhsachxetrongcuahang;
        // Danh sách các xe trong cửa hàng
        ArrayList<Xe> danhSachXe = new ArrayList<>();
        danhSachXe.add(new Xe("Honda Civic", "CIVIC01", "THUE01", 800000000, "2024-01-10", false));
        danhSachXe.add(new Xe("Honda CR-V", "CRV01", "THUE02", 1000000000, "2024-02-15", false));
        danhSachXe.add(new Xe("Honda City", "CITY01", "THUE03", 600000000, "2024-01-05", false));
        danhSachXe.add(new Xe("Honda Accord", "ACCORD01", "THUE04", 1200000000, "2023-12-20", false));
        danhSachXe.add(new Xe("Honda HR-V", "HRV01", "THUE05", 900000000, "2024-03-01", false));

        // Danh sách người mua xe
        ArrayList<NguoiMuaXe> danhSachNguoiMua = new ArrayList<>();
// nhap

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== QUẢN LÝ HỆ THỐNG MUA BÁN XE HONDA ===");
            System.out.println("1. Nhập thông tin người mua xe");
            System.out.println("2. Tính tiền mua xe");
            System.out.println("3. Sắp xếp danh sách người mua theo ngày mua hoặc số tích điểm");
            System.out.println("4. Hiển thị danh sách người mua xe");
            System.out.println("5. Hiển thị danh sách xe còn lại trong cửa hàng");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Bỏ qua ký tự xuống dòng
            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập họ tên người mua: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String soDienThoai = scanner.nextLine();
                    System.out.print("Nhập số căn cước công dân: ");
                    String soCanCuoc = scanner.nextLine();
                }
                case 2 -> {
                    System.out.print("Nhập giá gốc của xe (VND): ");
                    double basePrice = scanner.nextDouble();
                    System.out.print("Nhập thuế VAT (%): ");
                    double vatRate = scanner.nextDouble();
                    System.out.print("Nhập thuế trước bạ (%): ");
                    double registrationTaxRate = scanner.nextDouble();
                    System.out.print("Nhập các chi phí khác (VND): ");
                    double otherCosts = scanner.nextDouble();
                    // Tính toán các chi phí
                    double vatAmount = basePrice * (vatRate / 100);
                    double registrationTaxAmount = basePrice * (registrationTaxRate / 100);
                    double totalCost = basePrice + vatAmount + registrationTaxAmount + otherCosts;
                    // Hiển thị kết quả
                    System.out.println("\nCHI TIẾT CHI PHÍ MUA XE:");
                    System.out.printf("Giá gốc: %.2f VND\n", basePrice);
                    System.out.printf("Thuế VAT: %.2f VND\n", vatAmount);
                    System.out.printf("Thuế trước bạ: %.2f VND\n", registrationTaxAmount);
                    System.out.printf("Chi phí khác: %.2f VND\n", otherCosts);
                    System.out.printf("Tổng chi phí: %.2f VND\n", totalCost);
                }
                case 3 -> {

                }
                case 4 -> {
                    System.out.println("danh sách Người mua xe");


                }
                }

            }
            while (choice > 6) ;
            scanner.close();
        }
    }



