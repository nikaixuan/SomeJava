package hackrun;

import java.util.*;

/**
 * Created by nikaixuan on 1/5/19.
 */
public class HashMapSort {

    public static <K,V> void rankMapByKey(Map<K,V> map, final Comparator<K> comparator){

        List<Map.Entry<K,V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1,o2)->comparator.compare(o1.getKey(),o2.getKey()));
        for (Map.Entry entry : list){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
    }

    public  static <K,V> void rankMapByValue(Map<K,V> map, final Comparator<V> comparator){
        List<Map.Entry<K,V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1,o2)->comparator.compare(o1.getValue(),o2.getValue()));
        for (Map.Entry entry : list){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
    }

    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(6,"A");
        map.put(1,"A");
        map.put(5,"A");
        map.put(7,"S");
        map.put(2,"G");
        map.put(4,"D");
        map.put(3,"F");
        map.put(8,"C");
        System.out.println("Rank by key: ");
        rankMapByKey(map,(o1,o2)->Integer.compare(o1,o2));
        System.out.println("Rank by key: ");
        rankMapByValue(map,String.CASE_INSENSITIVE_ORDER);
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();

    }
}
