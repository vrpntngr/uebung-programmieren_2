package de.htw.berlin.aufgaben.interfaces;

public interface Publisher {

    boolean register(Listener listener);

    boolean unregister(Listener listener);

    void notifyListeners();

    String getUpdate(Listener listener);
}
