package com.andreamonacelli.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    void getVerticesCount() {
        assertEquals(3, new Polygon(new Point[]{new Point(0,0),new Point(0,3), new Point(3,2)}).getVerticesCount());
        assertEquals(1, new Polygon(new Point[]{new Point(0,0)}).getVerticesCount());
        assertEquals(2, new Polygon(new Point[]{new Point(0,0),new Point(0,3)}).getVerticesCount());
    }

    @Test
    void getPerimeter() {
        assertEquals(3, new Polygon(new Point[]{new Point(0,0),new Point(0,3), new Point(3,2)}).getPerimeter());
        assertEquals(3, new Polygon(new Point[]{new Point(0,0)}).getPerimeter());
        assertEquals(3, new Polygon(new Point[]{new Point(0,0),new Point(0,3)}).getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(3, new Polygon(new Point[]{new Point(0,0),new Point(0,3), new Point(3,2)}).getArea());
        assertEquals(3, new Polygon(new Point[]{new Point(0,0)}).getArea());
        assertEquals(3, new Polygon(new Point[]{new Point(0,0),new Point(0,3)}).getArea());
    }
}