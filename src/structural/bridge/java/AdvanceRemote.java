package structural.bridge.java;

/**
 * @author Ting
 * @date 2020/8/10
 * @description 高级远程控制
 */
public class AdvanceRemote extends BasicRemote {

    public AdvanceRemote(Device device) {
        super.device = device;
    }

    //静音
    public void mute() {
        System.out.println("Remote :mute");
        device.setVolume(0);
    }
}
