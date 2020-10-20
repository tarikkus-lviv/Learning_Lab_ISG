package Objects;

public class Point {
    public Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    int x;
    int y;
    String color;

    public void out() {
        System.out.println("x :" + x + "y :" + y + "color :" + color);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}