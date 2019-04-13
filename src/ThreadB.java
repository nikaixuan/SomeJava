/**
 * Created by nikaixuan on 6/4/19.
 */
public class ThreadB implements Runnable {
    private SynchronizedTest syntest;
//
    public ThreadB(SynchronizedTest test){
        this.syntest = test;
    }

    @Override
    public void run(){
        // TODO Auto-generated method stub
//		SynchronizedTest s = SynchronizedTest.getInstance();
//		SynchronizedTest s2 = new SynchronizedTest();
		syntest.method2();
//        syntest.nonSynMethod();
// s.method2();
//		SynchronizedTest.staticMethod1();
//		SynchronizedTest.staticMethod2();
//		SynchronizedTest.staticIn.method2();
//        SynchronizedTest.staticIn.staticMethod1();
//        SynchronizedTest.staticIn.method2();

    }
}
