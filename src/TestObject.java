import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikaixuan on 12/4/19.
 */
public class TestObject {

    public static void main(String[] args){
//        GenericType<String> type = new GenericType<>();
//        type.set("Pankaj"); //valid
//
//        GenericType type1 = new GenericType(); //raw type
//        type1.set("Pankaj"); //valid
//        type1.set(10); //valid and autoboxing support
//        System.out.println(type1.get());
        Stu stu = new Stu("abc",20);
        List list = new ArrayList<>();
        list.add(stu);
        stu.setName("aaaaaaa");
        System.out.println(list.get(0));
//        TestObject testObject = new TestObject();
//        testObject.mod(stu);
//        System.out.println(stu);
    }

    public void mod(Stu stu){
        stu.setName("bcd");
    }
}
