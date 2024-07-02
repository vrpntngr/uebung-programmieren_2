package de.htw.berlin.uebung.wiederholung.gruppe1;

public class ExternalStudent extends AbstractStudent {
    //private String name;
    private int gastnummer;
    //private double note;

    public ExternalStudent(String name, int gastnummer, double note) {
        this.name = name;
        this.gastnummer = gastnummer;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getGastnummer() {
        return gastnummer;
    }

    public double getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "ExternalStudent{" +
                "name='" + name + '\'' +
                ", gastnummer=" + gastnummer +
                ", note=" + note +
                '}';
    }


}
