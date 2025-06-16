import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class A_Reconnaissance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d=scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        // List<Integer> differences = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(i != j) {
                    if (Math.abs(list.get(i)-list.get(j))<=d) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}