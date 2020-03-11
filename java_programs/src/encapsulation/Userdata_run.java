package encapsulation;

public class Userdata_run {

	public static void main(String[] args) 
	{
		UserData obj=new UserData();
		obj.empid="54532";
		System.out.println("the empid changed to-->" +obj.empid);
		
		obj.set_email("hgfjsjhfu@hfurhf.com");
		obj.set_name("jhgfysgrf");
		obj.set_phone("354654321");
		
		String name = obj.get_name();
		System.out.println("name is-->" +name);
		
		String email=obj.get_email();
		System.out.println("email is-->" +email);
		
		String phone =obj.get_phone();
		System.out.println("phone number is-->" +phone);
	}

}
