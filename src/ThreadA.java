import java.util.LinkedHashMap;

/**
 * Created by nikaixuan on 6/4/19.
 */
public class ThreadA implements Runnable {

    private SynchronizedTest syntest;
    //
    public ThreadA(SynchronizedTest test){
        this.syntest = test;
    }

    @Override
    public void run(){
        //		SynchronizedTest s = SynchronizedTest.getInstance();
//		s.method1();
		//SynchronizedTest s1 = new SynchronizedTest();
//		syntest.method1();
        //SynchronizedTest.staticIn.method1();
        SynchronizedTest.staticIn.method1();


//		SynchronizedTest.staticMethod1();
//		SynchronizedTest.staticMethod2();

    }
}
