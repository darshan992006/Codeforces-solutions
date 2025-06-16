import java.util.Scanner;

public class B_Borze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='.'){
                System.out.print(0);
            }else if(chars[i]=='-'&&chars[i+1]=='.'){
                System.out.print(1);
                i++;
            }else if(chars[i]=='-'&&chars[i+1]=='-'){
                System.out.print(2);
                i++;
            }
        }
    }
}