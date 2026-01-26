public class OwnFunctionalInterface {
    public static void main(String[] args) {
        MyInterface<Integer,Integer,Integer,String>  custom
        = (a,b,c) -> a+b+c +" ";

        System.out.println(custom.myApply(10, 20, 30));
        
    }
    
}


 interface MyInterface<T,U,V,R>
  {
    R myApply(T a, U b,V c);
}