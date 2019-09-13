
package Ramy;

class A
{
    int a=10,b=5,c;
    void disp()
    {    
    c = a+b;
    System.out.println("Add="+c);
    }
}
class S extends A
{
    void disp()
    {
        
        c=a-b;
        System.out.println("Sub="+c);
       
    }
}
class M extends S
{
    void disp()
    {
        
        c=a*b;
        System.out.println("Mul="+c);
    }
}
class D extends M
{
    void disp()
    {
       
        c=a/b;
        System.out.println("Div="+c);
    }
}
public class Inherit
{
    public static void main(String[] args)
    {
        A obj=new A();
        obj.disp();
        S obj1=new S();
        obj1.disp();
        M obj2=new M();
        obj2.disp();
        D obj3=new D();
        obj3.disp();
        
    }
    
}
