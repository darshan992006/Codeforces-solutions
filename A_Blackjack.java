import java.util.Scanner;

public class A_Blackjack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n - 10;

        int ways = 0;

        if(i >= 2 && i <= 9)
        {
            ways = 4;
        }
        else if(i == 10)
        {
            ways = 15;
        }
        else if(i == 1 || i == 11)
        {
            ways = 4;
        }
        else
        {
            ways = 0;
        }
        System.out.println(ways);
    }
}