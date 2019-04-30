package classload;

/**
 * Created by nikaixuan on 28/4/19.
 */
public class Classload {

    private static String var = "Super class variable";

    static {
        System.out.println("Super class static block "+var);
    }

    {
        System.out.println("Super class block "+var);
    }

    public Classload(){
        System.out.println("Super class constructor");
    }

    public static void main(String[] args){
        Classload classload = new Classload();
        SubClassLoad subClassLoad = new SubClassLoad();
    }
}


