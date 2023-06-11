class Circle
{
    double rad;
    final double phi=22/7;
    Circle(double w)
    {
       rad=w;
    }
    double area_c()
    {
        return phi*rad*rad;
    }
}
class Cylinder extends Circle
{
    double h;
    Cylinder(double w,double hl)
    {
        super(w);
        h=hl;
    }
    double area_s()
    {
        return area_c()*h;
    }

}
public class Inher{
    public static void main(String[] args) {
        double cir,cyl;
        Circle ob=new Circle(8.0);
        Cylinder on=new Cylinder(2.0,3.1);
        cyl= on.area_s();
        cir=ob.area_c();
        System.out.println(cyl+"\n"+cir);

    }
}
