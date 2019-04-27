package DesignPatterns.Factory;

/**
 * Created by nikaixuan on 27/4/19.
 */
public class TeacherFactory implements UserAbstractFactory {

    private String name;
    private int age;
    private String info;

    public TeacherFactory(String name, int age, String info){
        this.name = name;
        this.age = age;
        this.info = info;
    }

    @Override
    public User createUser() {
        return new Teacher(name,age,info);
    }
}
