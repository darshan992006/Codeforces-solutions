import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class A_Reconnaissance_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> differences = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int next=list.get((i+1)%n);
            int difference = Math.abs(current - next);
            differences.add(difference);
        }
        int min= Collections.min(differences);
        int index = differences.indexOf(min);
        if(index+1 == differences.size()) {
            System.out.println((index+1) + " " + ((index+1-differences.size())+1));
        }else{
            System.out.println((index+1)+" "+(index+2));
        }
        
    }
}