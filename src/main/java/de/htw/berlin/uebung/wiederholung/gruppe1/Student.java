package de.htw.berlin.uebung.wiederholung.gruppe1;

public class Student extends AbstractStudent {

    //private String name;
    private int matrikelnummer;
    //private double note;

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public double getNote() {
        return note;
    }

    public Student(String name, int matrikelnummer, double note) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", matrikelnummer=" + matrikelnummer +
                ", note=" + note +
                '}';
    }


}
