package quanligiaothong;

import java.util.ArrayList;
import java.util.List;

public class mainquanligiaothong {
        public static void main(String[] args) {
            List<Vehicle> vehicles = new ArrayList<>();

            vehicles.add(new Bicycle("Merida", 10));
            vehicles.add(new Motorcycle("Honda", 50));
            vehicles.add(new Truck("Hyundai", 200, 100));

            for (Vehicle vehicle : vehicles) {
                // đổ xăng
                vehicle.refuel(10);

                // di chuyển 50km
                vehicle.move(50);

                // xuất thông tin
                vehicle.displayInfo();

                System.out.println();
            }
        }
    }


