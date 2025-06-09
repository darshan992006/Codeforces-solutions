import java.util.Scanner;

public class A_Word {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int upperCount = 0;
    int lowerCount = 0;

    for (int i = 0; i < s.length(); i++) {
        // char c = ;
        if (Character.isUpperCase(s.charAt(i))) {
            upperCount++;
        } else if (Character.isLowerCase(s.charAt(i))) {
            lowerCount++;
        }
    }

    if (upperCount > lowerCount) {
        System.out.println(s.toUpperCase());
    } else if (lowerCount > upperCount) {
        System.out.println(s.toLowerCase());
    } else {
        System.out.println(s.toLowerCase());
    }
    sc.close();

}
}