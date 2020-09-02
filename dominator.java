import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
class Solution {
    public int solution(int[] A) {
        
        if (A.length == 0) {
            return -1;
        }
        int [] tempArr = A.clone();
        Arrays.sort(tempArr);
        
        int N = tempArr.length;
        int dominator = tempArr[N/2];
        int count = 0;
        
        for (int el : tempArr) {
            if (el == dominator) {
                count++;
            }
        }
        if (count > N/2) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] == dominator) {
                    return i;
                }
            }
        } 
        return -1;
    }
}
