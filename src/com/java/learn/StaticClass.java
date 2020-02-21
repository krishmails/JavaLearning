package com.java.learn;

class StaticComponents
{
     static int staticVariable;
 
     static
     {
          System.out.println("StaticComponents SIB");
          staticVariable = 10;
          System.out.println(staticVariable );
     }
 
     static void staticMethod()
     {
          System.out.println("From StaticMethod");
          System.out.println(staticVariable);
     }
}
 
public class StaticClass
{
     static
     {
          System.out.println("MainClass SIB");
     }
 
     public static void main(String[] args)
     {
         //Static Members directly accessed with Class Name
          StaticComponents.staticVariable = 20;
          StaticComponents.staticMethod();
     }
}
