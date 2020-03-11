package encapsulation;

public class UserData
{
	private String name;
	private String email;
	private String phone;
	public String empid="12354";
	
	public void set_name(String new_name)
	{
		name=new_name;
	}
	
	public void set_email(String new_email)
	{
		email=new_email;
	}
	 
	public void set_phone(String new_phn)
	{
		phone=new_phn;
	}
	
	public String get_name()
	{
		return name;
	}
	 public String get_email()
	 {
		 return email;
	 }
	 
	 public String get_phone()
	 {
		 return phone;
	 }
	  
}
