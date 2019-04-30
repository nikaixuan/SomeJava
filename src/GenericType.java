/**
 * Created by nikaixuan on 12/4/19.
 */
public class GenericType<Y> {
    private Y y;

    public Y get(){
        return y;
    }

    public void set(Y y){
        this.y = y;
    }

    public static void main(String[] args){
        GenericType<String> type = new GenericType<>();
        type.set("Pankaj"); //valid

        GenericType type1 = new GenericType(); //raw type
        type1.set("Pankaj"); //valid
        type1.set(10); //valid and autoboxing support
        type1.set(new Object());
        System.out.println(type1.get());

    }

}
