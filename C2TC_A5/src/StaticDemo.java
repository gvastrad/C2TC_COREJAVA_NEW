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
	}
}
public class StaticDemo {

	public static void main(String[] args) 
	{
		//Student s1=new Student(1,"Shashank");
		Student s2=new Student();	
		s2.id=2;
		s2.name="Samruddhi";
		Student.collegeName="MSRIT";
		//System.out.println(s1);
	Student.m1();
		System.out.println(s2);

	}

}
