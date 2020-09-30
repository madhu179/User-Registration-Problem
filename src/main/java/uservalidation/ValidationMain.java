package uservalidation;
import java.util.regex.*;

@FunctionalInterface
interface LambdaInterface
{
	String validate(String input,String regex) throws UserValidationException;
}

public class ValidationMain {
	
	LambdaInterface lambdaFunction = (value,regx) -> {
	try {	
	if(value.length()==0)
		throw new UserValidationException(Constants.inputEmpty);
	
	Pattern patrn = Pattern.compile(regx);
    Matcher m1 = patrn.matcher(value);
    if(m1.matches())
    	return Constants.inputValid;
    else
    	throw new UserValidationException(Constants.inputInvalid);    
	}catch(NullPointerException e)
	{
		throw new UserValidationException(Constants.inputNull);
	}   
};
	
	public String validate_fname(String fname) throws UserValidationException
	{
		return lambdaFunction.validate(fname,Constants.firstNameRegex);	
	}
	
	
	public String validate_lname(String lname) throws UserValidationException
	{
		return lambdaFunction.validate(lname,Constants.lastNameRegex);	
	}
	
	
	public String validate_email(String email) throws UserValidationException
	{
		return lambdaFunction.validate(email,Constants.emailRegex);
	}
	
	
	public String validate_phno(String phno) throws UserValidationException
	{
		return lambdaFunction.validate(phno,Constants.phoneNumberRegex);
	}
	
	
	public String validate_password(String password) throws UserValidationException
	{
		return lambdaFunction.validate(password,Constants.passwordRegex);
	}


}
