public class Circ extends Shape{
    Circ()
    {
        super();
    }
    Circ(double x, double y,String color)
    {
        super(x,y,color);
    }
    double area()
    {
        return a*b*b;
    }
    @Override
    void printDescription()
    {
        System.out.println("\nDimensions: "+a+" "+b);
        System.out.println("Color: "+c);
        System.out.println("Area: "+area());
    }
}
