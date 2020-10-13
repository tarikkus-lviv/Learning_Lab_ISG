package Homework2;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setVolume(30);

        Shape circle = new Shape();
        circle.setVolume(40);

        Shape square = new Shape();
        square.setVolume(20);

        Box box = new Box();
        box.setVolume(100);

        box.add(shape);
        box.add(circle);
        box.add(square);

        System.out.println(box);
    }
}
