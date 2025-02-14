package quanlybenhviendakhoa;

public class Benhnhan {
   private String idBenhNhan;
   private String hoTen;
   private String ngaySinh;
   private String idPhong;

   public Benhnhan(String idBenhNhan, String hoTen, String ngaySinh, String idPhong, String p345, String idBacSiDamNhiem) {
      this.idBenhNhan = idBenhNhan;
      this.hoTen = hoTen;
      this.ngaySinh = ngaySinh;
      this.idPhong = idPhong;
   }

   // Getter và Setter
   public String getIdBenhNhan() {
      return idBenhNhan;
   }

   public void setIdBenhNhan(String idBenhNhan) {
      this.idBenhNhan = idBenhNhan;
   }

   public String getHoTen() {
      return hoTen;
   }

   public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
   }

   public String getNgaySinh() {
      return ngaySinh;
   }

   public void setNgaySinh(String ngaySinh) {
      this.ngaySinh = ngaySinh;
   }

   public String getIdPhong() {
      return idPhong;
   }

   public void setIdPhong(String idPhong) {
      this.idPhong = idPhong;
   }

   @Override
   public String toString() {
      return "BenhNhan{" +
              "ID bệnh nhân='" + idBenhNhan + '\'' +
              ", Họ tên='" + hoTen + '\'' +
              ", Ngày sinh='" + ngaySinh + '\'' +
              ", ID phòng='" + idPhong + '\'' +
              '}';
   }
}