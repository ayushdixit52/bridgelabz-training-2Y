interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    void charge() {
        System.out.println(model + " is charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void refuel() {
        System.out.println(model + " is refueling");
    }
}

public class ques11 {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle(160, "Tesla Model 3");
        PetrolVehicle p = new PetrolVehicle(180, "Honda City");
        e.charge();
        p.refuel();
    }
}
