package hackrun.mapproblem;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by nikaixuan on 26/4/19.
 */
public class CountTriple {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        long res = 0;

        Collections.sort(arr);
        Map<Long, Integer> map = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }else{
                map.put(arr.get(i),1);
            }
        }
        if(r==1l){
            Iterator it = map.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                int value = (Integer) pair.getValue();
                if(value>2){
                    res+=(long) value*(value-1)*(value-2)/6;
                }
            }
            return res;
        }
        int j=0;
        while(j<arr.size()&&arr.get(j)*r*r<=arr.get(arr.size()-1)){
            if(map.containsKey(arr.get(j)*r)&&map.containsKey(arr.get(j)*r*r)){
                res+= map.get(arr.get(j)*r)*map.get(arr.get(j)*r*r);
            }
            j++;
        }
        return res;
    }


}
