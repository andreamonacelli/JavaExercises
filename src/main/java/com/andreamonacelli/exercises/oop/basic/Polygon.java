package com.andreamonacelli.exercises.oop.basic;

import java.awt.*;
import java.util.Arrays;

public class Polygon {
    //Attributes Set
    Point[] vertices;
    //METHODS
    //Constructor Method
    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    //Method to get the number of vertices
    public int getVerticesCount(){
        return this.vertices.length;
    }

    //Method to get the perimeter
    public double getPerimeter(){
        double perimeter = 0.0;
        if(this.getVerticesCount() > 1){
            for(int i = 1; i < this.getVerticesCount(); i++) {
                perimeter += Math.sqrt(
                    Math.pow(vertices[i].getX() - vertices[i - 1].getX(),2) + Math.pow(vertices[i].getY() - vertices[i - 1].getY(),2)
                );
            }
        }
        return perimeter;
    }

    /**
     * Calculates the area of an irregular polygon
     * @return
     */
    public double getArea(){
        double area = 0.0;
        for (int i = 1; i < this.vertices.length; i++) {
            area += (vertices[i - 1].x * vertices[i].y) - (vertices[i - 1].y * vertices[i].x);
        }
        return Math.abs(area / 2.0);
    }

    /**
     * Override of the toString() method to show the polygon
     * @return
     */
    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
