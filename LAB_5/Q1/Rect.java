public class Rect extends Shape{
    Rect()
    {
        super();
    }
    Rect(double x, double y,String color)
    {
        super(x,y,color);
    }
    double area()
    {
        return a*b;
    }
    @Override
    void printDescription()
    {
        System.out.println("\nDimensions: "+a+" "+b);
        System.out.println("Color: "+c);
        System.out.println("Area: "+area());
    }
}
