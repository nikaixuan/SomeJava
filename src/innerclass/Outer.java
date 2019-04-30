package innerclass;


/**
 * Created by nikaixuan on 28/4/19.
 */
public class Outer {

    private String name  = "tom";
    private int age = 10;

    public void printInfo(int x,final int y){

        int test = 9;

        class Stu{
            private String level = "tea";
            private int id = 00;

            public void printstu(){
                System.out.println(age);
                System.out.println(y);
                System.out.println(test);
                System.out.println(x);
            }
        }
        Stu stu = new Stu();
        stu.printstu();
    }

    private class Inner{
        //only use final static and assign a constant value
        static final int a = 0;
        public void print(){
            System.out.println(name);
            Outer.this.name = "jerry";
            System.out.println(name);
        }
    }

    public static class StaticInner{

        static int b = 0;

        public StaticInner(){
            System.out.println(b);
        }
    }

    public Inner getInstance(){
        return new Inner();
    }

    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = new Outer().new Inner();
        outer.getInstance().print();
        inner.print();
        outer.printInfo(1,2);

    }

}
