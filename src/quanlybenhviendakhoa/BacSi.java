package quanlybenhviendakhoa;

import java.util.ArrayList;

public class BacSi extends Person {
     private String idbacSi;
     private String idKhoaDamNhiem;
     private ArrayList<String> DanhSachQuanLyBenhNhanDuocDamNhiem;
     public BacSi(String name,String year,String address){
         super(name,year,address);
         this.idbacSi = idbacSi;
         this.idKhoaDamNhiem= idKhoaDamNhiem;
         this.DanhSachQuanLyBenhNhanDuocDamNhiem= new ArrayList<>();
     }
     //
    public String getIdbacSi() {
         return idbacSi;
    }
    public void setIdbacsi(String idbacsi){
         this.idbacSi = idbacsi;
    }
    public String getIdKhoaDamNhiem() {
         return idKhoaDamNhiem;
    }
    public void setIdKhoaDamNhiem(String idKhoaDamNhiem) {
         this.idKhoaDamNhiem = idKhoaDamNhiem;
    }
    public ArrayList<String> getDanhSachQuanLyBenhNhanDuocDamNhiem(){
         return DanhSachQuanLyBenhNhanDuocDamNhiem;
    }
    public void chinhsuathongtinbacsi(String newname,String newaddress){
         setIdKhoaDamNhiem(idKhoaDamNhiem);
    }
    public void doikhoadamnhiem(String newKhoaPhuSan,String newKhoaThanKinh){
         this.setIdKhoaDamNhiem(newKhoaThanKinh);
         this.setIdKhoaDamNhiem(newKhoaPhuSan);
    }

    @Override
    public String toString() {
        return "BacSi{" +
                "idbacSi='" + idbacSi + '\'' +
                ", idKhoaDamNhiem='" + idKhoaDamNhiem + '\'' +
                ", DanhSachQuanLyBenhNhanDuocDamNhiem=" + DanhSachQuanLyBenhNhanDuocDamNhiem +
                '}';
    }
}
