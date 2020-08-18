package structural.proxy.java;

/**
 * @author Ting
 * @date 2020/8/13
 * @description
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loadFromDisk "+fileName);
    }

    @Override
    public void display() {
        System.out.println("Display "+fileName);
    }
}
