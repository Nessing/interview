package ru.nessing.interview.lesson_1.polymorphism;

public class Figure implements RoundedCorners, SharpCorners {

    @Override
    public double getRadius(double wight) {
        return (wight / 2) * Math.PI;
    }

    @Override
    public double getRadius(double diameter, double a1) {
        return diameter / 2;
    }

    @Override
    public double getSquare(double a, double b) {
        return a * b;
    }

    @Override
    public double getSquare(double a) {
        return a * a;
    }

    @Override
    public double getPerimeter(double a, double b) {
        return 2 * (a + b);
    }

    @Override
    public double getPerimeter(double a) {
        return 4 * a;
    }

    @Override
    public double getRectangle(double a, double c) {
        return (c / 4) * Math.sqrt(4 * (a * a) - (c * c));
    }

    @Override
    public double getRectangle(double a, double c, double cornerBetweenAandB) {
        return (1 / 2) * (a * a) * Math.sin(a);
    }
}
