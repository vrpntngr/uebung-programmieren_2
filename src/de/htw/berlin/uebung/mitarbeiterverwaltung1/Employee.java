package de.htw.berlin.uebung.mitarbeiterverwaltung1;

public class Employee {
    private final int id;
    private String name;
    private final int eintrittsjahr;

    public Employee(int id, String name, int eintrittsjahr) {
        this.id = id;
        this.name = name;
        this.eintrittsjahr = eintrittsjahr;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id = " + id +
                ", name = " + name +
                ", eintrittsjahr = " + eintrittsjahr +
                '}' + "\n";
    }

}
