import java.util.*;
import java.util.regex.*;
public class UserRegistration
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  int j=0,c1=1,c2=1,c3=1,c4=1,c5=1;
	  while(true)
	  {
	  	if(j==0)
	  	{
	  	  if(c1==1)
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
	      	j+=1;
	      }
	    c1+=1;
  	    }

	  	if(j==1)
	  	{
          if(c2==1)
	  	  {
	      System.out.println("Enter the Last Name");
	      }
	      else
	      {
	      	System.out.println("Enter a valid Last Name");
	      }
	      String userName = sc.nextLine();
	      String regex = "[A-Z]{1}[a-z]{2,}"; 
	      Pattern patrn = Pattern.compile(regex);
	      Matcher m = patrn.matcher(userName);
	      if(m.matches())
	      {
	      	j+=1;      
	      	
	      }
	    c2+=1;
	  	}

	  	if(j==2)
	  	{
          if(c3==1)
	  	  {
	      System.out.println("Enter the Email");
	      }
	      else
	      {
	      	System.out.println("Enter a valid Email");
	      }
	      String userName = sc.nextLine();
	      String regex = "[a-zA-Z]+[a-zA-Z_+.-]*[a-zA-Z]+@[a-zA-Z]+[.][a-zA-z]{2}"; 
	      Pattern patrn = Pattern.compile(regex);
	      Matcher m = patrn.matcher(userName);
	      if(m.matches())
	      {
	      	j+=1;
	      	
	      }
	    c3+=1;
	  	}

	  	if(j==3)
	  	{
	  	  if(c4==1)
	  	  {
	      System.out.println("Enter the Mobile Number");
	      }
	      else
	      {
	      	System.out.println("Enter a valid Mobile Number");
	      }
	      String userName = sc.nextLine();
	      String regex = "[0-9]{2}[\\s][0-9]{10}"; 
	      Pattern patrn = Pattern.compile(regex);
	      Matcher m = patrn.matcher(userName);
	      if(m.matches())
	      {
	      	j+=1;
	      	
	      }
	    c4+=1;
  	    }

  	    if(j==4)
	  	{
	  	  if(c5==1)
	  	  {
	      System.out.println("Enter the Password");
	      }
	      else
	      {
	      	System.out.println("Enter a valid Password");
	      }
	      String userName = sc.nextLine();
	      String regex = ".{8,}"; 
	      Pattern patrn = Pattern.compile(regex);
	      Matcher m = patrn.matcher(userName);
	      if(m.matches())
	      {
	      	j+=1;
	      	break;
	      }
	    c5+=1;
  	    }
  	}
	}
}