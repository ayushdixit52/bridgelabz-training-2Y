import static java.lang.Math.*;  // static import for pow()

class InterestCalculator {

    // Method to calculate Simple Interest
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    // Method to calculate Compound Interest
    public double calculateCompoundInterest(double principal, double rate, double time) {
        // using pow() from Math (allowed due to static import)
        return principal * (pow((1 + rate / 100), time)) - principal;
    }
}

public class seven{
    public static void main(String[] args) {

        InterestCalculator ic = new InterestCalculator();

        double principal = 10000;
        double rate = 5;
        double time = 2;

        // Simple Interest
        double si = ic.calculateSimpleInterest(principal, rate, time);

        // Compound Interest using pow()
        double ci = ic.calculateCompoundInterest(principal, rate, time);

        System.out.println("===== Banking System Interest Calculator =====");
        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time (Years): " + time);
        System.out.println("----------------------------------------------");
        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
