package com.andreamonacelli.exercises.oop.basic;

import java.awt.*;

//TESTS PASSED!
public class Circle {
    //Attributes set
    Point center;
    double radius;

    //Constructor
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    //Getters and Setters
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public boolean contains(Point point){
        return Math.sqrt(Math.pow(point.getX() - this.getCenter().getX(),2) + Math.pow(point.getY() - this.getCenter().getX(),2)) <= this.getRadius();
    }

    public void traslate(int dx, int dy){
        this.getCenter().setLocation(this.getCenter().getX() + dx, this.getCenter().getY() + dy);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
