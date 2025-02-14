package Quanlixehonda;

public class Xe implements Printable {
    private String tenXe;
    private String maSoXe;
    private String maSoThue;
    private double giaTien;
    private String ngayNhap;
    private boolean trangThai;

    public Xe(String tenXe, String maSoXe, String maSoThue, double giaTien, String ngayNhap, boolean trangThai) {
        this.tenXe = tenXe;
        this.maSoXe = maSoXe;
        this.maSoThue = maSoThue;
        this.giaTien = giaTien;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getMaSoXe() {
        return maSoXe;
    }

    public void setMaSoXe(String maSoXe) {
        this.maSoXe = maSoXe;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void print() {
        System.out.println("Xe{" +
                "Tên xe='" + tenXe + '\'' +
                ", Mã số xe='" + maSoXe + '\'' +
                ", Mã số thuế='" + maSoThue + '\'' +
                ", Giá tiền=" + giaTien +
                ", Ngày nhập='" + ngayNhap + '\'' +
                ", Trạng thái=" + (trangThai ? "Đã bán" : "Còn trong kho") +
                '}');

    }
}
