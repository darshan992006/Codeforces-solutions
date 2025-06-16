import java.util.Scanner;

public class A_PolandBall_and_Hypothesis {
    public static boolean checkPrime(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt = cnt + 1;
                if (n / i != i) {
                    cnt = cnt + 1;
                }
            }
        }
        if (cnt == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=1000;i++){
            if (!checkPrime(i*n+1)) {
                System.out.println(i);
                break;
            }
        }
    }
}