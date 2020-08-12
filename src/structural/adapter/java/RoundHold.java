package structural.adapter.java;

/**
 * @author Ting
 * @date 2020/8/10
 * @description
 */
public class RoundHold {

    private double holdRadius;

    public double getRadius() {
        return holdRadius;
    }

    public RoundHold(double radius) {
        this.holdRadius = radius;
    }

    public boolean fit(RoundPed ped) {
        if (holdRadius > ped.getRadius()) {
            return true;
        } else {
            return false;
        }
    }
}
