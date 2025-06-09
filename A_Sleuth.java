import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Sleuth {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            if (temp!= ' ') {
                list.add(temp);
            }
        }
        char c=list.get(list.size()-2);
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y'|| c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='Y') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}