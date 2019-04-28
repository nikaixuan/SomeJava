package DesignPatterns.bridge;

/**
 * Created by nikaixuan on 27/4/19.
 */
public class GreenColor implements Color {

    @Override
    public void draw() {
        System.out.println("Draw green color");
    }
}
