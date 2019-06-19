import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by nikaixuan on 15/6/19.
 */
public class TestFinal {
    Stu stu;

    public TestFinal(){

        stu = new Stu("abc",20);
        Stu ss = stu;
        System.out.println(ss.toString());
        stu = new Stu("abcd",210);
        System.out.println(ss.toString());
    }


    public static void main(String[] args){
        TestFinal testFinal = new TestFinal();
        ArrayList<Stu> list = new ArrayList<>();
        Stu stu1 = new Stu("aa",22);
        list.add(stu1);
        System.out.println(list.get(0));
        stu1.setName("ab");
        System.out.println(stu1);
        System.out.println(list.get(0));
        System.out.println(~5);

    }
}
