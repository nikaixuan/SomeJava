import java.util.*;

/**
 * Created by nikaixuan on 15/4/19.
 */
public class StringTest {

    public static void changestr(String str){
        String news = str;
    }

     public static void main(String[] args){
//         List<stringproblem> a = new ArrayList<>();
//         List<stringproblem> b = new ArrayList<>();
//         a.add("abcd");
//         b.add("bacd");
//         a.add("abcdf");
//         b.add("acfgd");
         String s = "tyrew";
         String result = "";
         List<String> a = new ArrayList<>();
         for (int i = 0; i < s.length(); ++i) {
             a.add(s.substring(i));
         }

         String[] b = a.stream().toArray(String[]::new);
         Arrays.sort(b);
         System.out.println(b[b.length-1]);

     }

    public static int countHoles(int num) {
        // Write your code here
        int result = 0;
        while(num>0){
            int curr_digt = num%10;
            if(curr_digt==(1|2|3|5|7)){

                result+=0;
                System.out.println(result);

            }else if(curr_digt==(0|4|6|9)){
                System.out.println(curr_digt);
                result+=1;
                System.out.println(result);
            }else{
                System.out.println(curr_digt);
                result+=2;
                System.out.println(result);
            }
            num/=10;
        }
        return result;

    }



    public static List<String> twins(List<String> a, List<String> b) {
        // Write your code here
        int len = a.size();
        List<String> result = new ArrayList<>();
        for(int i=0;i<len;i++){
            Set aodd = new HashSet<>();
            Set bodd = new HashSet<>();
            Set aeven = new HashSet<>();
            Set beven = new HashSet<>();
            if(a.get(i).length()==b.get(i).length()){
                for (int j = 0; i < a.get(i).length(); j++) {
                    if (j % 2 == 0) {
                        aeven.add(a.get(i).charAt(j));
                        System.out.println(b.get(i));
                        System.out.println(a.get(i).length());
                        beven.add(b.get(i).charAt(j));
                    } else {
                        aodd.add(a.get(i).charAt(j));
                        bodd.add(b.get(i).charAt(j));
                    }
                }
                if (aeven.containsAll(beven) && aodd.containsAll(bodd)) {
                    result.add("YES");
                } else {
                    result.add("NO");
                }
            }
            else{
                result.add("NO");
            }

        }
        return result;
    }

}
