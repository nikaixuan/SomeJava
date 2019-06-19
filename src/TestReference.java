import java.util.Arrays;

/**
 * Created by nikaixuan on 17/5/19.
 */
public class TestReference {

    public static void main(String[] args){
        int a = 10;
        add(a);
        System.out.println(a);
        int[][] b = {{1,2},{2,3}};
        Arrays.sort(b, (a1,a2)->(a1[0]-a1[1])-(a2[0]-a2[1]));

        System.out.println(5/10);
    }

    public static void add(int i){
        i++;
    }
}
