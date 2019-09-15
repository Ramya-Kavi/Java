package Ramy;
import java.util.Scanner;
abstract class N
{
    abstract void odd(int arr);
}
class No extends N
{
     void odd(int arr)
    {
        
        if(arr%2==0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
        
    }
    
}

public class OddEven
{
    public static void main(String[] args)
    {
        
            int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<10;i++)
        {
         arr[i]=sc.nextInt();
        }
        No obj=new No();
        for(int i=0;i<10;i++)
        {
        obj.odd(arr[i]);
        }
        
    }
    
}
