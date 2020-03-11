package variables;


public class string_methods {

	public static void main(String[] args) 
	{
			//string method........
					String name = "mindq";
					String place="dilsukhnagar";
					System.out.println(name+"        "+place);
			
			
			//equals method....
					String act_value="namratha";
					String exp_value="Namratha";
					boolean flag=act_value.equals(exp_value);
					System.out.println("the result value is-->"  +flag);
			
			//equals ignore cases........
					String act_value1="namratha";
					String exp_value2="NAMRATHA";
					boolean flag1=act_value1.equalsIgnoreCase(exp_value2);
					System.out.println("the result value is--->"  +flag1);
					
			//contains method............
					String value="hundered 100 onoin";
					boolean flag2= value.contains("onoin");
					System.out.println("the value contains---->"  +flag2);
					
			//substring method........
					String lenth="123224985321456";
					String mid_value=lenth.substring(4,8);
					System.out.println("mid value of the string is--->"  +mid_value);
					String begin=lenth.substring(9);
					System.out.println("from where begin value--->"  +begin);
					
			//length method...
					String num="123456789";
					int len=num.length();
					System.out.println("the length of the string is--->"  +len);
					
			//trim method...
					String tool="      adnsjdf         ";
					int before= tool.length();
					System.out.println("the length of string before trim--->" +before);
					String after=tool.trim();  
					int after1=after.length();
					System.out.println("the lenth of string after--->"  +after1);
					
			//is empty method.......
					String abc="adhjd";
					String kj="";
					System.out.println("the string is empty-->"  +abc.isEmpty());
					System.out.println("the sting is empty or not--->"  +kj.isEmpty());
					
			//lower to upper method.....
					String lower="djhfuihf";
				    System.out.println("lower to upper-->"  +lower.toUpperCase());
				    
		    //upper to lower method.....
				    String upper="JDHSRF";
				    System.out.println("upper to lower-->"  +upper.toLowerCase());
				    
		    //string name method............
				    String bank="hdfc";
				    char charc=bank.charAt(1);
				    System.out.println("the char at the index is ---->"  +charc);
				    
			//split method.......
				    String email="nahd@hfife.fsohf@fsir.ef";
				    String[] arr=email.split("@");
				    System.out.println(arr[0]+"    "+arr[1]+"     "+arr[2]);
					
					
			//reversing a string
				    String pname="namratha";
				    char arry[]=pname.toCharArray();
				    for (int i=pname.length()-1; i >=0; i--)
				    {
						System.out.println(arry[i]);
					}
				    
				    String Inst_name="MINDQ";
					 char rev[]=Inst_name.toCharArray();
					 for (int i = Inst_name.length()-1; i >= 0; i--) 
					 {
						System.out.print(rev[i]);
					 }
					 
					 
					 String rad="hdscuih";
					 char rad1[]=rad.toCharArray();
					 for (int i =rad.length()-1; i>=0 ; i--)
					 {
						System.out.println(rad1[i]);
						
					}
					

	}

}
