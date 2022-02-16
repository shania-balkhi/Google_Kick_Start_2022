import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {

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
