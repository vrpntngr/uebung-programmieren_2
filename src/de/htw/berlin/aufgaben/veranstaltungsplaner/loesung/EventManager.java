package de.htw.berlin.aufgaben.veranstaltungsplaner.loesung;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> events;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    @Override
    public String toString() {
        return "EventManager{\n" +
                "events=" + events + "\n" +
                '}';
    }

}
