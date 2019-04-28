package DesignPatterns.bridge;

/**
 * Created by nikaixuan on 27/4/19.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color c){
        this.color = c;
    }

    public abstract void draw();

}
