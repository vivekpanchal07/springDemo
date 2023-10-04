//using for constructer D.I.
package org.example;

public class Employee {
    private int emp_id;
    private String emp_name;
    private Address add; // for DI object

    public Employee() {
    }

    public Employee(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }
    public Employee(int emp_id,Address address) {
        this.emp_id = emp_id;
        this.add = address;
    }
    public void show(){
        System.out.println(emp_id);
        System.out.println(add.toString());
    }

}
