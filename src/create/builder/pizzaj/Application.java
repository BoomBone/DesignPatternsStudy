package create.builder.pizzaj;

/**
 * @author Ting
 * @date 2020/8/7
 * @description
 */
public class Application {
    public static void main(String[] args) {
        PizzaBuilderDirector director = new PizzaBuilderDirector();
        Pizza pizza = director.constructor(new FruitPizzaBuilder());
        System.out.println(pizza.toString());
    }
}
