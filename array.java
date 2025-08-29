// import java.util.Arrays;
// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {
       
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter " + n + " elements:");
//         for(int i=0;i<n;i++){
//             arr[i]+=sc.nextInt();
//         }

//         System.out.println("Array: " + Arrays.toString(arr));
//     }
// }

// linear search

// import java.util.Scanner;

// public class array {
//     public static int linearsearch(int number[],int key ){
//         for(int i=0;i<number.length;i++){
//             if(number[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int number[]={12,3,4,556,654,764,2};
//         int key=sc.nextInt();
//         int index=linearsearch(number, key);
//         if(index==-1){
//             System.out.print("not found");
//         }
//         else{
//             System.out.print("found at index :"+ index);
//         }

//     }
// }

// largest in an array
public class array {
    public static int numlar( int number[] ) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
           if(largest<number[i]){
            largest=number[i];
           }
        }
        return largest;
        
    }
    public static void main(String[] args) {
        int number[]={23,2,45,78,9};
        System.out.print("maximum number in array :"+ " " + numlar(number));
    }
}

  

