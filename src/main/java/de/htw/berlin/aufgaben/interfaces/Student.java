package de.htw.berlin.aufgaben.interfaces;

import java.util.Objects;

public class Student implements Listener {

    private String name;

    private Publisher publisher;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = publisher.getUpdate(this);
        System.out.println(this.name + " received " + msg);
    }

    @Override
    public void setPublisher(Publisher publisher) {
        publisher.register(this);
        this.publisher = publisher;
        System.out.println(this.name + " registered!");
    }

    @Override
    public void removePublisher(Publisher publisher) {
        publisher.unregister(this);
        System.out.println(this.name + " deregistered!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
