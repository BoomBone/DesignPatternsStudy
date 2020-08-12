package structural.facade.java;

/**
 * @author Ting
 * @date 2020/8/12
 * @description
 */
public class Demo {
    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();
        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
