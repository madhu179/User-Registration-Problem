package EmailParameterized;

import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmailParaTest {
   private String email;
   private Boolean expecRes;
   private EmailParaMain emailparamain;

   @Before
   public void initialize() {
	   emailparamain = new EmailParaMain();
   }

   public EmailParaTest(String email, Boolean expecRes) {
      this.email = email;
      this.expecRes = expecRes;
   }

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         {"abc@yahoo.com,", true },
         {"abc-100@yahoo.com,",true},
         {"abc-100@yahoo.com,",true},
         {"abc.100@yahoo.com",true},
         {"abc111@abc.com,",true},
         { "abc-100@abc.net,",true},
         {"abc.100@abc.com.au",true},
         {"abc@1.com,",true},
         {"abc@gmail.com.com",true},
         {"abc+100@gmail.com",true},
         {"abc",false},
         {"abc@.com.my",false},
         {"abc123@gmail.a",false},
         {"abc123@.com",false},
         {"abc123@.com.com",false},
         {".abc@abc.com",false},
         {"abc()*@gmail.com",false},
         {"abc@%*.com",false},
         {"abc..2002@gmail.com",false},
         {"abc.@gmail.com",false},
         {"abc@abc@gmail.com",false},
         {"abc@gmail.com.1a",false},
         {"abc@gmail.com.aa.au",false}
      });
   }

   @Test
   public void testEmailParameterized() {
      System.out.println("The Email is : " + email);
      assertEquals(expecRes,emailparamain.validate_email(email));
   }
}
