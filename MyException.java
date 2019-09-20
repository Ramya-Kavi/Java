package Ramy;
public class MyException extends Exception 
{
    private static int accno[]={1001,1002,1003,1004};
    private static String name[]={"RAmya","Safha","3d","Ish"};
    private static double bal[]={1000.00,200.00,6000.00,999.00};
    MyException()
    {
    }
    MyException(String str)
    {
        super(str);
    }
    public static void main(String[] args)
    {
        try
        {
            System.out.println("ACCNO"+"\t"+"CUSTOMER"+"\t"+"BALANCE");
            for(int i=0;i<5;i++)
            {
                System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
                if(bal[i]<1000)
                {
                    MyException me=new MyException("Balance is less than 1000");
                    throw me;
                }
            }
        }
        catch(MyException e)
        {
            e.printStackTrace();
        }
    }
}
