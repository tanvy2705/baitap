package Quanlixehonda;

import quanlybenhviendakhoa.QuanLy;

public class NguoiQuanLy implements Printable {
    private String hoTen;
    private String soDienThoai;
    private String soCanCuocCongDan;

    public NguoiQuanLy(String hoTen, String soDienThoai, String soCanCuocCongDan) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soCanCuocCongDan = soCanCuocCongDan;

    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getSoCanCuocCongDan() {
        return soCanCuocCongDan;
    }
    public void setSoCanCuocCongDan(String soCanCuocCongDan) {
        this.soCanCuocCongDan = soCanCuocCongDan;
    }
    public void print() {
        System.out.println("HoTen: " + hoTen);
        System.out.println("SoDienThoai: " + soDienThoai);
        System.out.println("SoCanCuocCongDan: " + soCanCuocCongDan);

    }


}
