import java.util.Scanner;

public class A_Die_Roll {
    public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int W = scanner.nextInt();
        int max = Math.max(Y, W);
        int favourableOutcomes = 7 - max; // Calculate the number of favourable outcomes
        int gcd= A_Die_Roll.gcd(favourableOutcomes,6); // Calculate the GCD of favourable outcomes and total outcomes
        int numerator = favourableOutcomes / gcd; 
        int denominator = 6 / gcd; // Calculate the denominator after dividing by GCD
        System.out.println(numerator + "/" + denominator); // Print the result in the form of a fraction
    }
}