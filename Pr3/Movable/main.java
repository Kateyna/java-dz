package Movable;
public class main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println(point);
        point.moveUp();
        point.moveLeft();
        System.out.println(point);
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 2);
        System.out.println(circle);
        circle.moveDown();
        circle.moveRight();
        System.out.println(circle);
        MovableRectangle rectangle = new MovableRectangle(0, 0, 1, 1, 1, 1);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveLeft();
        System.out.println(rectangle);
    }
}
