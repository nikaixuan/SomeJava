package classload;

/**
 * Created by nikaixuan on 28/4/19.
 */
public class SubClassLoad extends Classload{
    private static String var = "Sub class variable";

    static {
        System.out.println("Sub class static block "+var);
    }

    {
        System.out.println("Sub class block "+var);
    }

    public SubClassLoad(){
        System.out.println("Sub class constructor");
    }
}