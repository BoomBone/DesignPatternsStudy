package behavioral.command.java;

/**
 * @author Ting
 * @date 2020/8/18
 * @description 创建实现了Order接口的实体类
 */
public class BuyStock  implements Order{

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
