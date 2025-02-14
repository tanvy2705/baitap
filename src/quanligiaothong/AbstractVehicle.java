package quanligiaothong;

public abstract class AbstractVehicle implements Vehicle{
    protected String name;
    protected int mileage;    protected double baseMaintenanceCost;


    public AbstractVehicle(String name, double baseMaintenanceCost) {
        this.name = name;
        this.baseMaintenanceCost = baseMaintenanceCost;
    }

    abstract double calculateFuelCost();

    @Override
    public void move(int distance) {
        mileage += distance;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + getType());
        System.out.println("Mileage: " + mileage);
        System.out.println("Base maintenance cost: " + baseMaintenanceCost);
    }
}
