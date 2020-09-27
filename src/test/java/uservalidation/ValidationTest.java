package uservalidation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidationTest {
	ValidationMain vd = new ValidationMain();
	@Test 
	public void validate_all_users_details_HAPPY_case() {
        
        assertTrue(vd.validate_all_details("Tom","Hanks","Tom.Hanks@gmail.co","91 9876543210","TomHanks@1962"));
    }
	
	@Test 
	public void validate_all_users_details_SAD_case() {
       
        assertFalse(vd.validate_all_details("tom","Hanks","Tom.Hanks@Gmail","9876543210","TomHanks1962"));
    }
	
	@Test 
	public void validate_fname_HAPPY_case() {  
        assertTrue(vd.validate_fname("Tom"));
    }
	
	@Test 
	public void validate_fname_SAD_case() {  
        assertFalse(vd.validate_fname("tom"));
    }
	
	@Test 
	public void validate_lname_HAPPY_case() {  
        assertTrue(vd.validate_lname("Hanks"));
    }
	
	@Test 
	public void validate_lname_SAD_case() {  
        assertFalse(vd.validate_lname("hanks"));
    }
	
	@Test 
	public void validate_email_HAPPY_case() {  
        assertTrue(vd.validate_email("Tom.Hanks@gmail.co"));
    }
	
	@Test 
	public void validate_email_SAD_case() {  
        assertFalse(vd.validate_email("Tom.Hanks@Gmail"));
    }
	
	@Test 
	public void validate_phno_HAPPY_case() {  
        assertTrue(vd.validate_phno("91 9876543210"));
    }
	
	@Test 
	public void validate_phno_SAD_case() {  
        assertFalse(vd.validate_phno("9876543210"));
    }
	
	@Test 
	public void validate_password_HAPPY_case() {  
        assertTrue(vd.validate_password("TomHanks@1962"));
    }
	
	@Test 
	public void validate_password_SAD_case() {  
        assertFalse(vd.validate_password("tomhanks1962"));
    }
}
