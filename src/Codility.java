import java.util.*;

/**
 * Created by nikaixuan on 9/4/19.
 */
public class Codility {


    public int solution1(String[] A) {
        int[] seat = new int[27];
        for (int i=0;i<seat.length;i++) {
            seat[i] = 1;
        }
        for (int i=0;i<A.length;i++){
            int curr_row = Integer.parseInt(A[i].substring(0,1));
            if (A[i].substring(1).equals("A")&&A[i].substring(1).equals("B")&&A[i].substring(1).equals("C")){
                seat[curr_row*3-2] = 0;
            }else if (A[i].substring(1).equals("H")&&A[i].substring(1).equals("J")&&A[i].substring(1).equals("K")){
                seat[curr_row*3] = 0;
            }else {
                if (seat[curr_row*3-2] == 2){
                    seat[curr_row*3-1] = 0;
                }else {
                    if (A[i].substring(1).equals("D")&&A[i].substring(1).equals("G")){
                        seat[curr_row*3-1] = 2;
                    }else {
                        seat[curr_row*3-1] = 0;
                    }
                }
            }
        }
        int result = 0;
        for (int i=0;i<seat.length;i++) {
            if (seat[i]==1){
                result++;
            }
        }
        return result;
    }
}
