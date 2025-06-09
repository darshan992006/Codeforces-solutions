import java.util.Scanner;

public class B_Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;

            while (n != 1) {
                if (n % 6 == 0) {
                    n /= 6;
                    count++;
                } else if (n % 3 == 0) {
                    n *= 2;
                    count++;
                } else {
                    count = -1;
                    break;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
