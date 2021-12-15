package Shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle()
    {}

    public Rectangle(double width,double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double radius)
    {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    double getArea() {
        return width*length;
    }

    double getPerimeter() {

        return 2*(width + length);
    }
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
}