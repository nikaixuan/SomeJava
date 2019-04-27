package DesignPatterns.Factory;

/**
 * Created by nikaixuan on 27/4/19.
 */
public class Teacher extends User {

    private String name;
    private int age;
    private String info;

    public Teacher(String name, int age, String info){
        this.name = name;
        this.age = age;
        this.info = info;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getDetail() {
        return this.name+" "+this.info;
    }

    public void changeCourse(){
        System.out.println("Change course");
    }
}
