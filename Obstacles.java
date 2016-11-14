//Name: Are Oelsner
//My obstacles class

import java.util.Scanner;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.geom.Path2D.Double;

public class Obstacles {
        private int numPoints;
        private Vector[] points;
        private Vector[] normals;
        private Vector[] edges;

        public Obstacles(String inFileName) throws FileNotFoundException {
                Scanner s = new Scanner(new File(inFileName));
                numPoints = s.nextInt();
                for(int i = 0; i < numPoints; i++) {
                        double x = s.nextDouble();
                        double y = s.nextDouble();
                        points[i] = new Vector(x, y);
                }
                for(int i = 0; i < numPoints; i++) {
                        double x = s.nextDouble();
                        double y = s.nextDouble();
                        normals[i] = new Vector(x, y);
                }
                for(int i = 0; i < numPoints; i++) {
                        double x = s.nextDouble();
                        double y = s.nextDouble();
                        edges[i] = new Vector(x, y);
                }
        }

        Obstacles() {}

        @Override

        public static void draw() {
                Graphics2D g = new Graphics2D();
                g.moveTo(point[edges[i].x()].x(), point[edges[i].y()].y());
                for(int i = 0; i < numPoints; i++) {
                        g.lineTo(point[edges[i].x()].x(), point[edges[i].y()].y());
                }

        }

}








