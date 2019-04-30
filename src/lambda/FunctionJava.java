package lambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by nikaixuan on 29/4/19.
 */
public class FunctionJava {


    public static void main(String[] args) {

        Runnable task = ()->System.out.println("aaa");
        Thread thread = new Thread(task);
        thread.start();
        Thread thread12 = new Thread(){
            @Override
            public void run(){
                System.out.println("bcd");
            }
        };
        thread12.start();


    }
}
