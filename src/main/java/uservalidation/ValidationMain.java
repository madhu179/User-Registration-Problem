package uservalidation;
import java.util.regex.*;
public class ValidationMain {
	
	public boolean validate_all_details(String fname,String lname,String email,String phno,String password)
	{
		String fnameregx = "[A-Z]{1}[a-z]{2,}"; 
	    Pattern patrn = Pattern.compile(fnameregx);
	    Matcher m1 = patrn.matcher(fname);
	    
	    String lnameregx = "[A-Z]{1}[a-z]{2,}"; 
	     patrn = Pattern.compile(lnameregx);
	    Matcher m2 = patrn.matcher(lname);
	    
	    String emailregx = "[a-zA-Z]+[a-zA-Z_+.-]*[a-zA-Z]+@[a-zA-Z]+[.][a-zA-z]{2}"; 
	     patrn = Pattern.compile(emailregx);
	    Matcher m3 = patrn.matcher(email);
	    
	    String phnoregx = "[0-9]{2}[\\s][0-9]{10}"; 
	     patrn = Pattern.compile(phnoregx);
	    Matcher m4 = patrn.matcher(phno);
	    
	    String pswdregx = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}"; 
	     patrn = Pattern.compile(pswdregx);
	    Matcher m5 = patrn.matcher(password);
	    
		return (m1.matches() && m2.matches() && m3.matches() && m4.matches() && m5.matches());
	}
	
	public boolean validate_fname(String fname)
	{
		String fnameregx = "[A-Z]{1}[a-z]{2,}"; 
	    Pattern patrn = Pattern.compile(fnameregx);
	    Matcher m1 = patrn.matcher(fname);
	    return (m1.matches());
	}
	
	public boolean validate_lname(String lname)
	{
		String lnameregx = "[A-Z]{1}[a-z]{2,}"; 
	    Pattern patrn = Pattern.compile(lnameregx);
	    Matcher m2 = patrn.matcher(lname);
	    return (m2.matches());
	}
	
	public boolean validate_email(String email)
	{
		String emailregx = "[a-zA-Z]+[a-zA-Z_+.-]*[a-zA-Z]+@[a-zA-Z]+[.][a-zA-z]{2}"; 
	    Pattern patrn = Pattern.compile(emailregx);
	    Matcher m3 = patrn.matcher(email);
	    return (m3.matches());
	}
	
	public boolean validate_phno(String phno)
	{
		String phnoregx = "[0-9]{2}[\\s][0-9]{10}"; 
	    Pattern patrn = Pattern.compile(phnoregx);
	    Matcher m4 = patrn.matcher(phno);
	    return (m4.matches());
	}
	
	public boolean validate_password(String password)
	{
		String pswdregx = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}"; 
	    Pattern patrn = Pattern.compile(pswdregx);
	    Matcher m5 = patrn.matcher(password);
	    return (m5.matches());
	}


}
