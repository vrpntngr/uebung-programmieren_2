package de.htw.berlin.uebung.mitarbeiterverwaltung2;

import java.util.HashSet;

public class EmployeeManager {
    HashSet<Employee> employees = new HashSet();

    public void addEmployee(int id, String name, int yearJoined) {
        employees.add(new Employee(id, name, yearJoined));
    }

    public void printAllEmployees() {
        System.out.println(employees);
    }

    public void findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getID() == id) {
                System.out.println(employee);
            }
        }
    }

    // naechstes mal huebscher machen, keine code doppelung
    public void removeEmployee(int id) {
        // Wir muessen employees to remove erstellen, weil wir sonst in der for schleife eine exception bekommen
        Employee employeeToRemove = null;
        for (Employee employee : employees) {
            if (employee.getID() == id) {
                employeeToRemove = employee;
            }
        }
        // hier muss erst geloescht werden, sonst haetten wir wieder eine ConcurrentModificationException
        employees.remove(employeeToRemove);
    }
}
