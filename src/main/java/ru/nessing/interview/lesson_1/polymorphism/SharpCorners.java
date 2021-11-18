package ru.nessing.interview.lesson_1.polymorphism;

public interface SharpCorners {
    double getSquare(double a, double b);
    double getSquare(double a);
    double getPerimeter(double a, double b);
    double getPerimeter(double a);
    double getRectangle(double a, double c);
    double getRectangle(double a, double c, double cornerBetweenAandB);
}
