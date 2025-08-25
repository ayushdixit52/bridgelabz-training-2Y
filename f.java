// import java.util.*;
// public class f {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         double base=sc.nextDouble();
//         double height=sc.nextDouble();
//         double area=0.5*base*height;
//         double new_area=area/6.4516;
//         System.out.println(new_area);
        
//     }
// }

// import java.util.*;
// public class f {

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int no=sc.nextInt();
    
//     for(int n=2;n<no;n++){
//       boolean isPrime=true;
//     for(int i=2;i<n/2;i++){
//          if(n%i==0){
//           isPrime=false;
//           break;
//          }}
//       if(isPrime){
//          System.out.print(n+" ");
         
//          }
         
//     }
//   }
//   }

// import java.util.*;
// public class f{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum+=i;
//         }
//         System.out.print(sum);
//     }
// }


// import java.util.*;
// public class f{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         while(n>0){
//             int r=n%10;
//             sum+=r;
//             n=n/10;
//         }
//         System.out.println(sum);
// }}

import java.util.*;
public class f{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
           System.out.print("leap year");
        }
        else{
            System.out.print("not a leap year");
        }
        
}}
