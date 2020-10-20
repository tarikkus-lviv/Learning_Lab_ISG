package Objects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Point[] point = new Point[6];
        Object object = new Point(1, 1, "fgfg");

        for (int i=0; i<point.length; i++){
            point[i] = new Point(i, i, "Color:" + i);
        }
        
        for (int i=0; i< point.length; i++){
            System.out.println("Point " + point[i].toString());
        }
    }
}
