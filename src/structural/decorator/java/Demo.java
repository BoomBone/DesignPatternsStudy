package structural.decorator.java;

/**
 * @author Ting
 * @date 2020/8/11
 * @description
 */
public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
    }
}
