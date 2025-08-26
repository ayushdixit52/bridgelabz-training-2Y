import java.util.Scanner;

public class as12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        // System.out.println("Enter two numbers for basic arithmetic operations:");
        // float number1 = scanner.nextFloat();
        // float number2 = scanner.nextFloat();
        // float sum = number1 + number2;
        // float diff = number1 - number2;
        // float product = number1 * number2;
        // float division = number1 / number2;
        // System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + sum + ", " + diff + ", " + product + ", and " + division);

        // 2
        // System.out.println("Enter base and height of triangle in cm:");
        // float base = scanner.nextFloat();
        // float height = scanner.nextFloat();
        // float areaCm = 0.5f * base * height;
        // float areaInch = areaCm / (2.54f * 2.54f);
        // System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);

        // 3
        // System.out.println("Enter perimeter of a square:");
        // float perimeter = scanner.nextFloat();
        // float side = perimeter / 4;
        // System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // 4
        // System.out.println("Enter distance in feet:");
        // float distanceInFeet = scanner.nextFloat();
        // float distanceInYards = distanceInFeet / 3;
        // float distanceInMiles = distanceInYards / 1760;
        // System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        // 5
        // System.out.println("Enter unit price and quantity:");
        // float unitPrice = scanner.nextFloat();
        // int quantity = scanner.nextInt();
        // float totalPrice = unitPrice * quantity;
        // System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        // 6
        // System.out.println("Enter two integers to find quotient and remainder:");
        // int int1 = scanner.nextInt();
        // int int2 = scanner.nextInt();
        // int quotient = int1 / int2;
        // int remainder = int1 % int2;
        // System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + int1 + " and " + int2);

        // 7
        // System.out.println("Enter three integers a, b, and c:");
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int c = scanner.nextInt();
        // int result1 = a + b * c;
        // int result2 = a * b + c;
        // int result3 = c + a / b;
        // int result4 = a % b + c;
        // System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        // 8
        System.out.println("Enter three double values a, b, and c:");
        double da = scanner.nextDouble();
        double db = scanner.nextDouble();
        double dc = scanner.nextDouble();
        double dresult1 = da + db * dc;
        double dresult2 = da * db + dc;
        double dresult3 = dc + da / db;
        double dresult4 = da % db + dc;
        System.out.println("The results of Double Operations are " + dresult1 + ", " + dresult2 + ", " + dresult3 + ", and " + dresult4);
    }
}


