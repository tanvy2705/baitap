package Quanlixehonda;

public class NguoiMuaXe implements Printable{
    private String hoTen;
    private String soDienThoai;
    private String soCanCuocCongDan;
    private int soTichDiem;
    private String ngayMua;
    private String tenXeMua;

    public NguoiMuaXe(String hoTen,String soDienThoai,String soCanCuocCongDan,int soTichDiem,String ngayMua,String tenXeMua){
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soCanCuocCongDan = soCanCuocCongDan;
        this.soTichDiem = soTichDiem;
        this.ngayMua = ngayMua;
        this.tenXeMua = tenXeMua;
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
    public void tangtichdiem(){
        this.soTichDiem++;
    }
    public String getNgayMua() {
        return ngayMua;
    }
    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }
    public String getTenXeMua() {
        return tenXeMua;
    }
    public void setTenXeMua(String tenXeMua) {
        this.tenXeMua = tenXeMua;
    }
    public void print(){
        System.out.println(this.hoTen);
        System.out.println(this.soDienThoai);
        System.out.println(this.soCanCuocCongDan);
        System.out.println(this.soTichDiem);
        System.out.println(this.ngayMua);
        System.out.println(this.tenXeMua);
    }




}
