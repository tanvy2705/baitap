package qlsach;

public class Sach {
        private String id;
        private String tensach;
        private String tentacgia;
        private String tennxb;
        public Sach(String id, String tensach, String tentacgia, String tennxb) {
            super();
            this.id = id;
            this.tensach = tensach;
            this.tentacgia = tentacgia;
            this.tennxb = tennxb;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getTensach() {
            return tensach;
        }
        public void setTensach(String tensach) {
            this.tensach = tensach;
        }
        public String getTentacgia() {
            return tentacgia;
        }
        public void setTentacgia(String tentacgia) {
            this.tentacgia = tentacgia;
        }
        public String getTennxb() {
            return tennxb;
        }
        public void setTennxb(String tennxb) {
            this.tennxb = tennxb;
        }
        @Override
        public String toString() {
            return "Sach [id=" + id + ", tensach=" + tensach + ", tentacgia=" + tentacgia + ", tennxb=" + tennxb + "]";
        }
       }


