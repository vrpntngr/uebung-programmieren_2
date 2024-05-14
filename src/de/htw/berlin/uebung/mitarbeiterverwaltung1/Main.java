package de.htw.berlin.uebung.mitarbeiterverwaltung1;

public class Main {

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(101, "Alice", 2010);
        manager.addEmployee(102, "Bob", 2015);
        manager.addEmployee(103, "Charlie", 2012);

        /*
        System.out.println("All Employees:");
        manager.printAllEmployees();

        System.out.println("\nSearch for Employee ID 102:");
        manager.findEmployeeById(102);

        System.out.println("\nRemoving Employee ID 101:");
        manager.removeEmployee(101);
        manager.printAllEmployees();

        System.out.println("\nSorted by Year Joined:");
        manager.sortEmployeesByYearJoined();
         */
    }


}
