package hackrun.greedyproblem;

import java.util.Arrays;

/**
 * Created by nikaixuan on 10/5/19.
 */
public class GreedyFlorist {
    static int getMinimumCost(int k, int[] c) {

        Arrays.sort(c);
        int res = 0;
        for(int i=c.length-1;i>=0;i--){
            res += c[i]*((c.length-i-1)/k+1);
        }
        return res;
    }

    public static void main(String[] args){
        int[] a = {2,5,6};
        System.out.println(getMinimumCost(3,a));
    }
}
