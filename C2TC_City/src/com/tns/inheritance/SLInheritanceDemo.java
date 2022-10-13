package com.tns.inheritance;

class Citizen{
	String name;
	String adharno;
	String adderess;
	int phno;
	public Citizen()
	{
		
	}
	public Citizen(String name, String aadharno, String adderess, int phno) {	
		this.name = name;
		this.adharno = aadharno;
		this.adderess = adderess;
		this.phno = phno;
	}
}

class Student extends Citizen{
	
	int sid;
	String college_name;
	
	public Student()
	{
		super();
	}
	
	public Student(String name, String aadharno, String adderess, int phno,int sid,String collegename) {
		super(name, aadharno, adderess, phno);
		this.sid=sid;
		this.college_name=collegename;
	}

	@Override
	public String toString() {
		return " [sid=" + sid + ", college_name=" + college_name + ", name=" + name + ", adharno=" + adharno
				+ ", adderess=" + adderess + ", phno=" + phno + "]";
	}	
}
public class SLInheritanceDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Shana";
		s1.adderess="Banagalore";
		s1.adharno="afadg";
		s1.college_name="City";
		s1.phno=3535;
		s1.sid=90;
		
		Student s2=new Student("Gayatri","fdjkha","Bangalore",356473,101,"TNSIF");
        System.out.println("Student 1"+s1);
        System.out.println("Student 2"+s2);
	}

}
