// import java.util.Scanner;

// public class A_Epic_Game {
//     public static int gcd(int a,int b){
//         while (a>0&&b>0){
//             if(a>b) a=a%b;
//             else b=b%a;
//         }
//         if(a==0)return b;
//         else return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int n=sc.nextInt();
//         boolean flag=true;
//         while (true) {
//             int removableStones;
//             if (flag) {
//                 removableStones=gcd(a, n);
//                 if(removableStones>n){
//                     System.out.println("1");
//                     break; //antisimon wins
//                 }
//                 n-=removableStones;
//             }else{
//                 removableStones=gcd(b, n);
//                 if(removableStones>n){
//                     System.out.println("0");
//                     break; //simon wins
//                 }
//                 n-=removableStones;
//             }
//             flag=!flag;
//         }
//     }
// }
import java.util.Scanner;

public class A_Epic_Game {
    public static int gcd(int a,int b){
        int gc = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gc = i;
            }           
        }
        return gc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int n = sc.nextInt();
        int removableStones;
        boolean flag=true;

        while (true) {
            if (flag) {
                removableStones=gcd(a, n);
                if(removableStones>n){
                    System.out.println("1");
                    return; //antisimon wins
                }
                n-=removableStones;
            }else{
                removableStones=gcd(b, n);
                if(removableStones>n){
                    System.out.println("0");
                    return; //simon wins
                }
                n-=removableStones;
            }
            flag=!flag;
        }

        
    }
}