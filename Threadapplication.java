package Applicationthread;
import java.util.*;
class Odd extends Thread
{
       int num;
       Odd(int no)
       {
           num=no;
       }
       public void run()
       {
            System.out.println("The number is odd");
            System.out.println("Cube of the number :"+(num*num*num));
            
       }
}
class Even extends Thread
{
    int num;
    Even(int no)
    {
        num=no;
    }
    public void run()
    {
        System.out.println("The number is even");
        System.out.println("Square of the number:"+(num*num));
    }
}
class RandomThread
{
    Random obj=new Random();
    int num,no;
    void random()
    {
         for(int i=0;i<no;i++)
         {
             System.out.println("\n\n");
             num=obj.nextInt(10);
             System.out.println("num="+num);
             if((num%2)==0)
             {
                 Even obj=new Even(num);
                         obj.start();
             }
             else
             {
                 Odd obj=new Odd(num);
                 obj.start();
             }
             try
             {
                 Thread.sleep(1000);
             }catch(Exception n){}
         }
    }
}
public class Threadapplication 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        RandomThread obj=new RandomThread();
        System.out.print("Enter the no. of times:");
        obj.no=sc.nextInt();
        Thread t1=new Thread(()->
        {
            obj.random();
        });
        t1.start();
    }
    
}
