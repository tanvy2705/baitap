package quanlybenhviendakhoa;

import java.util.ArrayList;

public class Khoa {
    private String idkhoa;
    private String tenkhoa;
    private ArrayList<String> danhsachbasi;
    public Khoa(String idkhoa, String tenkhoa) {
        this.idkhoa = idkhoa;
        this.tenkhoa = tenkhoa;
        this.danhsachbasi = danhsachbasi;
    }
    public String getIdkhoa() {
        return idkhoa;
    }
    public void setIdkhoa(String idkhoa) {
        this.idkhoa = idkhoa;
    }
    public String getTenkhoa() {
        return tenkhoa;
    }
    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }
    public ArrayList<String> getDanhsachbasi() {
        return danhsachbasi;
    }
    public void setDanhsachbasi(ArrayList<String> danhsachbasi) {
        this.danhsachbasi = danhsachbasi;
    }
    public void thembacsi(String idbacsi){
         this.danhsachbasi.add(idbacsi);
    }
    public void xoabacsi(String idbacsi){
        this.danhsachbasi.remove(idbacsi);
    }

    @Override
    public String toString() {
        return "Khoa{" +
                "idkhoa='" + idkhoa + '\'' +
                ", tenkhoa='" + tenkhoa + '\'' +
                ", danhsachbasi=" + danhsachbasi +
                '}';
    }

}
