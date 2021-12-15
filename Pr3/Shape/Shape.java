package Shape;
public abstract class Shape {
    public String color;
    public boolean filled;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(boolean filled) {
        return filled;
    }

    public void setFilled() {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + ", filled=" + filled +  '}';
    }
}