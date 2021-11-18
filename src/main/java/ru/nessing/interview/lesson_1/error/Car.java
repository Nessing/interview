package ru.nessing.interview.lesson_1.error;

import ru.nessing.interview.lesson_1.error.interfaces.Moveable;
import ru.nessing.interview.lesson_1.error.interfaces.Openable;
import ru.nessing.interview.lesson_1.error.interfaces.Startable;
import ru.nessing.interview.lesson_1.error.interfaces.Stopable;

public abstract class Car implements Moveable, Stopable, Openable, Startable {
    private Engine engine;
    private String color;
    private String name;

    @Override
    public void start() {
        System.out.println("Car starting");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }

    @Override
    public void open() {
        System.out.println("Car is open");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

