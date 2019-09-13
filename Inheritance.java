
package Ramy;

class Add
{
    int a=10,b=5,c;
    Add()
    {
       c=a+b;
       System.out.println("Addition="+c);
    }
}
class Sub extends Add
{
    Sub()
    {
       c=a-b;
       System.out.println("Subtraction="+c);
      
    }
}
class Mul extends Sub
{
    Mul()
    {
        c=a*b;
        System.out.println("Multiplication="+c);
       
    }
}
class Div extends Mul
{
    Div()
    {
        c=a/b;
        System.out.println("Division="+c);
        
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
       Div obj=new Div();
      
    }
    
}
