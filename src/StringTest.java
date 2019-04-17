
/**
 * Created by nikaixuan on 15/4/19.
 */
public class StringTest {

    public static void changestr(String str){
        String news = str;
    }

     public static void main(String[] args){
         String s = "abcd";
         char[] arr = s.toCharArray();
         String s1 = "cd";
         String tests = "ab" + s1;
         System.out.println(s==tests);
         byte bt = (byte)300;
         System.out.println(bt);
         Byte a = 100;
         Byte a1 = 100;
         System.out.println(a==a1);
         int[] intarr = new int[(int)Math.sqrt(arr.length)];
         System.out.println(Math.pow(arr.length,2));


     }
}
