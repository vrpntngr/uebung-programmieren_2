package de.htw.berlin.uebung.mitarbeiterverwaltung2;

public class Employee {
    private final int id;
    private String name;
    private final int yearJoined;

    public Employee(int id, String name, int yearJoined) {
        this.id = id;
        this.name = name;
        this.yearJoined = yearJoined;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearJoined=" + yearJoined +
                '}';
    }


    public int getID() {
        return id;
    }
}
