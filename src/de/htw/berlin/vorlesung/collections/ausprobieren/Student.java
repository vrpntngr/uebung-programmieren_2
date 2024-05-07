package de.htw.berlin.vorlesung.collections.ausprobieren;

public class Student implements Comparable<Student> {
    int matrikelNummer;
    String name;
    String vorname;
    int semester;

    public Student(int matrikelNummer, String name, String vorname, int semester) {
        this.matrikelNummer = matrikelNummer;
        this.name = name;
        this.vorname = vorname;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrikelNummer=" + matrikelNummer +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", semester=" + semester +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        int diff = this.matrikelNummer - other.matrikelNummer;
        if (diff > 0) {
            return 1;
        }
        if (diff == 0) {
            return 0;
        }
        //if (diff < 0) {
        return -1;

    }
}
