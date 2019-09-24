package File;
import java.io.*;
import java.util.Scanner;
public class FileHandling 
{
   public static void main(String[] args)
           
           
   {
       String str;
       int opt;
       String type="";
       char temp;
       Scanner sc=new Scanner(System.in);
       System.out.print("\nEnter the file name with path(d:\\\\folder\\\\@.txt):");
       str=sc.next();
       File f=new File(str);
       for(int i=0;i<str.length();i++)
       {
           temp=str.charAt(i);
           if(temp=='.')
           {
               while(i!=(str.length()))
               {
                   type+=str.charAt(i);
                   i++;
               }
           }
       }
       while(true)
       {
           System.out.println("\n1.Is exists?\n2.Is file?\n3.Can Read?\n4.Can write?\n5.Can execute?\n6.Length\n7.Type\n8.exit");
           System.out.print("Select your option:");
           opt=sc.nextInt();
           switch(opt)
           {
                case 1: 
                       if(f.exists())
                           System.out.println("\nYes,the File Exists!");
                        else
                           System.out.println("\nNo,the File not Exists!");
                   break;
                case 2:
                        if(f.isFile())
                            System.out.println("\nYes ,it is a file");
                        else
                            System.out.println("\nNo ,the file is not file");
                        break;
                case 3:
                        if(f.canRead())
                            System.out.println("\nYes ,the file is readable!");
                        else
                            System.out.println("\nNo,the file is not readable!");
                    break;
                case 4:
                        if(f.canWrite())
                            System.out.println("\nYes,the file is writable!");
                        else
                            System.out.println("\nNo,the file is not writable!");
                    break;
                case 5:
                        if(f.canExecute())
                            System.out.println("\nYes,the file is executable!");
                        else
                            System.out.println("\nNo,the file is not executable!");
                    break;
                case 6:
                     System.out.println("\nLength of the file:"+f.length());
                    break;
                case 7:
                    System.out.println("\nType of the file:"+type);
                    break;
                case 8:
                    System.exit(0);break;
                default:
                    System.out.println("\nplease select correct opt");
           }
       }
   }
    
}
