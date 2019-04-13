/**
 * Created by nikaixuan on 6/4/19.
 */
public class MyService {
    private int count = 0;
    public  void methodA() {
        synchronized (lock) {
            try {
                lock.wait();
            }catch (InterruptedException e){

            }
            lock = "cde";
            count++;
            System.out.println("method a"+count);
        }
    }

    private String lock = "abc";
    public void methodB(){
        synchronized (lock){
            lock.notify();
            count++;
            System.out.println("method b"+count);
        }
    }
}
