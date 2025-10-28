// Simulated package: com.company.analytics.sales
class SalesReport {
    public void printSalesData() {
        System.out.println("=== Sales Report ===");
        System.out.println("North Region: ₹1,25,000");
        System.out.println("South Region: ₹98,000");
        System.out.println("East Region:  ₹1,10,500");
        System.out.println("West Region:  ₹87,300");
    }
}

// Simulated package: com.company.analytics.hr
class EmployeeReport {
    public void printEmployeePerformance() {
        System.out.println("\n=== Employee Performance Report ===");
        System.out.println("Employee: Ayush Dixit  | Rating: Excellent");
        System.out.println("Employee: Mohan Sharma | Rating: Good");
        System.out.println("Employee: Riya Verma   | Rating: Average");
    }
}

// Simulated main package: com.company.analytics
public class nine {
    public static void main(String[] args) {
        SalesReport sales = new SalesReport();
        EmployeeReport hr = new EmployeeReport();

        System.out.println("===== Company Analytics Report =====");
        sales.printSalesData();
        hr.printEmployeePerformance();

        System.out.println("\n===== Summary =====");
        System.out.println("Overall Sales: Strong in North and East regions.");
        System.out.println("Employee Performance: Majority rated Good or above.");
        
        System.out.println("\n--- Concept Explanation ---");
        System.out.println("In Java, sub-packages are independent of their parent packages.");
        System.out.println("For example, com.company.analytics.sales and com.company.analytics.hr");
        System.out.println("are separate packages — importing one does not automatically import the other.");
        System.out.println("Each sub-package must be explicitly imported using its full name.");
    }
}

