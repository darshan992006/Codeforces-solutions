import java.util.Scanner;

public class B_Anton_and_Digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

    int x =Math.min(a,c);
    int y = Math.min(x,d);
    
    int z = a-y;
    int w = Math.min(b,z);
    int total = 256*y + 32*w;
    System.out.println(total);

    }
}