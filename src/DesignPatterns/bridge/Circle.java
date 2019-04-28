package DesignPatterns.bridge;

/**
 * Created by nikaixuan on 27/4/19.
 */
public class Circle extends Shape {

    public Circle(Color c){
        super(c);
    }

    @Override
    public void draw() {
        System.out.println("This is circle");
        color.draw();
    }
}
