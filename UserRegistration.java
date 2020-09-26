import java.util.*;
import java.util.regex.*;
public class UserRegistration
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  int i=1;
	  while(true)
	  {
	  	  if(i==1)
	  	  {
	      System.out.println("Enter the First Name");
	      }
	      else
	      {
	      	System.out.println("Enter a valid First Name");
	      }
	      String userName = sc.nextLine();
	      String regex = "[A-Z]{1}[a-z]{2,}"; 
	      Pattern patrn = Pattern.compile(regex);
	      Matcher m = patrn.matcher(userName);
	      if(m.matches())
	      {
	      	break;
	      }
	    i+=1;
  	  }
	}
}