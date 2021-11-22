package ru.nessing.interview.lesson_1.polymorphism;

public class Rectangle extends Figure {
    @Override
    public double getRectangle(double a, double c) {
        return super.getRectangle(a, c);
    }

    @Override
    public double getRectangle(double a, double c, double cornerBetweenAandB) {
        return super.getRectangle(a, c, cornerBetweenAandB);
    }
}
