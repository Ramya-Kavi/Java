package Userdefined;
import java.util.Scanner;
class InvalidPhoneNumberException extends Exception
{
    InvalidPhoneNumberException(String p)
    {
      super(p);  
    }
}
public class Userdefexception 
{
    static void valid(int len) throws InvalidPhoneNumberException
    {
        if(len!=10)
            throw new InvalidPhoneNumberException("Phone number is not valid!");
        else
            System.out.println("Your phone number is valid");
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String phoneNumber;
        int len;
        System.out.println("Enter your phone number:");
        phoneNumber=sc.nextLine();
        len=phoneNumber.length();
        try
        {
            valid(len);
        }catch(InvalidPhoneNumberException e)
        {
            System.out.println("Exception occured :"+e);
            
        }
    }
}
