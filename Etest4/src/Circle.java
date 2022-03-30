public class Circle implements GeometricObject
{
    public final double PI=3.141593;
    protected double radius=1;

    public  Circle(double radius)
    {
        this.radius=radius;
    }

    @Override
    public double getPerimeter()
    {
        double perimeter;
        perimeter=(2*PI*radius);
        return perimeter;
    }

    @Override
    public double getArea()
    {
        double area;
        area= (PI)*radius*radius;
        return area;
    }
}
