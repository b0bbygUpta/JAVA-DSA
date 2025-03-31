// // import java.util.*;

// // public class Main{
// //     public static void main(String[] args){
// //         Scanner j=new Scanner(System.in);
// //         int n=j.nextInt();

// //         int inv=0;
// //         int op=1;
// //         while(n != 0){
// //             int od=n%10;
// //             int ip=od;
// //             int id=op;

// //             inv=inv+id*(int)Math.pow(10,ip-1);
// //             n = n/10;
// //             op++;
// //         }
// //         System.out.print(inv);
// //     }
// // }




// import java.io.*;
// import java.util.*;


// class p{
//     public static void main(String[] args) throws Exception{
//         Scanner s=new Scanner(System.in);
//         System.out.println("Enter inputs");
        

//         int c1=s.nextInt();
//         int r1=s.nextInt();
//         int[][] arr1=new int[r1][c1];
//         for(int i=0;i<=r1;i++){
//             for(int j=0;j<=c1;j++){
//                 arr1[i][j]=s.nextInt();
//             }
//         }

//         int c2=s.nextInt();
//         int r2=s.nextInt();
//         int[][] arr2=new int[r2][c2];
//         for(int j=0;j<=r2;j++){
//             for(int i=0;i<=c2;i++){
//                 arr2[r2][c2]=s.nextInt();
//             }
//         }

//         if(c1!=r2){
//             System.out.println("Invalid inputs");
//             return;
//         }

//         //11=11.11+12.21+13.31
//         //int k=1;
        
//         int[][] prd=new int[r1][c2];
//         for(int i=0;i<=prd.length;i++){
//             for(int j=0;j<=prd[1].length;j++){
//                 for(int k=1;k<=c1;k++){
//                     prd[i][j]+=arr1[i][k]*arr2[k][j];
//                 }
//             }
//         }

//         for(int i=1;i<=prd.length;i++){
//             for(int j=1;j<=prd[1].length;j++){
//                 System.out.print(prd[i][j]+" ");
//             }
//             System.out.println();
//         }

//         s.close();
//     }
// }


import java.io.*;
import java.util.*;

class prac{


    // public static printArray(int a[][],int b,int c){
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             System.out.print(a[i][j]);
    //         }
    //         System.out.println();
    //     }
    // }


    public static void main(String[] args) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Inputs");

        int m=s.nextInt();
        int n=s.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[m][n]=s.nextInt();
            }
        }

        //printArray(arr,m,n);
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}