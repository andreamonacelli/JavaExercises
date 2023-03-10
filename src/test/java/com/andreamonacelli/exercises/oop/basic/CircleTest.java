package com.andreamonacelli.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getCenter() {
        Circle circle = new Circle(new Point(0,0),3);
        assertEquals(new Point(0,0),circle.getCenter());
    }

    @Test
    void setCenter() {
        Circle circle = new Circle(new Point(0,0),3);
        circle.setCenter(new Point(2,3));
        assertEquals(new Point(2, 3),circle.getCenter());
    }

    @Test
    void getRadius() {
        Circle circle = new Circle(new Point(0,0),3);
        assertEquals(3,circle.getRadius());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle(new Point(0,0),3);
        circle.setRadius(5);
        assertEquals(5,circle.getRadius());
    }

    @Test
    void getPerimeter() {
        Circle circle = new Circle(new Point(0,0),0.5);
        assertEquals(Math.PI,circle.getPerimeter());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(new Point(0,0),1);
        assertEquals(Math.PI, circle.getArea());
    }

    @Test
    void contains() {
        Circle circle = new Circle(new Point(0,0),1);
        assertTrue(circle.contains(new Point(1, 0)));
    }

    @Test
    void traslate() {
        Circle circle = new Circle(new Point(0,0), 1);
        circle.traslate(2,3);
        assertEquals(new Point(2,3),circle.getCenter());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(new Point(0,0),1);
        assertEquals("Circle{" + "center=" + circle.getCenter().toString() + ", radius=" + circle.getRadius() + '}', circle.toString());
    }
}