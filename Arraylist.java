package Array;

import Array.Arraylist;
import java.util.*;
class Method
{
    ArrayList<String> arr=new ArrayList<String>();
    Scanner scan =new Scanner(System.in);
    String str;
    void append()
    {
        int no;
        System.out.print("Enter the number of element:");
        no=scan.nextInt();
        for(int i=1;i<=no;i++)
        {
            System.out.printf("Enter the string %d:",i);
            str=scan.next();
            arr.add(str);
            System.out.println("Successfull!!!!");
        }
    }
    void insert()
    {
        int no,pos;
        System.out.print("Enter the number of element:");
        no=scan.nextInt();
        for(int i=1;i<=no;i++)
        {
            System.out.printf("Enter the string %d:",i);
            str=scan.next();
            System.out.print("Enter the positon:");
            pos=scan.nextInt();
            if(pos-1<=arr.size())
            {
                arr.add(pos-1,str);
                System.out.println("Successfull!!!");
            }
            else
                System.out.println("\n\nUnable to insert\n");
        }
    }
    void search()
    {
        String key;
        int found=0;
        System.out.print("Enter the key to search:");
        key=scan.next();
        for(int i=0;i<arr.size();i++)
        {
            if(key.equals(arr.get(i)))
            {
                found=1;
                System.out.printf("\nThe string is found at index:%d and position :%d\n",i,i+1);
                break;
            }
        }
        if(found==0)
            System.out.println("\nStringnot found!!!!\n");
    }
    void find()
    {
        char key;
        int found=0;
        System.out.print("\nEnter the key character to search:");
        key=scan.next().charAt(0);
        for(String s:arr)
        {
            if(key==s.charAt(0))
            {
                System.out.println(s);
                found=1;
            }  
        }
        if(found==0)
            System.out.println("No elements found!!!");
    }
    void display()
    {
         if(arr.size()==0)
             System.out.println("\nArray list is empty....\n");
         else
         {
             System.out.println("The elements are:");
             for(String s : arr)
                 System.out.println(s);
         }
    }
}
public class Arraylist 
{
    public static void main(String[] args)
    {
        Method obj=new Method();
        Scanner scan=new Scanner(System.in);
        int ch;
        while(true)
        {
            System.out.println("-------------MENU-------------\n\n1.APEND\n2.INSERT\n3.SEARCH\n4.FIND\n5.DISPLAY\n6.EXIT\nENTER YOUR CHOICE:");
            ch=scan.nextInt();
            switch(ch)
            {
                case 1:obj.append();
                    break;
                case 2:obj.insert();
                    break;
                case 3:obj.search();
                    break;
                case 4:obj.find();
                    break;
                case 5:obj.display();
                    break;
                case 6:System.exit(0);
                    break;
                default:
                    System.out.println("\nPlease select correct option");
                    
            }
        }
    }
}
