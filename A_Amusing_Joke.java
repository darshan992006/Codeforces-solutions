// import java.util.Arrays;
// import java.util.Scanner;

// public class A_Amusing_Joke {

//     public static boolean isUpper(String s){
        
//         for (int i = 0; i < s.length(); i++) {
//             char c=s.charAt(i);
//             if (Character.isLetter(c) && !Character.isUpperCase(c)) {
//                 return false; // No need to check further once a lowercase letter is found
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String name1=sc.nextLine();
//         String name2=sc.nextLine();
//         String name3=sc.nextLine();
//         if(name1.length()>0 && 
//         name2.length()>0 &&
//         name3.length()>0 &&
//         name1.length()<100 && 
//         name2.length()<100 && 
//         name3.length()<100 &&
//         A_Amusing_Joke.isUpper(name1) &&
//         A_Amusing_Joke.isUpper(name2) &&
//         A_Amusing_Joke.isUpper(name3) 
//         ){
//             String combinedNames = name1 + name2;
//             char[] combinedChars = combinedNames.toCharArray();
//             char[] pileChars = name3.toCharArray();
//             Arrays.sort(combinedChars);
//             Arrays.sort(pileChars);

//             if (Arrays.equals(combinedChars, pileChars)) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }else{
//             System.out.println("NO");
//         }
//     }
// }
import java.util.Arrays;
import java.util.Scanner;

public class A_Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String name3 = sc.nextLine();

        String combined = name1 + name2;
        char[] a = combined.toCharArray();
        char[] b = name3.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b) ? "YES" : "NO");
    }
}
