package de.htw.berlin.uebung.wiederholung.gruppe1;

abstract class AbstractStudent implements Comparable<AbstractStudent> {
    String name;
    Double note;

    @Override
    public int compareTo(AbstractStudent o) {
        int result = note.compareTo(o.note);

//        if (this.note < o.note) {
//                return -1;
//            }
//            if (this.note > o.note) {
//                return 1;
//            }
        if (result == 0) {
            return name.compareTo(o.name);
        }
        return result;
    }
}
