package de.htw.berlin.aufgaben.interfaces;

import java.util.HashSet;
import java.util.Set;

public class Slack implements Publisher {

    private final Set<Listener> listeners;
    private int nrOfMessages;

    public Slack() {
        this.listeners = new HashSet<>();
        this.nrOfMessages = 0;
    }

    @Override
    public boolean register(Listener listener) {
        return this.listeners.add(listener);
    }

    @Override
    public boolean unregister(Listener listener) {
        return listeners.remove(listener);
    }

    @Override
    public void notifyListeners() {
        // listeners.forEach(listener -> listener.update());
        for (Listener listener : listeners) {
            listener.update();
        }
    }

    @Override
    public String getUpdate(Listener listener) {
        return "Breaking News " + this.nrOfMessages;
    }

    public void publishNews() {
        this.nrOfMessages++;
        notifyListeners();
    }
}
