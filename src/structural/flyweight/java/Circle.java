package structural.flyweight.java;

/**
 * @author Ting
 * @date 2020/8/12
 * @description
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}