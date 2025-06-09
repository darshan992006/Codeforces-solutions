import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class A_Presents {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int i = 1; i <=n; i++) {
            int a= sc.nextInt();
            map.put(i,a);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            Integer key= entry.getKey();
            Integer value=entry.getValue();
            map2.put(value,key);
        }

        for(int i=1;i<=n;i++){
            System.out.print(map2.get(i)+" ");
        }
    }
}