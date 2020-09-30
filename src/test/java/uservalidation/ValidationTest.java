package uservalidation;

import static org.junit.Assert.*;

import org.junit.Test;


public class ValidationTest {
	String msg;
	ValidationMain v = new ValidationMain();

	
	@Test 
	public void validate_fname_When_Given_valid_fname() {  
		try {
			msg = v.validate_fname("Tom");
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
        assertEquals(Constants.inputValid,msg);
    }
	
	@Test 
	public void validate_fname_When_Given_invalid_fname() {  
		try {
			msg = v.validate_fname("tom");
		} catch (UserValidationException e) {
			assertEquals(Constants.inputInvalid,e.getMessage());
		}
        
    }

	
	@Test 
	public void validate_fname_When_given_NULL_fname() {  
		try {
			msg = v.validate_fname(null);
		} catch (UserValidationException e) {
			assertEquals(Constants.inputNull,e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_fname_When_given_EMPTY_fname() {  
		try {
			msg = v.validate_fname("");
		} catch (UserValidationException e) {
			assertEquals(Constants.inputEmpty,e.getMessage());
		}
        
    }
	
	
	@Test 
	public void validate_lname_When_Given_valid_lname() {  
		try {
			msg = v.validate_lname("Hanks");
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
        assertEquals(Constants.inputValid,msg);
    }
	
	@Test 
	public void validate_lname_When_given_invalid_lname() {  
		try {
			msg = v.validate_lname("hanks");
		} catch (UserValidationException e) {
			assertEquals(Constants.inputInvalid,e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_lname_When_given_NULL_lname() {  
		try {
			msg = v.validate_lname(null);
		} catch (UserValidationException e) {
			assertEquals(Constants.inputNull,e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_lname_When_given_EMPTY_lname() {  
		try {
			msg = v.validate_lname("");
		} catch (UserValidationException e) {
			assertEquals(Constants.inputEmpty,e.getMessage());
		}
        
    }
	
	
	@Test 
	public void validate_email_When_Given_valid_email() {  
		try {
			msg = v.validate_email("Tom.Hanks@gmail.co");
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
        assertEquals(Constants.inputValid,msg);
    }
	
	@Test 
	public void validate_email_When_given_invalid_email() {  
		try {
			msg = v.validate_email("Tom.Hanks@Gmail");
		} catch (UserValidationException e) {
			assertEquals(Constants.inputInvalid,e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_email_When_given_NULL_email() {  
		try {
			msg = v.validate_email(null);
		} catch (UserValidationException e) {
			assertEquals(Constants.inputNull,e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_email_When_given_EMPTY_email() {  
		try {
			msg = v.validate_email("");
		} catch (UserValidationException e) {
			assertEquals(Constants.inputEmpty,e.getMessage());
		}
        
    }
	
	
	@Test 
	public void validate_phno_When_Given_valid_phno() {  
		try {
			msg = v.validate_phno("91 9876543210");
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
        assertEquals(Constants.inputValid,msg);
    }
	
	@Test 
	public void validate_phno_When_given_invalid_phno() {  
		try {
			msg = v.validate_phno("9876543210");
		} catch (UserValidationException e) {
			assertEquals(Constants.inputInvalid,e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_phno_When_given_NULL_phno() {  
		try {
			msg = v.validate_phno(null);
		} catch (UserValidationException e) {
			assertEquals(Constants.inputNull,e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_phno_When_given_EMPTY_phno() {  
		try {
			msg = v.validate_phno("");
		} catch (UserValidationException e) {
			assertEquals(Constants.inputEmpty,e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_password_When_Given_valid_password() {  
		try {
			msg = v.validate_password("TomHanks@1962");
		} catch (UserValidationException e) {
			e.printStackTrace();
		}
        assertEquals(Constants.inputValid,msg);
    }
	
	@Test 
	public void validate_password_When_given_invalid_password() {  
		try {
			msg = v.validate_password("tomhanks1962");
		} catch (UserValidationException e) {
			assertEquals(Constants.inputInvalid,e.getMessage());
		}
        
    }
	
	@Test 
	public void validate_password_When_given_NULL_password() {  
		try {
			msg = v.validate_password(null);
		} catch (UserValidationException e) {
			assertEquals(Constants.inputNull,e.getMessage());
		}
        
    }
	
	@Test
	public void validate_password_When_given_EMPTY_password() {  
		try {
			msg = v.validate_password("");
		} catch (UserValidationException e) {
			assertEquals(Constants.inputEmpty,e.getMessage());
		}
        
    }
	
}
