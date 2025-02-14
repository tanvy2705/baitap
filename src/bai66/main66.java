package bai66;

public class main66 {
    public static void main(String[] args) {
        animal a1 = new animal("pun") {
            @Override
            public void greets() {
                super.greets();
            }
        };
    }
}
