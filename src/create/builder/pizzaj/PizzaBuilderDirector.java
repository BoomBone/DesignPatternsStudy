package create.builder.pizzaj;

/**
 * @author Ting
 * @date 2020/8/7
 * @description
 */
public class PizzaBuilderDirector {

    public Pizza constructor(PizzaBuilder builder){
        builder.cooking();
        builder.sale();
        return builder.build();
    }
}
