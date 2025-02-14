package quanlybenhviendakhoa;

    import java.util.ArrayList;

    public class QuanLy {
        private ArrayList<Khoa> danhSachKhoa;
        private ArrayList<Phong> danhSachPhong;
        private ArrayList<Benhnhan> danhSachBenhNhan;

        public QuanLy() {
            danhSachKhoa = new ArrayList<>();
            danhSachPhong = new ArrayList<>();
            danhSachBenhNhan = new ArrayList<>();
        }

        // Thêm khoa
        public void themKhoa(Khoa khoa) {
            danhSachKhoa.add(khoa);
        }

        // Thêm phòng
        public void themPhong(Phong phong) {
            danhSachPhong.add(phong);
        }

        // Thêm bệnh nhân
        public void themBenhNhan(Benhnhan benhNhan) {
            danhSachBenhNhan.add(benhNhan);
            for (Phong phong : danhSachPhong) {
                if (phong.getIdPhong().equals(benhNhan.getIdPhong())) {
                    phong.themBenhNhan();
                    return;
                }
            }
            System.out.println("Không tìm thấy phòng!");
        }

        // Hiển thị danh sách bệnh nhân
        public void hienThiBenhNhan() {
            for (Benhnhan benhNhan : danhSachBenhNhan) {
                System.out.println(benhNhan);
            }
        }
    }

