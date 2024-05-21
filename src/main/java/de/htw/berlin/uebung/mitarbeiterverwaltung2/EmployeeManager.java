package de.htw.berlin.uebung.mitarbeiterverwaltung2;

import java.util.HashSet;
import java.util.List;

public class EmployeeManager {
    HashSet<Employee> employees = new HashSet();

    public void addEmployee(int id, String name, int yearJoined) {
        employees.add(new Employee(id, name, yearJoined));
    }

    // List und Set sind beides Collections, deshalb koennen wir hier newEmployees Liste dem Set hinzufuegen
    public void addMultipleEmployees(List<Employee> newEmployees) {
        employees.addAll(newEmployees);
    }
    public void printAllEmployees() {
        System.out.println(employees);
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getID() == id) {
                System.out.println(employee);
                return employee;
            }
        }
        return null;
    }

    public void removeEmployee(int id) {
        // Wir muessen employees to remove erstellen, weil wir sonst in der for schleife eine exception bekommen
        Employee employeeToRemove = findEmployeeById(id);
        // hier muss erst geloescht werden, sonst haetten wir wieder eine ConcurrentModificationException
        employees.remove(employeeToRemove);
    }

    // newEmployees haben wir oben zwar schon verwendet, aber weil wir es nur in Methoden verwenden, ist es nicht ausserhalb verfuegbar
    public void removeMultipleEmployees(List<Employee> employeesToDelete) {
        employees.removeAll(employeesToDelete);
    }
}
