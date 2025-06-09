import java.util.Scanner;

public class A_Triangular_numbers {

    public static int nth_triangular_num(int n){
        int ans =n*(n+1)/2;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
    }
}