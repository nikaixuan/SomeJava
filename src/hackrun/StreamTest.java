package hackrun;

import java.util.stream.IntStream;

/**
 * Created by nikaixuan on 17/6/19.
 */
public class StreamTest {

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5,6,7};
        int jj = IntStream.of(a).reduce((c,b)->c+b).getAsInt();
        System.out.println(jj);
    }
}
