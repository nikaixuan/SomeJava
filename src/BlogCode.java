import java.util.*;

/**
 * Created by nikaixuan on 12/5/19.
 */
public class BlogCode {

    public static void main(String[] args){
        Map<Collection,Integer> map = new HashMap<>();
        map.put(new HashSet<>(),5);
        map.put(new HashSet<>(),6);
//        map.put(new ArrayList<>(),7);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list2.add(1);
        System.out.println(list1.hashCode());
        System.out.println(list2.hashCode());
        System.out.println(list2==list1);



        System.out.println(map.size());

        Map<BlogCode,Integer> map1 = new HashMap<>();
        BlogCode blogCode = new BlogCode();
        map1.put(blogCode,2);
        BlogCode blogCode1 = new BlogCode();
        map1.put(blogCode1,2);
        System.out.println(map1.size());
    }


}
