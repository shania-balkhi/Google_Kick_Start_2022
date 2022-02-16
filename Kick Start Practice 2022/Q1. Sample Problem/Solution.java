// import java.util.*;
// import java.io.*;

// public class Solution {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//         long testCases = sc.nextInt();
//         int N, M;
//         int C[];
//         for (int testCase = 1; testCase <= testCases; testCase++) {

//             // Scanner sc2 = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//             String line = sc.nextLine().trim();
//             String[] strings = line.split(" ");
//             N = Integer.parseInt(strings[0]);
//             M = Integer.parseInt(strings[1]);

//             C = new int[N];
//             for (int i = 0; i < C.length; ++i) {
//                 C[i] = sc.nextInt();
//             }

//             int sumOfAllCandies = 0;
//             for (int i = 0; i < C.length; ++i) {
//                 sumOfAllCandies += C[i];
//             }

//             int ans = sumOfAllCandies % M;

//             System.out.println("Case #" + testCase + ": " + ans);
//         }
//     }
// }

//code - 2
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(new BufferedReader(new
        // InputStreamReader(System.in)));
        Scanner sc = new Scanner(System.in);
        long testCases = sc.nextInt();
        int N, M;
        int C[];
        for (int testCase = 1; testCase <= testCases; testCase++) {

            N = sc.nextInt();
            M = sc.nextInt();

            C = new int[N];
            for (int i = 0; i < C.length; ++i) {
                C[i] = sc.nextInt();
            }

            int sumOfAllCandies = 0;
            for (int i = 0; i < C.length; ++i) {
                sumOfAllCandies += C[i];
            }

            int ans = sumOfAllCandies % M;

            System.out.println("Case #" + testCase + ": " + ans);
        }
    }
}