package DesignPatterns.Factory;

/**
 * Created by nikaixuan on 27/4/19.
 */
public class Student extends User {

    private String name;
    private int age;
    private String detail;

    public Student(String name, int age, String detail) {
        this.name=name;
        this.age = age;
        this.detail = detail;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getDetail() {
        return this.detail;
    }

    public String finishHomework(int homeworkId){
        return "Homework "+homeworkId+" has finished.";
    }
}
