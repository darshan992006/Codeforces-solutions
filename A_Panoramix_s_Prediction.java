// import java.util.Scanner;

// public class A_Panoramix_s_Prediction {

//     public static boolean checkPrime(int n) {
//         int count=0;
//         for (int i = 1; i <=Math.sqrt(n); i++) {
//             if(n % i == 0) {
//                 count++;
//                 if(i != n/i) {
//                     count++;
//                 }
//             }
//         }
//         if(count == 2) {
//             return true; // prime
//         } else {
//             return false; // not prime
//         }
//     }

//     public static int countBetweenPrimeNos(int n1,int n2){
//         int count=0;
//         for (int i = n1+1; i <n2; i++) {
//         if(A_Panoramix_s_Prediction.checkPrime(i)){
//             count++;
//         }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2=sc.nextInt();
//         if(checkPrime(n1) && checkPrime(n2)){
//             int count2=A_Panoramix_s_Prediction.countBetweenPrimeNos(n1, n2);
//             if(count2==0){
//                 System.out.println("YES");
//             }else{
//                 System.out.println("NO");
//             }
//         }else{
//             System.out.println("NO");
//         }
//     }
// }


import java.util.Scanner;

public class A_Panoramix_s_Prediction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 

        
        int next = n+1;

        while(!Isprime(next)){
            next++;
        }
        if(next==m){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }

    public static boolean Isprime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
    
}