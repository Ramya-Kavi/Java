
package Ramy;

class A
{
    int a=10,b=5,c;
    void add()
    {    
    c = a+b;
    System.out.println("Add="+c);
    }
}
class S extends A
{
    void sub()
    {
        c=a-b;
        System.out.println("Sub="+c);
       
    }
}
class M extends S
{
    void mul()
    {
        c=a*b;
        System.out.println("Mul="+c);
    }
}
class D extends M
{
    void div()
    {
        c=a/b;
        System.out.println("Div="+c);
    }
}
public class Inherit
{
    public static void main(String[] args)
    {
        D obj=new D();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
    
}
