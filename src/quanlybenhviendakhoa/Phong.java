package quanlybenhviendakhoa;

public class Phong {
        private String idPhong;
        private String tenPhong;
        private int soLuongGiuong;
        private int soLuongBenhNhan;

        public Phong(String idPhong, String tenPhong, int soLuongGiuong) {
            this.idPhong = idPhong;
            this.tenPhong = tenPhong;
            this.soLuongGiuong = soLuongGiuong;
            this.soLuongBenhNhan = 0;
        }

        // Getter và Setter
        public String getIdPhong() {
            return idPhong;
        }

        public void setIdPhong(String idPhong) {
            this.idPhong = idPhong;
        }

        public String getTenPhong() {
            return tenPhong;
        }

        public void setTenPhong(String tenPhong) {
            this.tenPhong = tenPhong;
        }

        public int getSoLuongGiuong() {
            return soLuongGiuong;
        }

        public void setSoLuongGiuong(int soLuongGiuong) {
            this.soLuongGiuong = soLuongGiuong;
        }

        public int getSoLuongBenhNhan() {
            return soLuongBenhNhan;
        }

        // Thêm bệnh nhân
        public boolean themBenhNhan() {
            if (soLuongBenhNhan < soLuongGiuong) {
                soLuongBenhNhan++;
                return true;
            }
            System.out.println("Phòng quá tải, không thể thêm bệnh nhân!");
            return false;
        }

        // Xóa bệnh nhân
        public void xoaBenhNhan() {
            if (soLuongBenhNhan > 0) {
                soLuongBenhNhan--;
            }
        }

        @Override
        public String toString() {
            return "Phong{" +
                    "ID phòng='" + idPhong + '\'' +
                    ", Tên phòng='" + tenPhong + '\'' +
                    ", Số lượng giường=" + soLuongGiuong +
                    ", Số lượng bệnh nhân=" + soLuongBenhNhan +
                    '}';
        }
    }

