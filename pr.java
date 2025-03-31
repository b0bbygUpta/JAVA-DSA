////
////// // import java.io.*;
////// // import java.util.*;
////
////// // class lava{
////// //     public static void main(String[] args) throws Exception{
////// //         System.out.println("Intput:");
////
////// //         Scanner s=new Scanner(System.in);
////// //         int n=s.nextInt();
////
////// //         int[] array=new int[n];
////// //         for(int i=0;i<array.length;i++){
////// //             array[i]=s.nextInt();
////// //         }
////
////// //         s.close();
////
////// //         int max=maxOfArray(array,0);
////// //         System.out.println(max);
////
////// //     }
////
////// //     public static int maxOfArray(int[] array,int idx){
////// //         if(idx == array.lenght-1){
////// //             return arr[idx];
////// //         }
////
////// //         int misa = maxOfArray(array,idx+1);
////// //         if(misa > array[idx]){
////// //             return misa;
////// //         }
////// //         else{
////// //             return array[idx];
////// //         }
////// //     }
////// // }
////
////// import java.io.*;
////// import java.util.*;
////
////// public class pr{
//////     public static void main(String[] args) throws Exception{
//////         Scanner s=new Scanner(System.in);
//////         System.out.println("Input:");
////
//////         int n=s.nextInt();
//////         int[] arr=new int[n];
//////         for(int i=0;i<arr.length;i++){
//////             arr[i]=s.nextInt();
//////         }
//////         int d=s.nextInt();
////
//////         s.close();
////
//////         System.out.println("Output:");
////
//////         int f=firstIndex(arr,0,d);
//////         System.out.println(f);
////
//////     }
////
//////     public static int firstIndex(int[] array,int idx,int x){
//////         if(idx == array.length){
//////             return -1;
//////         }
////
//////         int fisa = firstIndex(array,idx+1,x);
//////         if(array[idx] == x){
//////             return idx;
//////         }
//////         else{
//////             return fisa;
//////         }
//////         //code end;
//////     }
////// }
////
////
////import java.io.*;
////import java.util.*;
////import java.lang.*;
////
////public class pr{
////    public static void main(String[] args) throws Exception{
////        int n=4;
////
////        int st=1;
////
////        for(int i=1;i<=n;i++){
////            for(int j=1;j<=(n-i);j++){
////                System.out.print(" \t");
////            }
////            for(int j=1;j<=st;j++){
////                System.out.print("*\t");
////
////            }
////            System.out.println();
////            st+=2;  //(2*i)-1;
////        }
////
////    }
////}
//
////import java.io.*;
////import java.util.*;
////import java.lang.*;
////
////public class practice{
////    public static void main(String[] args){
////        Scanner s=new Scanner(System.in);
////        System.out.print("input:");
////        int n=s.nextInt();
////        int a=s.nextInt();
////        int[] arr=new int[n];
////
////        for(int i=0;i<n;i++){
////            arr[i]=s.nextInt();
////        }
////
////
////        int o=occ(arr,a,0);
////        System.out.println(o);
////    }
////
////    public static int occ(int[] arr,int n,int idx){
////        if(idx==arr.length-1){
////            return -1;
////        }
////        int om1=occ(arr,n,idx+1);
////        if(arr[idx]==n){
////            return idx;
////        }
////        else{
////            return om1;
////        }
////    }
////
////
////}
//
//
//
//
//
//import java.io.*;
//import java.util.*;
//import java.lang.*;
//
//public class pr{
//    public static void main(String[] args){
////        System.out.print("Enter input: ");
//        Scanner s=new Scanner(System.in);
//        System.out.print("Enter Array size: "); int n=s.nextInt();
//        System.out.print("Enter desired number: "); int a=s.nextInt();
//        int[] arr=new int[n]; System.out.print("Enter the desired Array: ");
//        for(int i=0;i<n;i++){
//            arr[i]=s.nextInt();
//        }
//        int occured=occ(arr,a,0);
//        if(occured==-1) {
//            System.out.println("Could not your desired number in entered Array. So the index is '" + occured + "'");
//        }else{
//            System.out.println("Your desired number has the index value of '" + occured + "'");
//        }
//    }
//    static int occ(int[] array,int a,int in){
//        if(in==array.length){
//            return -1;
//        }
//        for(int i=0;i<array.length;i++){
//            if(array[in]==a){
//                return in; //+occ(array,a,in+1);
//            }
////            else{
////                return occ(array,a,in+1);
////                }
//
//        }
//        return occ(array,a,in+1);
//    }
//}
//
////duplicate brackets -- Stack
//import java.io.*;
//import java.util.*;
//
//public class pr{
//    public static void main(String[] args)throws Exception{
//        Scanner scn=new Scanner(System.in);
//        String str=scn.nextLine();
//
//        Stack<Character>st=new Stack<>();
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch==')'){
//                if(st.peek()=='('){
//                    System.out.println(true);
//                    return;
//                }
//                else{
//                    while(st.peek()!='('){
//                        st.pop();
//                    }
//                    st.pop();
//                }
//            }
//            else{
//                st.push(ch);
//            }
//        }
//        System.out.println(false);
//    }
//}
//
