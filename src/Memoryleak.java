import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by nikaixuan on 3/6/19.
 */
public class Memoryleak {

    Stu stu;
    Stu stu2;
    List<Stu> stuList = new ArrayList<>();
    public void method(){
        stu = new Stu("xiaoming",21);
        stu2 = stu;
        stuList.add(stu);
        stu = null;
    }

    public static void main(String[] args){
        Memoryleak memoryleak = new Memoryleak();
        memoryleak.method();
        System.out.println(memoryleak.stuList.get(0).getName());
        try{
            System.out.println(memoryleak.stu2.getName());
        }catch (NullPointerException e){
            System.out.println("stu is empty");
        }finally {
            System.out.println("Still going");
        }

        System.out.println(new TestObject()==new TestObject());

        System.out.println(19%0);


    }
}
