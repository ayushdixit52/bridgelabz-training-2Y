import java.util.*;

// public class Level1Programs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // Run any class separately by calling its main
//     }
// }

// class SimpleInterest {
//     static double calculate(double p,double r,double t){return p*r*t/100;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         double p=sc.nextDouble(),r=sc.nextDouble(),t=sc.nextDouble();
//         double si=calculate(p,r,t);
//         System.out.println("The Simple Interest is "+si);
//         System.out.println("Principal: "+p);
//         System.out.println("Rate of Interest: "+r);
//         System.out.println("Time: "+t);
//     }
// }

// class Handshakes {
//     static int calculate(int n){return n*(n-1)/2;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("Maximum number of handshakes: "+calculate(n));
//     }
// }

// class TriangularPark {
//     static double rounds(int a,int b,int c){double peri=a+b+c;return 5000/peri;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
//         System.out.println("Rounds needed: "+rounds(x,y,z));
//     }
// }

// class NumberCheck {
//     static int check(int n){if(n>0)return 1;if(n<0)return -1;return 0;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int res=check(n);
//         if(res==1)System.out.println("Positive Number");
//         else if(res==-1)System.out.println("Negative Number");
//         else System.out.println("Zero");
//     }
// }

// class SpringSeason {
//     static boolean isSpring(int m,int d){return (m==3&&d>=20)||(m==6&&d<=20)||(m>3&&m<6);}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int m=sc.nextInt(),d=sc.nextInt();
//         if(isSpring(m,d))System.out.println("Its a Spring Season");
//         else System.out.println("Not a Spring Season");
//     }
// }

// class SumNaturalLoop {
//     static int sum(int n){int s=0;for(int i=1;i<=n;i++)s+=i;return s;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("Sum of first "+n+" natural numbers: "+sum(n));
//     }
// }

// class SmallestLargest {
//     static int[] find(int a,int b,int c){int min=Math.min(a,Math.min(b,c));int max=Math.max(a,Math.max(b,c));return new int[]{min,max};}
//     public static void main(String[] ar){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
//         int[] r=find(x,y,z);
//         System.out.println("Smallest: "+r[0]);
//         System.out.println("Largest: "+r[1]);
//     }
// }

// class QuotientRemainder {
//     static int[] find(int n,int d){return new int[]{n/d,n%d};}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt(),d=sc.nextInt();
//         int[] r=find(n,d);
//         System.out.println("Quotient: "+r[0]);
//         System.out.println("Remainder: "+r[1]);
//     }
// }

// class Chocolates {
//     static int[] divide(int n,int m){return new int[]{n/m,n%m};}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt(),m=sc.nextInt();
//         int[] r=divide(n,m);
//         System.out.println("Each child gets: "+r[0]);
//         System.out.println("Remaining chocolates: "+r[1]);
//     }
// }

// class WindChill {
//     static double calculate(double t,double w){return 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(w,0.16);}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         double t=sc.nextDouble(),w=sc.nextDouble();
//         System.out.println("Wind Chill Temperature: "+calculate(t,w));
//     }
// }

// class Trigonometry {
//     static double[] calc(double angle){double rad=Math.toRadians(angle);return new double[]{Math.sin(rad),Math.cos(rad),Math.tan(rad)};}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         double ang=sc.nextDouble();
//         double[] r=calc(ang);
//         System.out.println("Sine: "+r[0]);
//         System.out.println("Cosine: "+r[1]);
//         System.out.println("Tangent: "+r[2]);
//     }
// }import java.util.*;

// public class Level1Programs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // Run any class separately by calling its main
//     }
// }

// class SimpleInterest {
//     static double calculate(double p,double r,double t){return p*r*t/100;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         double p=sc.nextDouble(),r=sc.nextDouble(),t=sc.nextDouble();
//         double si=calculate(p,r,t);
//         System.out.println("The Simple Interest is "+si);
//         System.out.println("Principal: "+p);
//         System.out.println("Rate of Interest: "+r);
//         System.out.println("Time: "+t);
//     }
// }

// class Handshakes {
//     static int calculate(int n){return n*(n-1)/2;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("Maximum number of handshakes: "+calculate(n));
//     }
// }

// class TriangularPark {
//     static double rounds(int a,int b,int c){double peri=a+b+c;return 5000/peri;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
//         System.out.println("Rounds needed: "+rounds(x,y,z));
//     }
// }

// class NumberCheck {
//     static int check(int n){if(n>0)return 1;if(n<0)return -1;return 0;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int res=check(n);
//         if(res==1)System.out.println("Positive Number");
//         else if(res==-1)System.out.println("Negative Number");
//         else System.out.println("Zero");
//     }
// }

// class SpringSeason {
//     static boolean isSpring(int m,int d){return (m==3&&d>=20)||(m==6&&d<=20)||(m>3&&m<6);}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int m=sc.nextInt(),d=sc.nextInt();
//         if(isSpring(m,d))System.out.println("Its a Spring Season");
//         else System.out.println("Not a Spring Season");
//     }
// }

// class SumNaturalLoop {
//     static int sum(int n){int s=0;for(int i=1;i<=n;i++)s+=i;return s;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("Sum of first "+n+" natural numbers: "+sum(n));
//     }
// }

// class SmallestLargest {
//     static int[] find(int a,int b,int c){int min=Math.min(a,Math.min(b,c));int max=Math.max(a,Math.max(b,c));return new int[]{min,max};}
//     public static void main(String[] ar){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
//         int[] r=find(x,y,z);
//         System.out.println("Smallest: "+r[0]);
//         System.out.println("Largest: "+r[1]);
//     }
// }

// class QuotientRemainder {
//     static int[] find(int n,int d){return new int[]{n/d,n%d};}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt(),d=sc.nextInt();
//         int[] r=find(n,d);
//         System.out.println("Quotient: "+r[0]);
//         System.out.println("Remainder: "+r[1]);
//     }
// }

// class Chocolates {
//     static int[] divide(int n,int m){return new int[]{n/m,n%m};}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt(),m=sc.nextInt();
//         int[] r=divide(n,m);
//         System.out.println("Each child gets: "+r[0]);
//         System.out.println("Remaining chocolates: "+r[1]);
//     }
// }

// class WindChill {
//     static double calculate(double t,double w){return 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(w,0.16);}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         double t=sc.nextDouble(),w=sc.nextDouble();
//         System.out.println("Wind Chill Temperature: "+calculate(t,w));
//     }
// }

class Trigonometry {
    static double[] calc(double angle){double rad=Math.toRadians(angle);return new double[]{Math.sin(rad),Math.cos(rad),Math.tan(rad)};}
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        double ang=sc.nextDouble();
        double[] r=calc(ang);
        System.out.println("Sine: "+r[0]);
        System.out.println("Cosine: "+r[1]);
        System.out.println("Tangent: "+r[2]);
    }
}