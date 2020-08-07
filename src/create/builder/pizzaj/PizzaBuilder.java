package create.builder.pizzaj;

/**
 * @author Ting
 * @date 2020/8/7
 * @description
 */
public interface PizzaBuilder {
    void cooking();
    void sale();

    Pizza build();
}
