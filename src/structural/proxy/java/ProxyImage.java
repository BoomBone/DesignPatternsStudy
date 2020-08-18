package structural.proxy.java;

/**
 * @author Ting
 * @date 2020/8/13
 * @description
 */
public class ProxyImage implements Image {

    private String fileName;

    private RealImage image;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(fileName);
        }
        image.display();
    }
}
