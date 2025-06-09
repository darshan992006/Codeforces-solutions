import java.util.Scanner;

public class A_Chips {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int index=1;

    while (true) {
        if (index > m) {
            System.out.println(m);
            break;
        }
        m -= index;
        index++;
        if (index > n) {
            index = 1;
        }
    }
    }
}