class A
{
    public A(int i)
    {
        System.out.println(myMethod(i));
    }
     
    int myMethod(int i)    
    {
    	int a = ++i;
    	int b= --i;
    	int c = a + b;
    	return c;
        //return ++i + --i;
    }
}
 
class B extends A
{
    public B(int i, int j)
    {
        super(i*j);
         
        System.out.println(myMethod(i, j));
    }
     
    int myMethod(int i, int j)
    {
        return myMethod(i*j);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        B b = new B(12, 21);
    }    
}