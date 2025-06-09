import java.util.Scanner;

public class A_Lucky_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next(); // Read the ticket number as a string

        // If length doesn't match n, it's invalid
        if (num.length() != n) {
            System.out.println("NO");
            return;
        }

        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        // Check if all characters are lucky digits and calculate sums
        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);

            // Check if character is not 4 or 7
            if (c != '4' && c != '7') {
                System.out.println("NO");
                return;
            }

            int digit = c - '0';

            if (i < n / 2) {
                sumFirstHalf += digit;
            } else {
                sumSecondHalf += digit;
            }
        }

        // Compare the sums
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
