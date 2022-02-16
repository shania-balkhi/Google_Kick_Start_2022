import java.util.*;

public class SampleProblemCandies {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int N,M, C[];
        for (int testCase = 1; testCase <= testCases; testCase++) {
            N = sc.nextInt();  //N =number of candy bags
            M = sc.nextInt();  //M = number of kids
            C = new int[N];
    
            int sumOfAllCandies = 0;
            for (int i = 0; i < C.length; ++i){
                sumOfAllCandies += C[i];
            }

            int ans = sumOfAllCandies % M;

    
            System.out.println("Case #" + testCase + ": " + ans);
        }
    }
}