package uservalidation;
import java.util.regex.*;
public class ValidationMain {
	
	public String validate_fname(String fname) throws FirstNameException
	{
		try {
			if(fname.length()==0)
			{
				throw new FirstNameException("FirstName should not be EMPTY");
			}
			else 
			{
			String fnameregx = "[A-Z]{1}[a-z]{2,}"; 
		    Pattern patrn = Pattern.compile(fnameregx);
		    Matcher m1 = patrn.matcher(fname);
		    if(m1.matches())
		    	return "Valid Input";
		    else
		    	throw new FirstNameException("Invalid FirstName");
			}
		}catch(NullPointerException e)
		{
			throw new FirstNameException("FirstName should not be NULL");
		}
		
	}
	
	public String validate_lname(String lname) throws LastNameException
	{
		try {
			if(lname.length()==0)
			{
				throw new LastNameException("LastName should not be EMPTY");
			}
			else 
			{
			String lnameregx = "[A-Z]{1}[a-z]{2,}"; 
		    Pattern patrn = Pattern.compile(lnameregx);
		    Matcher m2 = patrn.matcher(lname);
		    if(m2.matches())
		    	return "Valid Input";
		    else
		    	throw new LastNameException("Invalid LastName");
			}
		}catch(NullPointerException e)
		{
			throw new LastNameException("LastName should not be NULL");
		}
		
	}
	
	
	public String validate_email(String email) throws EmailException
	{
		try {
			if(email.length()==0)
			{
				throw new EmailException("Email should not be EMPTY");
			}
			else 
			{
			String emailregx = "[a-zA-Z]+[a-zA-Z_+.-]*[a-zA-Z]+@[a-zA-Z]+[.][a-zA-z]{2}"; 
		    Pattern patrn = Pattern.compile(emailregx);
		    Matcher m3 = patrn.matcher(email);
		    if(m3.matches())
		    	return "Valid Input";
		    else
		    	throw new EmailException("Invalid Email");
			}
		}catch(NullPointerException e)
		{
			throw new EmailException("Email should not be NULL");
		}
		
	}
	
	public String validate_phno(String phno) throws PhoneNumberException
	{
		try {
			if(phno.length()==0)
			{
				throw new PhoneNumberException("Phone Number should not be EMPTY");
			}
			else 
			{
			String phnoregx = "[0-9]{2}[\\s][0-9]{10}"; 
		    Pattern patrn = Pattern.compile(phnoregx);
		    Matcher m4 = patrn.matcher(phno);
		    if(m4.matches())
		    	return "Valid Input";
		    else
		    	throw new PhoneNumberException("Invalid Phone Number");
			}
		}catch(NullPointerException e)
		{
			throw new PhoneNumberException("Phone Number should not be NULL");
		}
		
	}
	
	public String validate_password(String password) throws PasswordException
	{
		try {
			if(password.length()==0)
			{
				throw new PasswordException("Password should not be EMPTY");
			}
			else 
			{
				String pswdregx = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}"; 
			    Pattern patrn = Pattern.compile(pswdregx);
			    Matcher m5 = patrn.matcher(password);
		    if(m5.matches())
		    	return "Valid Input";
		    else
		    	throw new PasswordException("Invalid Password");
			}
		}catch(NullPointerException e)
		{
			throw new PasswordException("Password should not be NULL");
		}
		
	}


}
