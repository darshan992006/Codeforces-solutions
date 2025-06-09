import java.util.Scanner;

public class A_Divide_it {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for(int i=0;i<q;i++){
            long n = sc.nextLong();
            int count=0;

            while( n!=1){
                if(n==1){
                    count=1;
                }
                else if(n%2==0){
                    n =n/2;
                    count++;
                }
                else if(n%3==0){
                    n = (2*n)/3;
                    count++;
                }
                else if(n%5==0){
                    n = (4*n)/5;
                    count++;
                }
                else{
                    count = -1;
                    break;
                }
            }
            System.out.println(count);
        }
    }
}