import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nikaixuan on 30/4/19.
 */
public class BitOperation {


    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,3,4,5,2,1};
        int res = 0;
        for (int i=0;i<a.length-1;i++){
            res = a[i]^a[i+1];
        }
        System.out.println(res);

        Arrays.asList(a);
        List[] arr = new List[2];
        ArrayList<Integer>[] tar = new ArrayList[3];
        tar[0] = new ArrayList<>();
        arr[0] = new ArrayList<Integer>();
        arr[1] = new ArrayList<String>();

        List<Integer> arrayOfIdList[] = new ArrayList[10];// Suppose generic array creation is legal.
        List<String> nameList = new ArrayList<String>();
        List<Integer> intList = new ArrayList<>();
        intList.add(6);
        nameList.add("abc");
        // type eraser
        Object objArray[] = arrayOfIdList; // that is allowed because arrays are covariant
        objArray[0] = nameList;
        objArray[1] = intList;
//        arrayOfIdList[0] = nameList;
        System.out.println(objArray[0].toString());
        System.out.println(arrayOfIdList.getClass().getSimpleName());
    }
}
