package identifiers;

class Student{
	String name;
	int phoneNumber;
	String mailId;
	
}
public class ObjectIdentifier {

	public static void main(String[] args) {
		Student s1=new Student();
	s1.name="Madhu";
	s1.phoneNumber=123;
	s1.mailId="sirinethrasandy@gmail.com";

	System.out.println(s1.name);
	System.out.println(s1.phoneNumber);
	System.out.println(s1.mailId); 
	Student s2= new Student();
	s1.name="siri";
	s1.phoneNumber=456;
	s1.mailId="nethrasandy@gmail.com";

	System.out.println(s1.name);
	System.out.println(s1.phoneNumber);
	System.out.println(s1.mailId);
	
	}
}

