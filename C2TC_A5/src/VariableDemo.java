class Employee
{
	//Class/Instance variable
	int eid;
	String ename;
	float salary;
	int age=21;
	
	void getEmployeeDetails()
	{
		
		System.out.println("Employee details: ");
		System.out.println(eid+" "+ename+" "+salary+age);
	}
	
	void setEmployeeDetails(int id, String name,float salary)
	{
		this.eid=id;
		this.ename=name;
		this.salary=salary;
		this.age=22;
		int phoneno=3678900;
		System.out.println(phoneno);
	}
}
public class VariableDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setEmployeeDetails(101, "Sangeetha",34560.0f);
		emp1.getEmployeeDetails();
	}

}
