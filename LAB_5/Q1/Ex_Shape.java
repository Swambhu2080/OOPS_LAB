import java.util.*;
public class Ex_Shape {

public static void main(String[] args) {
        Shape ob=new Shape();
        Rect R= new Rect(10, 20,"Neon");
        Tri T= new Tri(10, 20,"yellow");
        Circ C = new Circ(3.14,20, "Green");
        square S = new square(20, "Blue");
        ob.manageShape(ob);
        ob.manageShape(R);
        ob.manageShape(T);
        ob.manageShape(C);
        ob.manageShape(S);
    }
}