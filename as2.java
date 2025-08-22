// Q1
// public class as2 {
//     public static void main(String[] args) {
//         int bornyear=2000;
//         int curryear=2024;
//         int age=curryear-bornyear;
//         System.out.println("Harry's age in 2024 is "+age);
//     }
// }

// Q2
// public class as2 {
//     public static void main(String[] args) {
//         int maths = 94;
//         int physics = 95;
//         int chemistry = 96;

//         double average = (maths + physics + chemistry) / 3.0;

//         System.out.println("Sam’s average mark in PCM is " + average);
//     }
// }

// Q3
// public class as2 {
//     public static void main(String[] args) {
//         double kilometers = 10.8;
//         double miles = kilometers * 1.6;

//         System.out.println("The distance " + kilometers + " km in miles is " + miles);
//     }
// }

// Q4
// public class as2 {
//     public static void main(String[] args) {
//         double costPrice = 129;
//         double sellingPrice = 191;

//         double profit = sellingPrice - costPrice;
//         double profitPercentage = (profit / costPrice) * 100;

//         System.out.println(
//             "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
//             "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
//         );
//     }
// }

// Q5
// public class as2{
//     public static void main(String[] args) {
//         int totalPens = 14;
//         int students = 3;

//         int pensPerStudent = totalPens / students;
//         int remainingPens = totalPens % students;

//         System.out.println(
//             "The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens
//         );
//     }
// }

// Q6
// public class as2 {
//     public static void main(String[] args) {
//         double fee = 125000;
//         double discountPercent = 10;

//         double discount = (fee * discountPercent) / 100;
//         double finalFee = fee - discount;

//         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
//     }
// }

// Q7
// public class as2 {
//     public static void main(String[] args) {
//         double radiusKm = 6378;
//         double pi = 3.141592653589793;

//         // Volume formula: (4/3) * π * r^3
//         double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

//         // 1 km = 0.621371 miles → 1 km³ = (0.621371)^3 mi³
//         double conversionFactor = Math.pow(0.621371, 3);
//         double volumeMi3 = volumeKm3 * conversionFactor;

//         System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
//                            " and cubic miles is " + volumeMi3);
//     }
// }

// Q8
// import java.util.Scanner;

// public class as2 {
//     public static void main(String[] args) {
//         double km;

//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter distance in kilometers: ");
//         km = input.nextDouble();

//         double miles = km / 1.6;

//         System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

//         input.close();
//     }
// }

// Q9
// import java.util.Scanner;

// public class as2 {
//     public static void main(String[] args) {
//         double fee, discountPercent;

//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the student fee (INR): ");
//         fee = input.nextDouble();

//         System.out.print("Enter the university discount percentage: ");
//         discountPercent = input.nextDouble();

//         // Calculate discount
//         double discount = (fee * discountPercent) / 100;
//         double finalFee = fee - discount;

//         System.out.println("The discount amount is INR " + discount +
//                            " and final discounted fee is INR " + finalFee);

//         input.close();
//     }
// }

// Q10
// import java.util.Scanner;

// public class as2 {
//     public static void main(String[] args) {
//         double heightCm;

//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter your height in centimeters: ");
//         heightCm = input.nextDouble();

//         // 1 inch = 2.54 cm
//         double totalInches = heightCm / 2.54;

//         // 1 foot = 12 inches
//         int feet = (int) (totalInches / 12);
//         double inches = totalInches % 12;

//         System.out.println("Your Height in cm is " + heightCm + 
//                            " while in feet is " + feet + 
//                            " and inches is " + String.format("%.2f", inches));

//         input.close();
//     }
// }

// Q11
// import java.util.Scanner;

// public class as2 {
//     public static void main(String[] args) {
//         double number1, number2;

//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         number1 = input.nextDouble();

//         System.out.print("Enter the second number: ");
//         number2 = input.nextDouble();

//         double addition = number1 + number2;
//         double subtraction = number1 - number2;
//         double multiplication = number1 * number2;
//         double division = number2 != 0 ? number1 / number2 : Double.NaN;

//         System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
//             + number1 + " and " + number2 + " is " 
//             + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

//         input.close();
//     }
// }

// Q12
// import java.util.Scanner;

// public class as2{
//     public static void main(String[] args) {
//         double base, height;

//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the base of the triangle (in inches): ");
//         base = input.nextDouble();

//         System.out.print("Enter the height of the triangle (in inches): ");
//         height = input.nextDouble();

//         double areaInInches = 0.5 * base * height;
//         double areaInCm = areaInInches * 6.4516;

//         System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");

//         input.close();
//     }
// }

// Q13
// import java.util.Scanner;

// public class as2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter the perimeter of the square: ");
//         double perimeter = input.nextDouble();

//         double side = perimeter / 4;

//         System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

//         input.close();
//     }
// }

// Q14
// import java.util.Scanner;

// public class as2{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter distance in feet: ");
//         double distanceInFeet = input.nextDouble();

//         // 1 yard = 3 feet
//         double distanceInYards = distanceInFeet / 3;

//         // 1 mile = 1760 yards
//         double distanceInMiles = distanceInYards / 1760;

//         System.out.println("The distance " + distanceInFeet + " feet is " + distanceInYards + " yards and " + distanceInMiles + " miles");

//         input.close();
//     }
// }

// Q15
// import java.util.Scanner;

// public class as2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter unit price of the item (INR): ");
//         double unitPrice = input.nextDouble();

//         System.out.print("Enter quantity to be bought: ");
//         int quantity = input.nextInt();

//         double totalPrice = unitPrice * quantity;

//         System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

//         input.close();
//     }
// }

// Q16
// import java.util.Scanner;

// public class as2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter number of students: ");
//         int numberOfStudents = input.nextInt();

//         int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

//         System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes);

//         input.close();
//     }
// }














