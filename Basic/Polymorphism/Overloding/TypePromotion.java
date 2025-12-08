public class TypePromotion {
    public static void main(String[] args) {
        Beta beta = new Beta();
        beta.accept('A');
    }
    
}
class Alpha
{
        public void accept (int x)
        {
            System.out.println("Integer type");
        }
    public void accept (long x)
        {
            System.out.println("Long type");
        }
}
class Beta extends Alpha
{
    public void accept(float x)
    {
        System.out.println("Float type");
    }

    public void accept(double x)
    {
        System.out.println("double type");
    }

}