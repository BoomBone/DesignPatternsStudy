package structural.decorator.java;

/**
 * @author Ting
 * @date 2020/8/11
 * @description
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shapeDecorator;

    public ShapeDecorator(Shape decoratedShape){
        this.shapeDecorator =decoratedShape;
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
    }
}
