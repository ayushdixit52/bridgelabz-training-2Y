// import java.util.Scanner;
// 1
// public class concept4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a year (>= 1582): ");
//         int year = scanner.nextInt();

//         if (year < 1582) {
//             System.out.println("Year must be greater than or equal to 1582.");
//         } else {
//             if (year % 4 == 0) {
//                 if (year % 100 == 0) {
//                     if (year % 400 == 0) {
//                         System.out.println(year + " is a Leap Year.");
//                     } else {
//                         System.out.println(year + " is not a Leap Year.");
//                     }
//                 } else {
//                     System.out.println(year + " is a Leap Year.");
//                 }
//             } else {
//                 System.out.println(year + " is not a Leap Year.");
//             }
//         }
//         scanner.close();
//     }
// }

// 2
// import java.util.Scanner;

// public class concept4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a year (>= 1582): ");
//         int year = scanner.nextInt();

//         if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
//             System.out.println(year + " is a Leap Year.");
//         } else if (year < 1582) {
//             System.out.println("Year must be greater than or equal to 1582.");
//         } else {
//             System.out.println(year + " is not a Leap Year.");
//         }
//         scanner.close();
//     }
// }

// 4
// import java.util.Scanner;

// public class concept4{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number greater than 1: ");
//         int number = scanner.nextInt();
//         boolean isPrime = true;

//         if (number <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= Math.sqrt(number); i++) {
//                 if (number % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime) {
//             System.out.println(number + " is a Prime Number.");
//         } else {
//             System.out.println(number + " is not a Prime Number.");
//         }
//         scanner.close();
//     }
// }

// 5
// import java.util.Scanner;

// public class concept4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         int sum = 0;
//         int originalNumber = number;

//         while (originalNumber != 0) {
//             int digit = originalNumber % 10;
//             sum += digit * digit * digit;
//             originalNumber /= 10;
//         }

//         if (number == sum) {
//             System.out.println(number + " is an Armstrong Number.");
//         } else {
//             System.out.println(number + " is not an Armstrong Number.");
//         }
//         scanner.close();
//     }
// }

// 6
// import java.util.Scanner;

// public class concept4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter an integer: ");
//         int number = scanner.nextInt();
//         int count = 0;

//         if (number == 0) {
//             count = 1;
//         } else {
//             while (number != 0) {
//                 number /= 10;
//                 count++;
//             }
//         }

//         System.out.println("The number of digits is: " + count);
//         scanner.close();
//     }
// }

// 7
// import java.util.Scanner;

// public class concept4{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         int sum = 0;
//         int originalNumber = number;

//         while (originalNumber != 0) {
//             sum += originalNumber % 10;
//             originalNumber /= 10;
//         }

//         if (number % sum == 0) {
//             System.out.println(number + " is a Harshad Number.");
//         } else {
//             System.out.println(number + " is not a Harshad Number.");
//         }
//         scanner.close();
//     }
// }

// 8
// import java.util.Scanner;

// public class concept4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         int sum = 0;

//         for (int i = 1; i < number; i++) {
//             if (number % i == 0) {
//                 sum += i;
//             }
//         }

//         if (sum > number) {
//             System.out.println(number + " is an Abundant Number.");
//         } else {
//             System.out.println(number + " is not an Abundant Number.");
//         }
//         scanner.close();
//     }
// }

// 9
import java.util.Scanner;

public class concept4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = scanner.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }
        scanner.close();
    }
}

