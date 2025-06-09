import java.util.Scanner;

public class A_Domino_piling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double n=sc.nextInt();
        double m=sc.nextInt();
        double area=n*m;
        double x=Math.floor(area/2);
        System.out.println((int)x);
    }
}