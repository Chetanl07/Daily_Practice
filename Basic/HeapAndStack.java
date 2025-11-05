public class HeapAndStack {
    private Integer i1=900;
    public static void main(String []args)
    {
        HeapAndStack s1=new HeapAndStack();
        HeapAndStack s2=new HeapAndStack();
        HeapAndStack s3=modify(s2);
        s1=null;

        System.out.println(s2.i1);

    }
    public static HeapAndStack modify(HeapAndStack h1)
    {
        h1.i1=9;
        h1=new HeapAndStack();
        h1.i1=20;
        System.out.println(h1.i1);
        h1=null;
        return h1;
    }
    
}
