package DesignPatterns.Factory;

/**
 * Created by nikaixuan on 27/4/19.
 */
public abstract class User {

    public abstract String getName();
    public abstract int getAge();
    public abstract String getDetail();

    @Override
    public String toString() {
        return "The user name is "+this.getName()+", the age is "+ this.getAge()+", and the information is "
                +this.getDetail();
    }
}
