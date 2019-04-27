package DesignPatterns;

/**
 * Created by nikaixuan on 27/4/19.
 */
public class Singleton {

    //Lazy initialization, create the singleton instance while required, better than eager and static block.
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }


}

class ThreadSafeSingleton{

    //Double check singleton, reduce extra overhead time of sync method to get thread safe.
    private static ThreadSafeSingleton singletonInstance = null;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance(){
        if (singletonInstance==null){
            synchronized (ThreadSafeSingleton.class){
                if (singletonInstance==null) {
                    singletonInstance = new ThreadSafeSingleton();
                }
            }
        }
        return singletonInstance;
    }
}

//Inner class will be load only when the getInstance method has been called.
class NestedSingleton{

    private NestedSingleton(){}

    private static class InnerSingleton{
        private static NestedSingleton instance = new NestedSingleton();
    }

    public static NestedSingleton getInstance(){
        return InnerSingleton.instance;
    }
}
