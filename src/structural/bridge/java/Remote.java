package structural.bridge.java;

/**
 * @author Ting
 * @date 2020/8/10
 * @description 远程控制通用接口
 */
public interface Remote {
    void power();
    void volumeDown();
    void volumeUp();
    void channelDown();
    void channelUp();
}
