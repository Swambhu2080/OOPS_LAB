public class Tri extends Shape{
    Tri()
    {
        super();
    }
    Tri(double x, double y,String color)
    {
        super(x,y,color);
    }
    double area()
    {
        return 0.5*a*b;
    }
    @Override
    void printDescription()
    {
        System.out.println("\nDimensions: "+a+" "+b);
        System.out.println("Color: "+c);
        System.out.println("Area: "+area());
    }
}