package DesignPatterns.Factory;

/**
 * Created by nikaixuan on 27/4/19.
 */
public class StudentFactory implements UserAbstractFactory {

    private String name;
    private int age;
    private String detail;

    public StudentFactory(String name, int age, String detail) {
        this.name=name;
        this.age = age;
        this.detail = detail;
    }

    @Override
    public User createUser() {
        return new Student(name,age,detail);
    }
}
