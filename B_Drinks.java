import java.util.Scanner;

class B_Drinks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        double sum = 0;
        for(int i=0;i<n;i++){
            double a = sc.nextDouble();

            sum= sum + a;
        }
        double avg = sum/n;
        System.out.printf("%.12f",avg);
    }
}