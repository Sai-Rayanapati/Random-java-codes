public class ResizableCircle extends Circle implements Resizable
{

    ResizableCircle(double radius)
    {
        super(radius);
    }

    @Override
    public void resize(int percent)
    {
        radius=radius-((percent*radius)/100.00);
    }
}
