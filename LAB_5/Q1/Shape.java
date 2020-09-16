public class Shape {
    double a;
    double b;
    String c;
    Shape()
    {
        a=b=0;
        System.out.println("Default constructor of Shape");
    }
    Shape(double x,double y,String color)
    {
        a=x;
        b=y;
        c=color;
        System.out.println("Constructor of Shape with parameters: "+a+" "+b+" "+c);
    }
    void manageShape(Shape myShape)  
    {
        myShape.printDescription();
    }
    void printDescription()
    {
        System.out.println("Shape Class");
    }

}