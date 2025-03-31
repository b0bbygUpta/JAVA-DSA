//// import java.util.*;
//
//// public class Main(){
//
//// }
//
//// import java.util.*;
//
//// public class Main {
//
////     public static void main (String[] args){
////         System.out.println ("Hello World");
////         Scanner scn = new Scanner (System.in);
////         int n=scn.nextInt();
////         for(int i=0;i<n;i++){
////         System.out.print(i+" ");
////         }
////     }
//// }
//
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner scn=new Scanner(System.in);
//        int n=scn.nextInt();
//
//        System.out.print(n+1);
//
//    }
//}
//
////to print prime numbers
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//
//            if (i % 2 == 0) {
//            count++;
//            }
//
//            if (count == 0) {
//                System.out.println(i);
//            } else {
//                System.out.print(" ");
//            }
//            // System.out.println("Odd");
//            // } else {
//            // System.out.println(i);
//        }
//
//    }
//}
//
////to print fibnacci till a number
//                    import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        int a=0;
//        int b=1;
//
//        int n;
//        System.out.println("n:");
//        Scanner scn=new Scanner(System.in);
//        n=scn.nextInt();
//
//        for(int i=0;i<n;i++){
//            System.out.println(a);
//            int c=a+b;
//            a=b;
//            b=c;
//        }
//    }
//}
//
////to count the total digits of a number
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner scn=new Scanner(System.in);
//        int n=scn.nextInt();
//
//        int dig=0;
//        while(n != 0){
//            n/=10;
//            dig++;
//        }
//
//        System.out.print(dig);
//    }
//}
//
////to print digits of a number "from left to right"
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//            //int dig=0; int temp=n;
//        Scanner scn=new Scanner(System.in);
//            int n=scn.nextInt();
//
//            int dig=0; int temp=n;
//            while(temp!=0){
//                temp/=10;
//                dig++;
//            }
//            int div=(int)Math.pow(10,dig-1);
//           while(n!=0) {
//            int q=n/div;
//            System.out.println(q);
//
//            n%=div;
//            div/=10;
//           }
//        }
//    }
//
////to print all digits of a Number "from Right to Left"
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner j=new Scanner(System.in);
//        int n=j.nextInt();
//
//        while(n!=0){
//            int q=n%10;
//            System.out.print(q+" ");
//            n/=10;
//        }
//    }
//}
//
////printing inverse of a Number
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner j=new Scanner(System.in);
//        int n=j.nextInt();
//
//        int inv=0; int op=1;
//        while(n!=0){
//            int od=n%10;
//            int ip=od;
//            int id=op;
//
//            inv = inv+id*(int)Math.pow(10,ip-1);
//            n/=10;
//            op++;
//        }
//        System.out.println(inv);
//    }
//}
////                                            18/11/2024
//
////star-like-patter <*>
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner J=new Scanner(System.in);
//        int n=J.nextInt();
//
//        int sp=n/2;
//        int st=1;
//        // for(int i=1;i<=n;i++){
//        //     System.out.println(sp+","+st);
//
//
//        //     if(i<=n/2){
//        //         sp--;
//        //         st+=2;
//        //     }
//        //     else{
//        //         sp++;
//        //         st-=2;
//        //     }
//        //     // sp--;
//        //     // st++;
//        // }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=sp;j++){
//                System.out.print("\t");
//            }
//            for(int j=1;j<=st;j++){
//                System.out.print("*\t");
//            }
//            if(i<=n/2){
//                sp--;
//                st+=2;
//            }
//            else{
//                sp++;
//                st-=2;
//            }
//            System.out.println();
//        }
//    }
//}
//
////prime factorization
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner J=new Scanner(System.in);
//        int n=J.nextInt();
//
//        for(int i=2;i*i<=n;i++){
//            if(n%i==0){
//                System.out.println(i);
//                n/=i;
//            }
//        }
//        if(n!=1){
//            System.out.println(n);
//        }
//    }
//}
//
////pythagorean triplets
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner h=new Scanner(System.in);
//        int a=h.nextInt();
//        int b=h.nextInt();
//        int c=h.nextInt();
//
//        int max=a;
//        if(b>=max){
//            max=b;
//        }
//        if(c>=max){
//            max=c;
//        }
//        System.out.println("Maximum number is "+max);
//
//        if(max==a){
//            boolean flag = ((a*a)==(b*b + c*c));
//            System.out.println(flag+"1");
//        }
//        else if(max==b){
//            boolean flag =((b*b)==(a*a + c*c));
//            System.out.println(flag+"2");
//        }
//        else{
//            boolean flag=((c*c)==(a*a + b*b));
//            System.out.println(flag+"3");
//        }
//    }
//}
//
////Benjamin Bulbs
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//
//        for(int i=1;i*i<=n;i++){
//            System.out.print(i+"---");
//            System.out.println(i*i);
//        }
//    }
//}
//
////staircase patter -- *\
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//
//       for(int i=1;i<=n;i++){
//        for(int j=1;j<=i;j++){
//            System.out.print("*\t");
//        }
//        System.out.println();
//       }
//    }
//}
//
////                                              19\11\24
////    */\* __  pattern
////    *\/*
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner h=new Scanner(System.in);
//        int a; System.out.print("a:");
//        a=h.nextInt();
//        int b; System.out.print("b:");
//        b=h.nextInt();
//
//        int st=a/2+1; int sp=1;
//        for(int i=1;i<=a;i++){
//            for(int j=1;j<=st;j++){
//                System.out.print("*\t");
//            }
//            for(int j=1;j<=sp;j++){
//                System.out.print("\t");
//            }
//            for(int j=1;j<=st;j++){
//                System.out.print("*\t");
//            }
//
//
//            if(i<=b/2){
//                sp+=2;
//                st--;
//            }
//            else{
//                sp-=2;
//                st++;
//            }
//            System.out.println();
//        }
//    }
//}
//
//
//// /-like pattern
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n; System.out.print("n:"); n=s.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i+j != n+1){
//                    System.out.print("\t");
//                }
//                else if(i+j==n+1){
//                    System.out.print("*\t");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//
////X-like pattern
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n; System.out.print("n:"); n=s.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==j){
//                    System.out.print("*\t");
//                }
//                else if(i+j == n+1){
//                    System.out.print("*\t");
//                }
//                else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//}
//
////  /*\ _ like pattern
////  \*/
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int os=n/2; int is=-1;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=os;j++){
//                System.out.print("\t");
//            }
//            System.out.print("*\t");
//            for(int j=1;j<=is;j++){
//                System.out.print("*\t");
//            }
//
//            if(i>1 && i<n){
//                System.out.print("*\t");
//            }
//
//
//            if(i<=n/2){
//                os--;
//                is+=2;
//            }
//            else{
//                os++;
//                is-=2;
//            }
//            System.out.println();
//        }
//    }
//}
//
//
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int os=n/2; int is=-1;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=os;j++){
//                System.out.print("\t");
//            }
//            System.out.print("*\t");
//            for(int j=1;j<=is;j++){
//                System.out.print("*\t");
//            }
//
//            if(i>1 && i<n){
//                System.out.print("*\t");
//            }
//
//
//            if(i<=n/2){
//                os--;
//                is+=2;
//            }
//            else{
//                os++;
//                is-=2;
//            }
//            System.out.println();
//        }
//    }
//}
//
////no. pattern-1 //staircase
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//
//        int o=1;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(o+"\t");
//                o++;
//            }
//            System.out.println();
//        }
//    }
//}
//
////no. pattern-2  //fibnacci series
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//
//        int a=0; int b=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                int c=a+b;
//                a=b;
//                b=c;
//                System.out.print(a+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//
////no. pattern-3   //
//import java.util.*;
//
//public class Main{
//  public static void main(String[] args){
//    Scanner s=new Scanner(System.in);
//    int n=s.nextInt();
//
//    for(int i=0;i<n;i++){
//      int val=1;
//      for(int j=0;j<=i;j++){
//        System.out.print(val+"\t");
//        int cval=val*(i-j)/(j+1);
//        //System.out.print(cval+"\t");
//        val=cval;
//      }
//      System.out.println();
//    }
//  }
//}
//
////no. pattern-4   //table
//import java.util.*;
//
//public class Main{
//  public static void main(String[] args){
//    Scanner s=new Scanner(System.in);
//    int n=s.nextInt();
//
//    for(int i=01;i<=10;i++){
//      int val=n*i;
//      System.out.println(n+" * "+i+" = "+val );
//
//    }
//    // System.out.println();
//  }
//}
//
///*              1               no. pattern-5
//        2       3       2
//3       4       5       4       3
//        2       3       2
//                1
//*/
//import java.util.*;
//
//public class Main{
//  public static void main(String[] args){
//    Scanner s=new Scanner(System.in);
//    int n=s.nextInt();
//
//    int st=1; int sp=n/2; int val=1;
//    for(int i=1;i<=n;i++){
//      for(int j=1;j<=sp;j++){
//        System.out.print("\t");
//      }
//      int cval=val;
//      for(int j=1;j<=st;j++){
//        System.out.print(cval+"\t");
//        //cval++;
//        if(j<=st/2){
//          cval++;
//        }
//        else{
//          cval--;
//        }
//      }
//      if(i<=n/2){
//        st+=2;
//        sp--;
//        val++;
//      }
//      else{
//        st-=2;
//        sp++;
//        val--;
//      }
//      //val++;
//      System.out.println();
//    }
//  }
//}
//
////no. pattern     // W-like pattern
//import java.util.*;
//
//public class Main{
//  public static void main(String[] args){
//    Scanner s=new Scanner(System.in);
//    int n=s.nextInt();
//
//    for(int i=1;i<=n;i++){
//      for(int j=1;j<=n;j++){
//        if(j==1 || j==n){
//          System.out.print("*\t");
//        }
//        else if(i>n/2 && ((i+j == n+1) || (i==j))){
//          System.out.print("*\t");
//        }
//        else{
//          System.out.print("\t");
//        }
//      }
//      System.out.println();
//    }
//  }
//}
//
////digit frequency of a number
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int j=s.nextInt();
//        int f=getDigit(n,j);
//        System.out.println(f);
//    }
//
//    public static int getDigit(int n,int j){
//        int count=0;
//        //int rem=n%10;
//
//        while(n>0){
//            int rem=n%10;
//            n/=10;
//
//             if(rem==j){
//             count++;
//             }
//        }
//   // n/=10;
//    return count;
//    }
//}
//
////from any base to any base
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        System.out.print("Number:");  int n=s.nextInt();
//        System.out.print("b1to:");  int b1=s.nextInt();
//        System.out.print("b2from:");  int b2=s.nextInt();
//        int f=d2b(n,b1,b2);
//        System.out.println(f);
//    }
//
//    public static int d2b(int n,int b1,int b2){
//        int rv=0,pow=1;
//
//        while(n>0){
//            int rem=n%b1;
//            n/=b1;
//
//            rv+=rem*pow;
//            pow*=b2;
//        }
//        return rv;
//    }
//}
//
////sum of any base
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        System.out.print("n1:"); int n1=s.nextInt();
//        System.out.print("n2:"); int n2=s.nextInt();
//        System.out.print("b:"); int b=s.nextInt();
//        int f=addTwoDig(n1,n2,b);
//        System.out.println(f);
//    }
//
//    public static int addTwoDig(int n1,int n2,int b){
//        int rv=0;
//        int c=0; int p=1;
//
//        while(n1>0 || n2>0 || c>0){
//            int r1=n1%10; int r2=n2%10;
//            int d=r1+r2+c;
//            c=d/b;
//            d%=b;
//
//            n1/=10; n2/=10;
//
//            rv+=d*p;
//            p*=10;
//        }
//        return rv;
//    }
//}
//
////substraction of 2 number of any base
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        System.out.print("n1:");int n1=s.nextInt();
//        System.out.print("n2:");int n2=s.nextInt();
//        System.out.print("b:");int b=s.nextInt();
//        int f=sun2Dig(n1,n2,b);
//        System.out.print(f);
//    }
//
//
//    public static int sun2Dig(int n1,int n2,int b){
//        int rv=0; int p=1; int c=0;
//
//        while(n2>0){
//            int r1=n1%10; n1/=10;
//            int r2=n2%10; n2/=10;
//            int d=0;
//            r2+=c;
//
//            if(r2>=r1){
//                c=0;
//                d=r2-r1;
//
//            }else{
//                c=-1;
//                d=r2+b -r1;
//            }
//            rv=rv+d*p;
//            p=p*10;
//        }
//        return rv;
//    }
//}
//
//
//
//
//
//
//
//
//
//
////
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        System.out.print("n1:");int n1=s.nextInt();
//        System.out.print("n2:");int n2=s.nextInt();
//        System.out.print("b:");int b=s.nextInt();
//        int f=mAnyDig(n1,n2,b);
//        System.out.print(f);
//    }
//
//    public static int mAnyDig(int n1,int n2,int b){
//        int rv=0;
//        int p=1;
//
//        while(n2>0){
//            int r2=n2%10; n2/=10;
//
//            int sprd=m1Dig(n1,r2,b);
//            rv=getSum(b,rv,sprd*p);
//            p*=10;
//        }
//        return rv;
//    }
//    public static int m1Dig(int n1,int r2,int b){
//        int rv=0;
//        int r1=n1%10; n1/=10;
//        //int r2=n2%10; n2/=10;
//        int c=0; int p=1;
//
//        int d=r1*r2 +c;
//        c=d/b;
//        d%=b;
//
//        rv+=d*p;
//        p*=10;
//
//    return rv;
//}
//public static int getSum(int n1,int n2,int b){
//    int rv=0;
//    int c=0;
//    int p=1;
//    while(n1>0 || n2>0 || c>0){
//        int r1=n1%10; n1/=10;
//        int r2=n2%10; n2/=10;
//
//        int d=r1+r2+c;
//        c=d/b;
//        d%=b;
//
//        rv+=d*p;
//        p*=10;
//    }
//    return rv;
//}
//}
//
//
////check for duplicate brackets
//
//import java.io.*;
//import java.util.*;
//
//class practice{
//    public static void main(String[] args) throws Exception{
//        Scanner s=new Scanner(System.in);
//        System.out.print("Enter:"); String line=s.nextLine();
//
//        Stack<Character> st=new Stack<>();
//        for(int i=0;i<line.length();i++){
//            char ch=line.charAt(i);
//            if(ch==')'){
//                if(st.peek()=='('){
//                    System.out.println(true);
//                    return;
//                }
//                else {
//                    while(st.peek()!='('){
//                        st.pop();
//                    }
//                    st.pop();
//                }
//                // else{
//                //     st.push(ch);
//                // }
//            }
//            else{
//                st.push(ch);
//            }
//            //System.out.println(false);
//        }
//        System.out.println(false);
//    }
//}
//
//
//
////check for duplicate brackets <'()', '{}', '[]'>
//import java.io.*;
//import java.util.*;
//
//class practice{
//
//    public static boolean handle(Stack<Character> st,char correspondOpen){
//        if(st.size()==0){
//            //System.out.println(false);
//            return false;
//        }
//        else if(st.peek()!=correspondOpen){
//            //System.out.println(false);
//            return false;
//        }
//        else{
//            st.pop();
//            return true;
//        }
//    }
//    public static void main(String[] args)throws Exception{
//        Scanner s=new Scanner(System.in);
//        System.out.print("Enter:"); String line=s.nextLine();
//
//        Stack<Character> st=new Stack<>();
//        for(int i=0;i<line.length();i++){
//            char ch=line.charAt(i);
//            System.out.println(ch);
//
//            if(ch=='(' || ch=='{' || ch=='['){
//                st.push(ch);
//            }
//            else if(ch==')'){
//                boolean val=handle(st,'(');
//                if(val==false){
//                    System.out.println(val);
//                    return;
//                }
//            }
//            else if(ch=='}'){
//                boolean val=handle(st,'{');
//                if(val==false){
//                    System.out.println(val);
//                    return;
//                }
//            }
//            else if(ch==']'){
//                boolean val=handle(st,'[');
//                if(val==false){
//                    System.out.println(val);
//                    return;
//                }
//            }
//            else{
//
//            }
//
//        }
//
//        if(st.size()==0){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }
//    }
//}
//
//                                   //03/01/2025
//                                   //Recursion
//
//
////toh - Recursion in java
//import java.io.*;
//import java.util.*;
//
//class prac{
//    public static void main(String[] args) throws Exception{
//        System.out.println("Enter inputs:");
//
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int t1d=s.nextInt();
//        int t2d=s.nextInt();
//        int t3d=s.nextInt();
//        toh(n,t1d,t2d,t3d);
//
//        s.close();
//
//    }
//
//    public static void toh(int n,int t1id,int t2id,int t3id){
//        if(n==0){
//            return;
//        }
//        toh(n-1,t1id,t3id,t2id); //will print the instructions to move n-1 disks form t1 to t3 using t2 (*)
//        System.out.println(n+"["+t1id+"->"+t2id+"]");
//        toh(n-1,t3id,t2id,t1id);
//
//
//    }
//}
//
////display array - Recursion
//
//import java.io.*;
//import java.util.*;
//
//class p{
//    public static void main(String[] args) throws Exception{
//        System.out.println("Enter inputs:");
//
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//
//        int[] arr=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=s.nextInt();
//        }
//
//        s.close();
//
//        System.out.println("Output is:");
//
//        displayArray(arr,0);
//    }
//
//    public static void displayArray(int[] arr,int idx){
//        System.out.println(arr[idx]);
//        displayArray(arr,idx+1);
//    }
//}
//
////display Array in reverse - Recursion
//
//import java.io.*;
//import java.util.*;
//
//class pr{
//    public static void main(String[] args) throws Exception{
//        System.out.println("Inputs:");
//
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//
//        int[] arr=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=s.nextInt();
//        }
//
//        s.close();
//
//        System.out.println("Outputs:");
//        displayReverse(arr,0);
//
//
//    }
//
//    public static void displayReverse(int[] array,int idx){
//        if(idx==array.length){
//            return;
//        }
//        displayReverse(array,idx+1);
//        System.out.println(array[idx]);
//
//    }
//}
//
////display max of an array and array also - Recursion
//import java.io.*;
//import java.util.*;
//
//public class practice{
//    public static void main(String[] args)throws Exception{
//        Scanner s=new Scanner(System.in);
//        System.out.print("Enten n:"); int n=s.nextInt();
//
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=s.nextInt();
//        }
//
//        printArray(arr,n);
//
//        int maxOfArray=maxArray(arr,0);
//        System.out.println(maxOfArray);
//
//    }
//
//    public static void printArray(int[] a,int b){
////        for(int i=0;i<b;i++){
////            System.out.print(a[i]+" ");
////        }
////        System.out.println();
//        System.out.println(Arrays.toString(a));
//    }
//
//    public static int maxArray(int[] a,int b){
//        if(b==a.length-1){
//            return a[b];
//        }
//        int misa=maxArray(a,b+1);
//        if (misa > a[b]){
//            return misa;
//        }
//        else{
//            return a[b];
//        }
//    }
//}