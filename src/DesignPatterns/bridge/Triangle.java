package DesignPatterns.bridge;

/**
 * Created by nikaixuan on 27/4/19.
 */
public class Triangle extends Shape {

    public Triangle(Color c){
        super(c);
    }

    @Override
    public void draw() {
        System.out.println("This is triangle");
        color.draw();
    }
}
