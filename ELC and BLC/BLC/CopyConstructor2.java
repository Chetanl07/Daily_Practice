public class CopyConstructor2 {
    public static void main(String[] args) {
        doll d1=new doll("pari",2.5);
        doll d2=new doll(d1);

        System.out.println(d1);
        System.out.println(d2);
    }
    
}
class doll{
    private String name;
    private double height;

    public doll(String name,double height)
    {
        this.name=name;
        this.height=height;
    }

    public doll(doll doll)
    {
        this.name=doll.name;
        this.height=doll.height;
    }

    public String toString()
    {
        return "doll name="+this.name+" Height ="+height;
    }
}
