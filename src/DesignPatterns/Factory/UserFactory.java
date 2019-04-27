package DesignPatterns.Factory;

/**
 * Created by nikaixuan on 27/4/19.
 */
//In service -> get user detail from DB -> Use factory to map certain POJO
public class UserFactory {

    private static UserFactory instance;
    private UserFactory(){}

    public static UserFactory getInstance(){
        if (instance==null){
            instance = new UserFactory();
        }
        return instance;
    }

    //factory method
    public User getUser(String userType, String name, int age, String info){

        if (userType.equals("teacher")){
            return new Teacher(name,age,info);
        }else if (userType.equals("student")){
            return new Student(name,age,info);
        }
        return null;
    }

    //abstract factory method
    public User getUserByAbstracy(UserAbstractFactory userAbstractFactory){
        return userAbstractFactory.createUser();
    }

}
