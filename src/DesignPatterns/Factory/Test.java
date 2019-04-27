package DesignPatterns.Factory;

/**
 * Created by nikaixuan on 27/4/19.
 */
public class Test {

    public static void main(String[] args){

        UserFactory factory = UserFactory.getInstance();
        //test factory pattern
        Teacher teacher1 = (Teacher) factory.getUser("teacher","abc",40,"math teacher"); //Downcasting
        teacher1.changeCourse();
        User user1 = factory.getUser("student","qop",17,"year 11 stu");
        System.out.println(user1 instanceof Student);

        //test abstract factory
        User teacher2 = factory.getUserByAbstracy(new TeacherFactory("bcd",50,"art teacher"));
    }
}
