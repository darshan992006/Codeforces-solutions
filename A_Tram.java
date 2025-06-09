import java.util.Scanner;

class A_Tram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        int max_count = b-a;
        int count = b-a;

        for(int i=1;i<n;i++){
            int c = sc.nextInt();
            int d = sc.nextInt();
        count = count + (d-c);
        if(count>max_count){
            max_count = count;
        }
        }
        System.out.println(max_count);


    }
}