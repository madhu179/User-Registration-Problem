package EmailParameterized;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailParaMain {
	
	public boolean validate_email(String email)
	{
		String emailregx = "^[a-zA-Z0-9]+[a-zA-Z0-9+_.-]+[a-zA-Z0-9]+@[a-zA-Z0-9]+[.][a-zA-Z0-9,]+[a-zA-Z0-9,.]+$"; 
	    Pattern patrn = Pattern.compile(emailregx);
	    Matcher m3 = patrn.matcher(email);
	    return (m3.matches());
	}
	

}
