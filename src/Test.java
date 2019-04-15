import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by nikaixuan on 6/4/19.
 */
public class Test {



    private static int testStream(List<Integer> list){
        return list.stream().filter(i->i>10).mapToInt(i->i).sum();
    }


    public static void main(String[] args){
        MyService myService1 = new MyService();

        SynchronizedTest test1 = new SynchronizedTest();
        SynchronizedTest test2 = new SynchronizedTest();
        Thread thread1 = new Thread(new ThreadA(test1));
        Thread thread2 = new Thread(new ThreadB(test1));
        thread1.start();
        thread2.start();

        String a  = "test";
        String b = "TEST";
        System.out.println(a+1);
        ExecutorService pool = Executors.newCachedThreadPool();
        HashMap hashMap = new HashMap();
        int val;
        Random r = new Random();
        for (int i=0; i<100000; i++) {
            val = r.nextInt(100);
            hashMap.put(String.valueOf(i), val);
        }
        System.out.println(hashMap.hashCode());

        ArrayList<Stu> stuArrayList = new ArrayList<>();
        Stu stu1 = new Stu("a",20);
        Stu stu2 = new Stu("b", 30);
        stuArrayList.add(stu1);
        stuArrayList.add(stu2);
        for (Stu stu: stuArrayList){
            System.out.println(stu);
        }




        char end  = 33;
        int start = 1;
        System.out.println(end);
        System.out.println(start+end);

    }
}
