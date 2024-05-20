package de.htw.berlin.uebung.mitarbeiterverwaltung1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private final List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<Employee>();
    }

    public void addEmployee(int id, String name, int eintrittsjahr) {
        Employee employee = new Employee(id, name, eintrittsjahr);
        this.employees.add(employee);
    }

    public void printAllEmployees() {
        System.out.println(employees);
    }

    public void removeEmployee(int id) {
        /*
        Iterator<Employee> iterator = this.employees.iterator();
        Employee employee = null;
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.getId() == id) {
                employee = e;
            }
        }
        this.employees.remove(employee);
         */
        Employee e = null;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                e = employee;
            }
        }
        employees.remove(e);
    }

}
