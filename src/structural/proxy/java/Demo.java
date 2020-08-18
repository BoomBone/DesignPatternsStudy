package structural.proxy.java;

/**
 * @author Ting
 * @date 2020/8/13
 * @description
 */
public class Demo {
    public static void main(String[] args) {
        ProxyImage cache = new ProxyImage("cache");
        cache.display();
        cache.display();

    }
}
