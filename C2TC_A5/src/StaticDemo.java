class Student{
	int id;
	String name;
	static String collegeName="DBIT";
	
	public Student()
	{
		
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ",collegename=" + collegeName + "]";
	}	
	static void m1()
	{
		int a=12;
		System.out.println(a);
		System.out.println(collegeName);
		//Not static members can't be accessed in static method
		//System.out.println(id);
		//Local variables can't be static
		//static b=22;
		
	}
}
public class StaticDemo {

	public static void main(String[] args) 
	{//Assigning data with constructors
		Student s1=new Student(1,"Shashank");
		Student s2=new Student();	
		//Assigning data with object reference
		s2.id=2;
		s2.name="Samruddhi";
		Student.collegeName="MSRIT";
		System.out.println(s1);
	    Student.m1();
		System.out.println(s2);

	}

}
