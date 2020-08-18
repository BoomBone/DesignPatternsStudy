package behavioral.command.java;

/**
 * @author Ting
 * @date 2020/8/18
 * @description 实现Order接口的实体类
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
