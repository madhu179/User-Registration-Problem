package uservalidation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidationTest {
	ValidationMain vd = new ValidationMain();
	String msg;
	
	@Test 
	public void validate_fname_When_Given_valid_fname() {  
		try {
			msg = vd.validate_fname("Tom");
		} catch (FirstNameException e) {
			e.printStackTrace();
		}
        assertEquals("Valid Input",msg);
    }
	
	@Test 
	public void validate_fname_When_given_invalid_fname() {  
		try {
			msg = vd.validate_fname("tom");
		} catch (FirstNameException e) {
			assertEquals("Invalid FirstName",e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_fname_When_given_NULL_fname() {  
		try {
			msg = vd.validate_fname(null);
		} catch (FirstNameException e) {
			assertEquals("FirstName should not be NULL",e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_fname_When_given_EMPTY_fname() {  
		try {
			msg = vd.validate_fname("");
		} catch (FirstNameException e) {
			assertEquals("FirstName should not be EMPTY",e.getMessage());
		}
        
    }
	
	
	@Test 
	public void validate_lname_When_Given_valid_lname() {  
		try {
			msg = vd.validate_lname("Hanks");
		} catch (LastNameException e) {
			e.printStackTrace();
		}
        assertEquals("Valid Input",msg);
    }
	
	@Test 
	public void validate_lname_When_given_invalid_lname() {  
		try {
			msg = vd.validate_lname("hanks");
		} catch (LastNameException e) {
			assertEquals("Invalid LastName",e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_lname_When_given_NULL_lname() {  
		try {
			msg = vd.validate_lname(null);
		} catch (LastNameException e) {
			assertEquals("LastName should not be NULL",e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_lname_When_given_EMPTY_lname() {  
		try {
			msg = vd.validate_lname("");
		} catch (LastNameException e) {
			assertEquals("LastName should not be EMPTY",e.getMessage());
		}
        
    }
	
	
	@Test 
	public void validate_email_When_Given_valid_email() {  
		try {
			msg = vd.validate_email("Tom.Hanks@gmail.co");
		} catch (EmailException e) {
			e.printStackTrace();
		}
        assertEquals("Valid Input",msg);
    }
	
	@Test 
	public void validate_email_When_given_invalid_email() {  
		try {
			msg = vd.validate_email("Tom.Hanks@Gmail");
		} catch (EmailException e) {
			assertEquals("Invalid Email",e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_email_When_given_NULL_email() {  
		try {
			msg = vd.validate_email(null);
		} catch (EmailException e) {
			assertEquals("Email should not be NULL",e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_email_When_given_EMPTY_email() {  
		try {
			msg = vd.validate_email("");
		} catch (EmailException e) {
			assertEquals("Email should not be EMPTY",e.getMessage());
		}
        
    }
	
	
	@Test 
	public void validate_phno_When_Given_valid_phno() {  
		try {
			msg = vd.validate_phno("91 9876543210");
		} catch (PhoneNumberException e) {
			e.printStackTrace();
		}
        assertEquals("Valid Input",msg);
    }
	
	@Test 
	public void validate_phno_When_given_invalid_phno() {  
		try {
			msg = vd.validate_phno("9876543210");
		} catch (PhoneNumberException e) {
			assertEquals("Invalid Phone Number",e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_phno_When_given_NULL_phno() {  
		try {
			msg = vd.validate_phno(null);
		} catch (PhoneNumberException e) {
			assertEquals("Phone Number should not be NULL",e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_phno_When_given_EMPTY_phno() {  
		try {
			msg = vd.validate_phno("");
		} catch (PhoneNumberException e) {
			assertEquals("Phone Number should not be EMPTY",e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_password_When_Given_valid_password() {  
		try {
			msg = vd.validate_password("TomHanks@1962");
		} catch (PasswordException e) {
			e.printStackTrace();
		}
        assertEquals("Valid Input",msg);
    }
	
	@Test 
	public void validate_password_When_given_invalid_password() {  
		try {
			msg = vd.validate_password("tomhanks1962");
		} catch (PasswordException e) {
			assertEquals("Invalid Password",e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_password_When_given_NULL_password() {  
		try {
			msg = vd.validate_password(null);
		} catch (PasswordException e) {
			assertEquals("Password should not be NULL",e.getMessage());
		}
        
    }
	
	@Test
	public void validate_password_When_given_EMPTY_password() {  
		try {
			msg = vd.validate_password("");
		} catch (PasswordException e) {
			assertEquals("Password should not be EMPTY",e.getMessage());
		}
        
    }
	
}
