import java.util.*;

// // public class Level2Programs {
// //     public static void main(String[] args) {
// //         // Run specific classes separately
// //     }
// // }

// // class Factors {
// //     static int[] findFactors(int n){
// //         int c=0;
// //         for(int i=1;i<=n;i++)if(n%i==0)c++;
// //         int[] f=new int[c];int j=0;
// //         for(int i=1;i<=n;i++)if(n%i==0)f[j++]=i;
// //         return f;
// //     }
// //     static int sum(int[] f){int s=0;for(int x:f)s+=x;return s;}
// //     static int product(int[] f){int p=1;for(int x:f)p*=x;return p;}
// //     static int sumSquare(int[] f){int s=0;for(int x:f)s+=Math.pow(x,2);return s;}
// //     public static void main(String[] a){
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();int[] f=findFactors(n);
// //         System.out.println("Factors:");
// //         for(int x:f)System.out.println(x);
// //         System.out.println("Sum: "+sum(f));
// //         System.out.println("Sum of Squares: "+sumSquare(f));
// //         System.out.println("Product: "+product(f));
// //     }
// // }

// // class SumNaturalRecursive {
// //     static int sumRec(int n){if(n==0)return 0;return n+sumRec(n-1);}
// //     static int sumFormula(int n){return n*(n+1)/2;}
// //     public static void main(String[] a){
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();
// //         int r1=sumRec(n),r2=sumFormula(n);
// //         System.out.println("Recursive Sum: "+r1);
// //         System.out.println("Formula Sum: "+r2);
// //         System.out.println("Equal: "+(r1==r2));
// //     }
// // }

// // class LeapYear {
// //     static boolean isLeap(int y){return y>=1582&&((y%4==0&&y%100!=0)||y%400==0);}
// //     public static void main(String[] a){
// //         Scanner sc=new Scanner(System.in);
// //         int y=sc.nextInt();
// //         if(isLeap(y))System.out.println("Leap Year");
// //         else System.out.println("Not a Leap Year");
// //     }
// // }

// // class UnitConvertor1 {
// //     static double kmToMiles(double km){return km*0.621371;}
// //     static double milesToKm(double m){return m*1.60934;}
// //     static double metersToFeet(double m){return m*3.28084;}
// //     static double feetToMeters(double f){return f*0.3048;}
// //     public static void main(String[] a){
// //         System.out.println("10 km in miles: "+kmToMiles(10));
// //         System.out.println("10 miles in km: "+milesToKm(10));
// //         System.out.println("5 meters in feet: "+metersToFeet(5));
// //         System.out.println("10 feet in meters: "+feetToMeters(10));
// //     }
// // }

// // class UnitConvertor2 {
// //     static double yardsToFeet(double y){return y*3;}
// //     static double feetToYards(double f){return f*0.333333;}
// //     static double metersToInches(double m){return m*39.3701;}
// //     static double inchesToMeters(double i){return i*0.0254;}
// //     static double inchesToCm(double i){return i*2.54;}
// //     public static void main(String[] a){
// //         System.out.println("5 yards in feet: "+yardsToFeet(5));
// //         System.out.println("9 feet in yards: "+feetToYards(9));
// //         System.out.println("2 meters in inches: "+metersToInches(2));
// //         System.out.println("50 inches in meters: "+inchesToMeters(50));
// //         System.out.println("20 inches in cm: "+inchesToCm(20));
// //     }
// // }

// // class UnitConvertor3 {
// //     static double fToC(double f){return (f-32)*5/9;}
// //     static double cToF(double c){return (c*9/5)+32;}
// //     static double poundsToKg(double p){return p*0.453592;}
// //     static double kgToPounds(double k){return k*2.20462;}
// //     static double gallonsToLiters(double g){return g*3.78541;}
// //     static double litersToGallons(double l){return l*0.264172;}
// //     public static void main(String[] a){
// //         System.out.println("98F in C: "+fToC(98));
// //         System.out.println("37C in F: "+cToF(37));
// //         System.out.println("100 pounds in kg: "+poundsToKg(100));
// //         System.out.println("50 kg in pounds: "+kgToPounds(50));
// //         System.out.println("10 gallons in liters: "+gallonsToLiters(10));
// //         System.out.println("20 liters in gallons: "+litersToGallons(20));
// //     }
// // }

// // class StudentVoteChecker {
// //     static boolean canVote(int age){if(age<0)return false;return age>=18;}
// //     public static void main(String[] a){
// //         Scanner sc=new Scanner(System.in);
// //         int[] ages=new int[10];
// //         for(int i=0;i<10;i++){ages[i]=sc.nextInt();}
// //         for(int i=0;i<10;i++){
// //             System.out.println("Student "+(i+1)+" Age: "+ages[i]+" Can Vote: "+canVote(ages[i]));
// //         }
// //     }
// // }

// // class Friends {
// //     static String youngest(int[] age,String[] names){
// //         int min=age[0],idx=0;
// //         for(int i=1;i<3;i++)if(age[i]<min){min=age[i];idx=i;}
// //         return names[idx];
// //     }
// //     static String tallest(int[] h,String[] names){
// //         int max=h[0],idx=0;
// //         for(int i=1;i<3;i++)if(h[i]>max){max=h[i];idx=i;}
// //         return names[idx];
// //     }
// //     public static void main(String[] a){
// //         Scanner sc=new Scanner(System.in);
// //         String[] names={"Amar","Akbar","Anthony"};
// //         int[] age=new int[3];int[] h=new int[3];
// //         for(int i=0;i<3;i++){age[i]=sc.nextInt();h[i]=sc.nextInt();}
// //         System.out.println("Youngest: "+youngest(age,names));
// //         System.out.println("Tallest: "+tallest(h,names));
// //     }
// // }

// class PosNegEvenOdd {
//     static boolean isPositive(int n){return n>=0;}
//     static boolean isEven(int n){return n%2==0;}
//     static int compare(int a,int b){if(a>b)return 1;if(a==b)return 0;return -1;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         for(int i=0;i<5;i++)arr[i]=sc.nextInt();
//         for(int x:arr){
//             if(isPositive(x)){
//                 System.out.println(x+" is Positive");
//                 if(isEven(x))System.out.println("Even");
//                 else System.out.println("Odd");
//             }else System.out.println(x+" is Negative");
//         }
//         int cmp=compare(arr[0],arr[4]);
//         if(cmp==0)System.out.println("First and Last are Equal");
//         else if(cmp==1)System.out.println("First is Greater");
//         else System.out.println("Last is Greater");
//     }
// }

// class BMI {
//     static double calc(double w,double h){double m=h/100;return w/(m*m);}
//     static String status(double bmi){
//         if(bmi<18.5)return "Underweight";
//         else if(bmi<25)return "Normal";
//         else if(bmi<30)return "Overweight";
//         else return "Obese";
//     }
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         double[][] arr=new double[10][3];
//         for(int i=0;i<10;i++){
//             double w=sc.nextDouble(),h=sc.nextDouble();
//             double bmi=calc(w,h);
//             arr[i][0]=w;arr[i][1]=h;arr[i][2]=bmi;
//         }
//         for(int i=0;i<10;i++){
//             System.out.println("Person "+(i+1)+": Weight="+arr[i][0]+" Height="+arr[i][1]+" BMI="+arr[i][2]+" Status="+status(arr[i][2]));
//         }
//     }
// }

// class Quadratic {
//     static double[] roots(double a,double b,double c){
//         double d=b*b-4*a*c;
//         if(d<0)return new double[]{};
//         if(d==0)return new double[]{-b/(2*a)};
//         double r1=(-b+Math.sqrt(d))/(2*a),r2=(-b-Math.sqrt(d))/(2*a);
//         return new double[]{r1,r2};
//     }
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         double A=sc.nextDouble(),B=sc.nextDouble(),C=sc.nextDouble();
//         double[] r=roots(A,B,C);
//         if(r.length==0)System.out.println("No Real Roots");
//         else for(double x:r)System.out.println("Root: "+x);
//     }
// }

class RandomNumbers {
    static int[] generate(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++)arr[i]=(int)(Math.random()*9000+1000);
        return arr;
    }
    static double[] stats(int[] arr){
        double sum=0;int min=arr[0],max=arr[0];
        for(int x:arr){sum+=x;if(x<min)min=x;if(x>max)max=x;}
        return new double[]{sum/arr.length,min,max};
    }
    public static void main(String[] a){
        int[] arr=generate(5);
        System.out.println("Random Numbers:");
        for(int x:arr)System.out.println(x);
        double[] s=stats(arr);
        System.out.println("Average: "+s[0]);
        System.out.println("Min: "+s[1]);
        System.out.println("Max: "+s[2]);
    }
}
