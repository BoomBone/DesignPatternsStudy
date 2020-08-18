package behavioral.command.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ting
 * @date 2020/8/18
 * @description 创建命令调用类
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }
}
