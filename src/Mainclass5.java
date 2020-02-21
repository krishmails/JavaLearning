class A5
{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}
 
class B5 extends A5
{
    static void methodOne()
    {
        System.out.println("BBB");
    }
}
 
public class Mainclass5
{
    public static void main(String[] args)
    {
        A5 a = new B5();
         
        a.methodOne();
    }    
}