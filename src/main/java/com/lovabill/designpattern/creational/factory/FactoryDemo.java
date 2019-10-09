package com.lovabill.designpattern.creational.factory;

enum CoordinateSystem {
    CARTESIAN,
    POLAR
}

class Point {
    private double x, y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private Point(double a, double b, CoordinateSystem cs) {
        switch (cs) {
            case CARTESIAN:
                this.x = a;
                this.y = b;
                break;
            case POLAR:
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);
                break;
        }
    }

    //Inner factory. Could be a separate class as well if constructors were public.
    public static class Factory {

        public static final Point ORIGIN = new Point(0, 0); // singleton field

        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }
}


public class FactoryDemo {
    public static void main(String[] args) {
        //Create with constructor needs a public constructor.
        //Point cartesianPoint1 = new Point(2, 3, CoordinateSystem.CARTESIAN);
        //Point polarPoint1 = new Point(45, 90, CoordinateSystem.POLAR);
        //Point originPoint1 = new Point(0, 0, CoordinateSystem.CARTESIAN);

        //Create with factory, code is self documented.
        Point cartesianPoint2 = Point.Factory.newCartesianPoint(1, 2);
        Point polarPoint2 = Point.Factory.newPolarPoint(1, 2);
        Point originPoint2 = Point.Factory.ORIGIN;
    }
}
