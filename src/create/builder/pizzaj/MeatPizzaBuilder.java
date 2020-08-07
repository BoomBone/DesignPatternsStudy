package create.builder.pizzaj;

/**
 * @author Ting
 * @date 2020/8/7
 * @description
 */
public class MeatPizzaBuilder implements PizzaBuilder {

    Pizza pizza = new Pizza();

    @Override
    public void cooking() {
        pizza.setTaste("照烧鸡");
    }

    @Override
    public void sale() {
        pizza.setPrice("250");
    }

    @Override
    public Pizza build() {
        return pizza;
    }


}
