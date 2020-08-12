package structural.decorator.java;

/**
 * @author Ting
 * @date 2020/8/11
 * @description
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border Color : Red");
    }
}
