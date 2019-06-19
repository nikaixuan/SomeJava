package hackrun;

import java.util.Set;

/**
 * Created by nikaixuan on 17/6/19.
 */
public class EightQueen {
    public static int N = 12;
    private int[] arr = new int[N];

    public int sum = 0;

    public void backTracking(int n){
        if(n==N){
            for(int i=0;i<N;i++){
                System.out.print("arr["+i+"]="+arr[i]+" ");
            }
            sum++;
            System.out.println();
        }else{
            for(int i=0;i<N;i++){
                arr[n] = i;
                if(canPlace(n)){
                    backTracking(n+1);
                }
            }
        }

    }

    public boolean canPlace(int i){
        for(int j=0;j<i;j++){
            if(arr[j]==arr[i]||Math.abs(i-j)==Math.abs(arr[j]-arr[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        EightQueen eq = new EightQueen();
        eq.backTracking(0);
        System.out.println(eq.sum);
    }

}
