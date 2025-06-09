import java.util.Scanner;

public class A_Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s=sc.next();
            if(s.length()>10){
                String subString=s.substring(1, s.length()-1);
                System.out.println(s.charAt(0)+""+subString.length()+""+s.charAt(s.length()-1));
            }else{
                System.out.println(s);
            }
        }
    }
}