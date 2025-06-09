import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Anton_and_Polyhedrons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of polyhedrons
        int totalFaces = 0; // Initialize the total number of faces
        Map<String, Integer> polyhedronFaces = new HashMap<>();
        polyhedronFaces.put("Tetrahedron", 4);
        polyhedronFaces.put("Cube", 6);
        polyhedronFaces.put("Octahedron", 8);
        polyhedronFaces.put("Dodecahedron", 12);
        polyhedronFaces.put("Icosahedron", 20);
        for (int i = 0; i < n; i++) {
            String polyhedron = sc.next();
            totalFaces += polyhedronFaces.get(polyhedron); 
        }
        System.out.println(totalFaces);
    }
}

// import java.util.Scanner;

// public class  A_Anton_and_Polyhedrons {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int count = 0;

//         for(int i=0;i<n;i++){
//             String n1 = scanner.next();

//             switch(n1){
//                 case "Tetrahedron":
//                     count= count +4;
//                     break;

//                 case "Cube":
//                     count = count +6;
//                     break;  
                    
//                 case "Octahedron":
//                     count = count +8;
//                     break;

//                 case "Dodecahedron":
//                     count = count +12;
//                     break;
                
//                 case "Icosahedron":
//                     count = count +20;
//                     break;    
//             }
//         }
//         System.out.println(count);
        
//     }
// }