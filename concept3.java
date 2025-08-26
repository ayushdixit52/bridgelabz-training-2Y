import java.util.Scanner;

public class concept3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        }

        // 2
        double salary = sc.nextDouble();
        int serviceYears = sc.nextInt();
        if (serviceYears > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        }

        // 3
        int tableNum = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(tableNum + " * " + i + " = " + (tableNum * i));
        }

        // 4
        int fizzNum = sc.nextInt();
        if (fizzNum > 0) {
            for (int i = 1; i <= fizzNum; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        // 5
        int fizzNum2 = sc.nextInt();
        int i = 1;
        if (fizzNum2 > 0) {
            while (i <= fizzNum2) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }

        // 6
        int age1 = sc.nextInt();
        int height1 = sc.nextInt();
        int age2 = sc.nextInt();
        int height2 = sc.nextInt();
        int age3 = sc.nextInt();
        int height3 = sc.nextInt();

        int youngestAge = age1;
        String youngest = "Amar";
        if (age2 < youngestAge) {
            youngestAge = age2;
            youngest = "Akbar";
        }
        if (age3 < youngestAge) {
            youngest = "Anthony";
        }
        System.out.println("Youngest: " + youngest);

        int tallestHeight = height1;
        String tallest = "Amar";
        if (height2 > tallestHeight) {
            tallestHeight = height2;
            tallest = "Akbar";
        }
        if (height3 > tallestHeight) {
            tallest = "Anthony";
        }
        System.out.println("Tallest: " + tallest);

        // 7
        int factorNum = sc.nextInt();
        if (factorNum > 0) {
            for (int j = 1; j < factorNum; j++) {
                if (factorNum % j == 0) {
                    System.out.println(j);
                }
            }
        }

        // 8
        int factorNum2 = sc.nextInt();
        int j = 1;
        if (factorNum2 > 0) {
            while (j < factorNum2) {
                if (factorNum2 % j == 0) {
                    System.out.println(j);
                }
                j++;
            }
        }

        // 9
        int gfNum = sc.nextInt();
        int greatestFactor = 1;
        for (int k = gfNum - 1; k >= 1; k--) {
            if (gfNum % k == 0) {
                greatestFactor = k;
                break;
            }
        }
        System.out.println("Greatest Factor: " + greatestFactor);

        // 10
        int gfNum2 = sc.nextInt();
        int counter = gfNum2 - 1;
        int gf = 1;
        while (counter >= 1) {
            if (gfNum2 % counter == 0) {
                gf = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest Factor: " + gf);

        sc.close();
    }
}
