package uservalidation;

public class Constants {
	
	public static String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
	public static String lastNameRegex = "[A-Z]{1}[a-z]{2,}";
	public static String emailRegex = "[a-zA-Z]+[a-zA-Z_+.-]*[a-zA-Z]+@[a-zA-Z]+[.][a-zA-z]{2}";
	public static String phoneNumberRegex = "[0-9]{2}[\\s][0-9]{10}";
	public static String passwordRegex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}";
	public static String inputEmpty = "Input should not be EMPTY";
	public static String inputNull = "Input should not be NULL";
	public static String inputInvalid = "Invalid Input";
	public static String inputValid = "Valid Input";	

}
