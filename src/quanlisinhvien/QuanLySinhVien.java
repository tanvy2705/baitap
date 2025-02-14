package quanlisinhvien;

import java.util.ArrayList;

public class QuanLySinhVien {
 private ArrayList<SinhVien>quanLySinhVien;
 public QuanLySinhVien() {
     quanLySinhVien = new ArrayList<>();
 }
 public void themsinhvien( SinhVien sv ){
     quanLySinhVien.add(sv);
     System.out.println("da them sinhvien: "+sv);
 }
 public void hienthidanhsach(){
     if(quanLySinhVien.isEmpty()){
         System.out.println("danh sach sinh vien trong.");
         return;
     }
     System.out.println("danh sach sinh vien:");
     for(SinhVien sv : quanLySinhVien){
         System.out.println(sv);
     }
 }
    public SinhVien timSinhVien(String id) {
        for (SinhVien sv : quanLySinhVien) {
            if (sv.getId().equals(id)) {
                return sv;
            }
        }
        return null;
    }
    public void xoaSinhVien(){
     quanLySinhVien.clear();
        System.out.println(quanLySinhVien + "da xoa sinh vien");
    }


    public void capNhatDiem(String idSinhVien, String maMH, double diem) {
        SinhVien sv = timSinhVien(idSinhVien);
        if (sv != null) {
            sv.capNhatDiem(maMH, diem);
        } else {
            System.out.println("Không tìm thấy sinh viên với ID: " + idSinhVien);
        }
    }

    public void hienThiDiem(String idSinhVien) {
        SinhVien sv = timSinhVien(idSinhVien);
        if (sv != null) {
            sv.hienThiDiem();
        } else {
            System.out.println("Không tìm thấy sinh viên với ID: " + idSinhVien);
        }
    }

    public void xoaSinhVien(String idXoa) {

    }
}


