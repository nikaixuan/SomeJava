package hackrun.sortproblem;

import java.util.Arrays;

/**
 * Created by nikaixuan on 10/5/19.
 */
public class MarkAndToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int i=0;
        int result = 0;
        while(k>0){
            if(k-prices[i]<0){
                break;
            }else{
                k-=prices[i];
                result++;
                i++;
            }
        }
        return result;

    }
}
