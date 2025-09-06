import java.util.*;

// public class Level3Programs {
//     public static void main(String[] args) {
//         // Run each class separately
//     }
// }

// class FootballTeam {
//     static int sum(int[] a){int s=0;for(int x:a)s+=x;return s;}
//     static double mean(int[] a){return (double)sum(a)/a.length;}
//     static int min(int[] a){int m=a[0];for(int x:a)if(x<m)m=x;return m;}
//     static int max(int[] a){int m=a[0];for(int x:a)if(x>m)m=x;return m;}
//     public static void main(String[] a){
//         Random r=new Random();int[] h=new int[11];
//         for(int i=0;i<11;i++)h[i]=r.nextInt(101)+150;
//         System.out.println("Heights: "+Arrays.toString(h));
//         System.out.println("Shortest: "+min(h));
//         System.out.println("Tallest: "+max(h));
//         System.out.println("Mean: "+mean(h));
//     }
// }

// class NumberChecker1 {
//     static int countDigits(int n){return String.valueOf(n).length();}
//     static int[] digits(int n){String s=String.valueOf(n);int[] d=new int[s.length()];for(int i=0;i<s.length();i++)d[i]=s.charAt(i)-'0';return d;}
//     static boolean isDuck(int[] d){for(int i=1;i<d.length;i++)if(d[i]==0)return true;return false;}
//     static boolean isArmstrong(int[] d){int n=d.length,sum=0;for(int x:d)sum+=Math.pow(x,n);int num=0;for(int x:d)num=num*10+x;return sum==num;}
//     static int[] twoLargest(int[] d){int f=Integer.MIN_VALUE,s=Integer.MIN_VALUE;for(int x:d){if(x>f){s=f;f=x;}else if(x>s&&x<f)s=x;}return new int[]{f,s};}
//     static int[] twoSmallest(int[] d){int f=Integer.MAX_VALUE,s=Integer.MAX_VALUE;for(int x:d){if(x<f){s=f;f=x;}else if(x<s&&x>f)s=x;}return new int[]{f,s};}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] d=digits(n);
//         System.out.println("Digits: "+Arrays.toString(d));
//         System.out.println("Duck: "+isDuck(d));
//         System.out.println("Armstrong: "+isArmstrong(d));
//         System.out.println("Largest & 2nd Largest: "+Arrays.toString(twoLargest(d)));
//         System.out.println("Smallest & 2nd Smallest: "+Arrays.toString(twoSmallest(d)));
//     }
// }

// class NumberChecker2 {
//     static int[] digits(int n){String s=String.valueOf(n);int[] d=new int[s.length()];for(int i=0;i<s.length();i++)d[i]=s.charAt(i)-'0';return d;}
//     static int sum(int[] d){int s=0;for(int x:d)s+=x;return s;}
//     static int sumSquares(int[] d){int s=0;for(int x:d)s+=Math.pow(x,2);return s;}
//     static boolean isHarshad(int n,int[] d){return n%sum(d)==0;}
//     static int[][] freq(int[] d){int[][] f=new int[10][2];for(int i=0;i<10;i++)f[i][0]=i;for(int x:d)f[x][1]++;return f;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] d=digits(n);
//         System.out.println("Digits: "+Arrays.toString(d));
//         System.out.println("Sum: "+sum(d));
//         System.out.println("Sum of Squares: "+sumSquares(d));
//         System.out.println("Harshad: "+isHarshad(n,d));
//         int[][] f=freq(d);System.out.println("Digit Frequencies:");for(int[] x:f)if(x[1]>0)System.out.println(x[0]+" -> "+x[1]);
//     }
// }

// class NumberChecker3 {
//     static int[] digits(int n){String s=String.valueOf(n);int[] d=new int[s.length()];for(int i=0;i<s.length();i++)d[i]=s.charAt(i)-'0';return d;}
//     static int[] reverse(int[] d){int[] r=new int[d.length];for(int i=0;i<d.length;i++)r[i]=d[d.length-1-i];return r;}
//     static boolean equal(int[] a,int[] b){return Arrays.equals(a,b);}
//     static boolean palindrome(int[] d){return equal(d,reverse(d));}
//     static boolean isDuck(int[] d){for(int i=1;i<d.length;i++)if(d[i]==0)return true;return false;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] d=digits(n);
//         System.out.println("Digits: "+Arrays.toString(d));
//         System.out.println("Reversed: "+Arrays.toString(reverse(d)));
//         System.out.println("Palindrome: "+palindrome(d));
//         System.out.println("Duck: "+isDuck(d));
//     }
// }

// class NumberChecker4 {
//     static boolean prime(int n){if(n<2)return false;for(int i=2;i*i<=n;i++)if(n%i==0)return false;return true;}
//     static boolean neon(int n){int sq=n*n,s=0;while(sq>0){s+=sq%10;sq/=10;}return s==n;}
//     static boolean spy(int n){int s=0,p=1;while(n>0){int d=n%10;s+=d;p*=d;n/=10;}return s==p;}
//     static boolean automorphic(int n){return String.valueOf(n*n).endsWith(String.valueOf(n));}
//     static boolean buzz(int n){return n%7==0||n%10==7;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);int n=sc.nextInt();
//         System.out.println("Prime: "+prime(n));
//         System.out.println("Neon: "+neon(n));
//         System.out.println("Spy: "+spy(n));
//         System.out.println("Automorphic: "+automorphic(n));
//         System.out.println("Buzz: "+buzz(n));
//     }
// }

// class NumberChecker5 {
//     static int sumDiv(int n){int s=1;for(int i=2;i<=n/2;i++)if(n%i==0)s+=i;return n==1?0:s;}
//     static boolean perfect(int n){return sumDiv(n)==n;}
//     static boolean abundant(int n){return sumDiv(n)>n;}
//     static boolean deficient(int n){return sumDiv(n)<n;}
//     static boolean strong(int n){int t=n,s=0;while(n>0){int d=n%10,f=1;for(int i=1;i<=d;i++)f*=i;s+=f;n/=10;}return s==t;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);int n=sc.nextInt();
//         System.out.println("Perfect: "+perfect(n));
//         System.out.println("Abundant: "+abundant(n));
//         System.out.println("Deficient: "+deficient(n));
//         System.out.println("Strong: "+strong(n));
//     }
// }

// class FactorsProgram {
//     static int[] factors(int n){List<Integer> f=new ArrayList<>();for(int i=1;i<=n;i++)if(n%i==0)f.add(i);return f.stream().mapToInt(i->i).toArray();}
//     static int sum(int[] f){int s=0;for(int x:f)s+=x;return s;}
//     static int product(int[] f){int p=1;for(int x:f)p*=x;return p;}
//     static int productCubes(int[] f){int p=1;for(int x:f)p*=Math.pow(x,3);return p;}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] f=factors(n);
//         System.out.println("Factors: "+Arrays.toString(f));
//         System.out.println("Greatest: "+f[f.length-1]);
//         System.out.println("Sum: "+sum(f));
//         System.out.println("Product: "+product(f));
//         System.out.println("Product of Cubes: "+productCubes(f));
//     }
// }

// class OTPGenerator {
//     static int otp(){return (int)(Math.random()*900000+100000);}
//     public static void main(String[] a){
//         Set<Integer> set=new HashSet<>();for(int i=0;i<10;i++)set.add(otp());
//         System.out.println("Unique OTPs: "+set);
//         System.out.println("All Unique: "+(set.size()==10));
//     }
// }

// class CollinearPoints {
//     static boolean slope(int x1,int y1,int x2,int y2,int x3,int y3){
//         return (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1);
//     }
//     static boolean area(int x1,int y1,int x2,int y2,int x3,int y3){
//         return 0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))==0;
//     }
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);
//         int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt(),x3=sc.nextInt(),y3=sc.nextInt();
//         System.out.println("Slope Method: "+slope(x1,y1,x2,y2,x3,y3));
//         System.out.println("Area Method: "+area(x1,y1,x2,y2,x3,y3));
//     }
// }

// class EuclideanLine {
//     static double dist(int x1,int y1,int x2,int y2){return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));}
//     static double[] line(int x1,int y1,int x2,int y2){double m=(double)(y2-y1)/(x2-x1);double b=y1-m*x1;return new double[]{m,b};}
//     public static void main(String[] a){
//         Scanner sc=new Scanner(System.in);int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt();
//         System.out.println("Distance: "+dist(x1,y1,x2,y2));
//         double[] eq=line(x1,y1,x2,y2);
//         System.out.println("Equation: y="+eq[0]+"x+"+eq[1]);
//     }
// }

class ZaraBonus {
    public static void main(String[] a){
        Random r=new Random();double[][] emp=new double[10][3];
        double old=0,newS=0,bonus=0;
        for(int i=0;i<10;i++){
            double sal=10000+r.nextInt(90000),yrs=r.nextInt(11);
            double b=sal*(yrs>5?0.05:0.02);
            emp[i][0]=sal;emp[i][1]=yrs;emp[i][2]=sal+b;
            old+=sal;newS+=sal+b;bonus+=b;
        }
        System.out.println("Old\tYears\tNew");
        for(double[] e:emp)System.out.println(e[0]+"\t"+e[1]+"\t"+e[2]);
        System.out.println("Total Old: "+old);
        System.out.println("Total New: "+newS);
        System.out.println("Total Bonus: "+bonus);
    }
}
