package Ramy;
import java.util.Scanner;
interface Pack
{
    void odd();
}
class N implements Pack
{
    public void odd()
    {
        
            int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<10;i++)
        {
         arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
        if(arr[i]%2==0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
        }
    }
    
}

public class OddEven
{
    public static void main(String[] args)
    {
        N obj=new N();
        obj.odd();
        
    }
    
}
