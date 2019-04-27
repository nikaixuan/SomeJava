package DesignPatterns;

/**
 * Created by nikaixuan on 27/4/19.
 */
public class Builder {

    public static void main(String[] args){

        BuildUser newUser = new BuildUser.UserBuilder("tom",30,"cat").setIsEnrolled(true).setIsTeacher(true).build();
        System.out.println(newUser);
    }

}

class BuildUser{

    //required
    private String name;
    private int age;
    private String info;

    //optional
    private boolean isTeacher;
    private boolean isEnrolled;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setTeacher(boolean teacher) {
        isTeacher = teacher;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }

    private BuildUser(UserBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.info = builder.info;
        this.isEnrolled = builder.isEnrolled;
        this.isTeacher = builder.isTeacher;

    }

    @Override
    public String toString() {
        return this.name+" "+this.age+" "+this.info+" "+this.isTeacher+" "+this.isEnrolled+" ";
    }

    public static class UserBuilder{

        //required
        private String name;
        private int age;
        private String info;

        //optional
        private boolean isTeacher;
        private boolean isEnrolled;

        public UserBuilder(String name, int age, String info){
            this.name = name;
            this.age = age;
            this.info = info;
        }

        public UserBuilder setIsEnrolled(boolean isEnrolled) {
            this.isEnrolled = isEnrolled;
            return this;
        }

        public UserBuilder setIsTeacher(boolean isTeacher){
            this.isTeacher = isTeacher;
            return this;
        }

        public BuildUser build(){
            return new BuildUser(this);
        }
    }
}
