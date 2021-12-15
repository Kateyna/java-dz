package Shape;
public class Square extends Rectangle
{
    public Square()
    {}

    public Square(double width)
    {
        this.width = width;
        this.length = width;
    }
    public Square(double width, String color, boolean filled)
    {
        this.width = width;
        this.length = width;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){return width;}

    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setLength(double length) {this.length = length; }
    public double getSide() { return length; }
    public void setSide (double side)
    {
        this.length = side;
        this.width = side;
    }
    @Override
    public String toString()
    {
        return "Square(" + "width= " + width  + ", length= " + length + ", color= '" + color + ",filled = " + filled + ")";
}
}
