/**
 * Created by nikaixuan on 11/4/19.
 */
public class Stu {
    private String name;
    private int age;

    public Stu(){}

    public Stu(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String newname){
        this.name = newname;
    }

    public void eat(){
        System.out.println("Eating");
    }

    public String toString(){
        return "My name is "+ name + " and I am "+ age+" years old.";
    }
}
