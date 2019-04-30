import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikaixuan on 30/4/19.
 */
public class BitOperation {


    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,3,4,5,2,1};
        int res = 0;
        boolean flag = true;
        List[] arr = new List[2];
        arr[0] = new ArrayList<>();

        for (int i=0;i<a.length-1;i++){
            res = a[i]^a[i+1];
        }
        System.out.println(res);
    }
}
