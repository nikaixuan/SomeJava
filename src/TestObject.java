import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by nikaixuan on 12/4/19.
 */
public class TestObject {


    public static void main(String[] args){
        GenericType<String> type = new GenericType<>();
        type.set("Pankaj"); //valid

        GenericType type1 = new GenericType(); //raw type
        type1.set("Pankaj"); //valid
        type1.set(10); //valid and autoboxing support
        System.out.println(type1.get());

        Stu stu = new Stu("abc",20);
        Stu stutest = stu;
        System.out.println("The object is "+ stutest);
        List list = new ArrayList<>();
        list.add(stu);
        stu.setName("aaaaaaa");
        System.out.println(list.get(0));
        System.out.println("The object now is "+ stutest);
        String bcn = "hgfqweasd";
        char[] sad ;
        sad = bcn.toCharArray();
        Arrays.sort(sad);
        System.out.println(String.valueOf(sad));
        int testss = 10;
        add(testss);
        System.out.println(testss);


    }

    public static void add(int a){
        a++;
    }

    public void mod(Stu stu){
        stu.setName("bcd");
    }
}
