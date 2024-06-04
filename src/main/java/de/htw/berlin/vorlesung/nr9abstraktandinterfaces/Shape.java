package de.htw.berlin.vorlesung.nr9abstraktandinterfaces;

public abstract class Shape {
    public abstract double getUmfang();

    public abstract double getFlaeche();

    @Override
    public String toString() {
        return "dummy";
    }
}
