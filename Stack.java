

package stack;
import java.util.Scanner;
interface stackmethod
{
  void create();
  void push();
  void pop();
  void display();
  int MAX=5;
}
class StackFunctions implements stackmethod
{
int top=-1;
int a[]=new int[MAX];
Scanner sc=new Scanner(System.in);
public void create()
        
{
    int i, n;
    System.out.print("Enter the no of elements:");
    n=sc.nextInt();
    if(n>MAX)
        System.out.println("Exceeded size limit");
    else
    {
        for( i=0;i<n;i++)
        {
            System.out.printf("\nEnter the %d elements:",i);
            a[i]=sc.nextInt();
        }
    }
    top=n-1;   
}
public void push()
{
if(top==MAX-1)
System.out.println("Stack overflow!!!");
else
{
top++;
System.out.print("Enter the elements to be pushed:");
a[top]=sc.nextInt();
}
}
public void pop()
{
if(top==-1)
System.out.println("Stack underflow!!!");
else
{
System.out.println("Elements popped:"+a[top]);
top--;
}
}
public void display()
{
int i;
if(top==-1)
System.out.println("Stack is empty!!");
else
{
System.out.println("Elements in stack:");
for( i=top;i>=0;i--)
System.out.println(a[i]);
}
}
}
public class Stack 
{
   public static void main(String[] args)
   {
       int ch;
       stackmethod obj=new StackFunctions();
       Scanner sc=new Scanner(System.in);
       while(true)
       {
           System.out.print("--------MENU--------\n\n1.create\n2.push\n3.pop\n4.display\n5.exit\nEnter your choice:");
           ch=sc.nextInt();
           switch(ch)
           {
               case 1:obj.create();
                   break;
               case 2:obj.push();
                   break;
               case 3:obj.pop();
                   break;
               case 4:obj.display();
                   break;
               case 5:System.exit(0);
                   break;
               default:
                   System.out.println("\nPlease select correct option:");
           }
           
           }
       }
}
