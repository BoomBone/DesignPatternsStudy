package create.builder.pizzaj;

/**
 * @author Ting
 * @date 2020/8/7
 * @description
 */
public class FruitPizzaBuilder implements PizzaBuilder {
    Pizza pizza = new Pizza();

    @Override
    public void cooking() {
        pizza.setTaste("水果味");
    }

    @Override
    public void sale() {
        pizza.setPrice("100");
    }

    @Override
    public Pizza build() {
        return pizza;
    }
}
