package structural.decorator.java;

/**
 * @author Ting
 * @date 2020/8/11
 * @description
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画个圆");
    }
}
