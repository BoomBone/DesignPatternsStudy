package structural.composite.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ting
 * @date 2020/8/11
 * @description 这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
 */
public class Employee {
    private String name;
    //部门
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add (Employee employee){
        subordinates.add(employee);
    }

    public void remove(Employee employee){
        subordinates.remove(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
