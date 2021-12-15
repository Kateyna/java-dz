package Shape;

public class main
{
    public static void main(String[] args)
    {
        Circle Circle1 = new Circle("Чёрный",true,8);
        System.out.println("Площадь круга:" + Circle1.getArea());
        Rectangle Rectangle1 = new Rectangle(1,2);
        System.out.println("Площадь прямоугольника: " + Rectangle1.getArea());
        Square Square1 = new Square(4);
        System.out.println("Площадь квадрата: " + Square1.getArea());
    }
}
