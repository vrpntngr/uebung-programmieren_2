package de.htw.berlin.uebung.wiederholung.gruppe2;

public class Student implements Comparable<Student> {
    private String name;
    private int matrikelNummer;
    private double note;

    public Student(String name, int matrikelNummer, double note) {
        this.name = name;
        this.matrikelNummer = matrikelNummer;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    public double getNote() {
        return note;
    }

    @Override
    public int compareTo(Student o) {
        if (this.note < o.note) {
            return -1;
        }
        if (this.note > o.note) {
            return 1;
        }
        return this.name.compareTo(o.name);
//        int sort = Double.compare(this.getNote(), o.note);
//        //Double note1 = this.getNote();
//        //Double note2 = o.getNote();
//        //note1.compareTo(note2);
//
//        if(sort == 0) {
//            int sortString = this.name.compareTo(o.name);
//            return sortString;
//        }
//        return sort;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", matrikelNummer=" + matrikelNummer +
                ", note=" + note +
                '}';
    }
}
