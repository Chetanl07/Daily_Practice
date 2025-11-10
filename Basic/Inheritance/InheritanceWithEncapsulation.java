//Day 36 - 10 nov 2025;
public class InheritanceWithEncapsulation {
    public static void main(String []args)
    {

        child c=new child();
        c.setData(10, 20);
        c.showData();
    }
}

class parent
{
    private int x;
    private int y;

    public void setData(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getx()
    {
        return x;
    }

    public int gety()
    {
        return y;
    }
}
class child extends parent
{
    public void showData()
    {
        System.out.println("x value is :"+getx());
        System.out.println("y value is :"+gety());
    }

}
