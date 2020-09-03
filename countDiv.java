// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        
        //devisible integers smaller than A
        int num_A = A / K;
        //devisible integers smaller or equal than B
        int num_B = B / K;
        //devisible integers in the sequence [A,..,B]
        int countDiv = num_B - num_A;
        
        //check if A is divisible
        if (A % K == 0) {
            countDiv += 1;
        }
        
        return countDiv;
    }
}
