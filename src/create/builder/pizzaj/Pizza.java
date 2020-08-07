package create.builder.pizzaj;

/**
 * @author Ting
 * @date 2020/8/7
 * @description
 */
public class Pizza {
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String taste;
    private String price;

    @Override
    public String toString() {
        return "Pizza{" +
                "taste='" + taste + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
