package ru.nessing.interview.lesson_1.polymorphism;

public class Square extends Figure {
    @Override
    public double getSquare(double a, double b) {
        return super.getSquare(a, b);
    }

    @Override
    public double getSquare(double a) {
        return super.getSquare(a);
    }
}
