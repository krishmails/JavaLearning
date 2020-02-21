package com.java.learn;

class X
{
    void method(int a)
    {
        System.out.println("ONE");
    }
     
    void method(double d)
    {
        System.out.println("TWO");
    }
}
 
class Y extends X
{
    
    void method(int f)
    {  f*=f;
        System.out.println("THREE"+f);
    }
}
 
public class Mainclass1 
{    
    public static void main(String[] args)
    {
        new Y().method(10);
    }
}
