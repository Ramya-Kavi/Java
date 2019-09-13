
package Ramy;

class Cover
{
    Cover()
    {
        System.out.println("This is default constructor overloading!!!");
    }
    Cover(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("This is parameterized constructor overloading!!!");
        System.out.println("sum="+c);
    }
}
class Method
{
    void print()
    {
        System.out.println("This is method overloading!!!");
    }
    void print(int x)
    {
        x+=x;
        System.out.println(x);
        System.out.println("This is parameterized method overloading!!!");
    }
}
public class Polymorphism
{
    void add()
    {
    int w=20,y=40;
    System.out.println("w+y="+w+y);
    System.out.println("w+y="+(w+y));
    }
    public static void main(String[] args)
    {
        Cover obj=new Cover();
        Cover obj1=new Cover(10,30);
        Method obj2=new Method();
        obj2.print();
        obj2.print(23);
        Polymorphism obj3=new Polymorphism();
        obj3.add();
    }
}
