public class ConverPrimitiveToWrapper {
    public static void main(String[] args)
    {
        byte b=12;
        Byte b1= Byte.valueOf(b);
        System.out.println("Byte object :"+b1);

        short s=25;
        Short s1=Short.valueOf(s);
        System.out.println("Short object :"+s1);

        int i=90;
        Integer i1=Integer.valueOf(i);
        System.out.println("Integer object :"+i1);

        long l=12;
        Long l1=Long.valueOf(l);
        System.out.println("Long object :"+l1);

        float f=25.5f;
        Float f1=Float.valueOf(f);
        System.out.println("Float object :"+f1);

        double d=30.30;
        Double d1=Double.valueOf(d);
        System.out.println("Double object :"+d1);


        char ch='A';
        Character ch1=Character.valueOf(ch);
        System.out.println("Character : " +ch1);


        boolean bo=true;
        Boolean bo1=Boolean.valueOf(bo);
        System.out.println("Boolean object :"+bo1);





     }
    
}
