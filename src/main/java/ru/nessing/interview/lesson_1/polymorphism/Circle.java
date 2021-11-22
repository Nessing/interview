package ru.nessing.interview.lesson_1.polymorphism;

public class Circle extends Figure {
    @Override
    public double getRadius(double wight) {
        return super.getRadius(wight);
    }

    @Override
    public double getRadius(double diameter, double a1) {
        return super.getRadius(diameter, a1);
    }
}
