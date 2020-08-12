package structural.adapter.java;

/**
 * @author Ting
 * @date 2020/8/10
 * @description
 */
public class SquarePegAdapter extends RoundPed {

    private double width;

    public SquarePegAdapter(SquarePeg peg) {
       width =peg.getWidth();
    }

    @Override
    public double getRadius() {
        //外接圆
        double outRadius = Math.sqrt(Math.pow(width / 2, 2) * 2);
        return outRadius;
    }
}
