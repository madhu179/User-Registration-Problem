import java.util.regex.*;
public class EmailSampleTest
{
	public static void main(String[] args)
	{
	  String[] valid_Emails = {"abc@yahoo.com,","abc-100@yahoo.com,","abc.100@yahoo.com","abc111@abc.com,","abc-100@abc.net,","abc.100@abc.com.au",
	  "abc@1.com,","abc@gmail.com.com","abc+100@gmail.com"};

	  String[] invalid_Emails = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
	  "abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};

	  String regex = "^[a-zA-Z0-9]+[a-zA-Z0-9+_.-]+[a-zA-Z0-9]+@[a-zA-Z0-9]+[.][a-zA-Z0-9,]+[a-zA-Z0-9,.]+$";
      Pattern patrn = Pattern.compile(regex);
      System.out.println("The result of matching all the Valid Emails with the pattern is :");
      System.out.println(" ");

      for(int i=0;i<valid_Emails.length;i++)
      {
	      Matcher m = patrn.matcher(valid_Emails[i]);
	      if(m.matches())
	      {
	      	if(i!=valid_Emails.length-1)
	      	{
	      	System.out.print("Valid,");
	        }
	        else
	        {
	        	System.out.print("Valid");
	        }
	      }

	      else
	      {
            if(i!=valid_Emails.length-1)
	      	{
	      	System.out.print("Invalid,");
	        }
	        else
	        {
	        	System.out.print("Invalid");
	        }
	      }
     }

     System.out.println(" ");
     System.out.println(" ");

System.out.println("The result of matching all the InValid Emails with the pattern is :");
System.out.println(" ");
    for(int i=0;i<invalid_Emails.length;i++)
      {
	      Matcher m = patrn.matcher(invalid_Emails[i]);
	      if(m.matches())
	      {
	      	if(i!=invalid_Emails.length-1)
	      	{
	      	System.out.print("Valid,");
	        }
	        else
	        {
	        	System.out.print("Valid");
	        }
	      }

	      else
	      {
            if(i!=invalid_Emails.length-1)
	      	{
	      	System.out.print("Invalid,");
	        }
	        else
	        {
	        	System.out.print("Invalid");
	        }
	      }
     }

	}
}