package structural.facade.java;

/**
 * @author Ting
 * @date 2020/8/12
 * @description
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
