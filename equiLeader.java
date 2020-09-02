// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        
        if (A.length == 0) {
            return 0;
        }
        int [] tempArr = A.clone();
        Arrays.sort(tempArr);
        
        int N = tempArr.length;
        // check "if there is a leader"
        int leader_Value =tempArr[N/2];
        int leader_Count =0;
        
        for (int el : tempArr) {
            if (el == leader_Value) {
                leader_Count++;
            }
        }
        if (leader_Count > N/2) {
            int num_Equi_leaders = 0; // number of equi leaders
            int left_Leader_Count =0; // number of leaders in left side
        
            // scan the array
            for(int i=0; i<A.length; i++){
                
                // find a leader (in left side)
                if(A[i] == leader_Value){
                    left_Leader_Count++;
                }
                
                // if the leader is "a leader in left side" (more than half)
                if( left_Leader_Count > (0.5) * (i+1) ){ 
                    // then, check right side
                    int right_Leader_Count = leader_Count - left_Leader_Count;                
                    // if the leader is "a leader in right side" (more than half)
                    if( right_Leader_Count > (0.5) * (A.length -i -1) ){
                        num_Equi_leaders++; // leader in both sides (then, equi leaders++)
                    }
                } 
            }
            return num_Equi_leaders;
        } 
        //no leader found => no equileaders.
        return 0;    
    }
}
