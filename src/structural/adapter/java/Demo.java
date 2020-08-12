package structural.adapter.java;

/**
 * @author Ting
 * @date 2020/8/10
 * @description
 */
public class Demo {

    public static void main(String[] args) {
        RoundHold hold = new RoundHold(5);
        RoundPed roundPed = new RoundPed(4);
        SquarePeg squarePeg = new SquarePeg(4);
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);

        boolean fit = hold.fit(adapter);
        System.out.println("suare fit " + fit);
    }
}
