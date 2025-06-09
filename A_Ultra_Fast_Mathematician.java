import java.util.Scanner;

public class A_Ultra_Fast_Mathematician {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n1=sc.nextLine();
        String n2=sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n1.length(); i++) {
            if(n1.charAt(i) == n2.charAt(i)) {
                result.append("0");
            } else {
                result.append("1");
            }
        }
        System.out.println(result.toString());
    }
}