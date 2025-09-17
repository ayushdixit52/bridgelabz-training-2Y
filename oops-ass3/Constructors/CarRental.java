package Constructors;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final int COST_PER_DAY = 1000;

    // Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    private int calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + 
                           ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }
}
