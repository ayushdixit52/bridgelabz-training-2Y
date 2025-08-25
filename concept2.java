// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int number = input.nextInt();
//         boolean isDivisible = (number % 5 == 0);
//         System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
//         input.close();
//     }
// // }

// Q2
// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int number1 = input.nextInt();
//         int number2 = input.nextInt();
//         int number3 = input.nextInt();
//         boolean isFirstSmallest = (number1 < number2) && (number1 < number3);
//         System.out.println("Is the first number the smallest? " + isFirstSmallest);
//         input.close();
//     }
// }

// Q3
// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int number1 = input.nextInt();
//         int number2 = input.nextInt();
//         int number3 = input.nextInt();
//         boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
//         boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
//         boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);
//         System.out.println("Is the first number the largest? " + isFirstLargest);
//         System.out.println("Is the second number the largest? " + isSecondLargest);
//         System.out.println("Is the third number the largest? " + isThirdLargest);
//         input.close();
//     }
// }

// Q4
// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int number = input.nextInt();
//         if (number >= 1) {
//             int sum = number * (number + 1) / 2;
//             System.out.println("The sum of " + number + " natural numbers is " + sum);
//         } else {
//             System.out.println("The number " + number + " is not a natural number");
//         }
//         input.close();
//     }
// }

// Q5

// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int age = input.nextInt();
//         if (age >= 18) {
//             System.out.println("The person's age is " + age + " and can vote.");
//         } else {
//             System.out.println("The person's age is " + age + " and cannot vote.");
//         }
//         input.close();
//     }
// }

// Q6

// import java.util.Scanner;

// public class concept2{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int number = input.nextInt();
//         if (number > 0) {
//             System.out.println("positive");
//         } else if (number < 0) {
//             System.out.println("negative");
//         } else {
//             System.out.println("zero");
//         }
//         input.close();
//     }
// }

// Q7

// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int month = input.nextInt();
//         int day = input.nextInt();
//         boolean isSpring = (month == 3 && day >= 20) ||
//                            (month == 4) ||
//                            (month == 5) ||
//                            (month == 6 && day <= 20);
//         if (isSpring) {
//             System.out.println("It's a Spring Season");
//         } else {
//             System.out.println("Not a Spring Season");
//         }
//         input.close();
//     }
// }

// Q8

// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int counter = input.nextInt();
//         while (counter >= 1) {
//             System.out.println(counter);
//             counter--;
//         }
//         input.close();
//     }
// }

// Q9
// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int counter = input.nextInt();
//         for (int i = counter; i >= 1; i--) {
//             System.out.println(i);
//         }
//         input.close();
//     }
// }

// Q10
// import java.util.Scanner;

// public class concept2{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         double total = 0.0;
//         double value = input.nextDouble();
//         while (value != 0) {
//             total += value;
//             value = input.nextDouble();
//         }
//         System.out.println("Total sum is: " + total);
//         input.close();
//     }
// }

// Q11

// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         double total = 0.0;
//         while (true) {
//             double value = input.nextDouble();
//             if (value <= 0) {
//                 break;
//             }
//             total += value;
//         }
//         System.out.println("Total sum is: " + total);
//         input.close();
//     }
// }

// Q12

// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int number = input.nextInt();
//         if (number >= 1) {
//             int sum = 0;
//             int i = 1;
//             while (i <= number) {
//                 sum += i;
//                 i++;
//             }
//             int formulaSum = number * (number + 1) / 2;
//             System.out.println("Sum using loop: " + sum);
//             System.out.println("Sum using formula: " + formulaSum);
//         } else {
//             System.out.println("Not a natural number");
//         }
//         input.close();
//     }
// }

// Q13

// import java.util.Scanner;

// public class concept2{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int number = input.nextInt();
//         if (number >= 1) {
//             int sum = 0;
//             for (int i = 1; i <= number; i++) {
//                 sum += i;
//             }
//             int formulaSum = number * (number + 1) / 2;
//             System.out.println("Sum using loop: " + sum);
//             System.out.println("Sum using formula: " + formulaSum);
//         } else {
//             System.out.println("Not a natural number");
//         }
//         input.close();
//     }
// }

// Q14
// import java.util.Scanner;

// public class concept2{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int number = input.nextInt();
//         if (number >= 0) {
//             int factorial = 1;
//             int i = 1;
//             while (i <= number) {
//                 factorial *= i;
//                 i++;
//             }
//             System.out.println("Factorial is: " + factorial);
//         } else {
//             System.out.println("Not a positive integer");
//         }
//         input.close();
//     }
// }

// Q15
// import java.util.Scanner;

// public class concept2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int number = input.nextInt();
//         if (number >= 0) {
//             int factorial = 1;
//             for (int i = 1; i <= number; i++) {
//                 factorial *= i;
//             }
//             System.out.println("Factorial is: " + factorial);
//         } else {
//             System.out.println("Not a positive integer");
//         }
//         input.close();
//    
// }








