package structural.composite.java;

/**
 * @author Ting
 * @date 2020/8/11
 * @description
 */
public class Demo {
    public static void main(String[] args) {
        Employee CEO = new Employee("Abolo", "CEO", 300);
        Employee headMarketing = new Employee("Adis", "Head Marketing", 200);
        Employee headSales = new Employee("Bily", "Head Sales", 200);
        Employee clerkA = new Employee("Conyo", "Marketing", 100);
        Employee clerkB = new Employee("Cindy", "Marketing", 100);
        Employee saleA = new Employee("Dadi", "Sales", 100);
        Employee saleB = new Employee("Dada", "Sales", 100);

        CEO.add(headMarketing);
        CEO.add(headSales);
        headMarketing.add(clerkA);
        headMarketing.add(clerkB);
        headSales.add(saleA);
        headSales.add(saleB);

        System.out.println(CEO);


    }
}
