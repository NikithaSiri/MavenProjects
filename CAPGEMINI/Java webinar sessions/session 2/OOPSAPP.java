// class Creator

class Company
{
	Employee emp;
	void print()
	{
		System.out.println("Welcome All to Capgemeini");
	}
	
	void printEmployeeDet()
	{
		//emp=new Employee();
		emp=new PermEmployee();
		emp.printDetails();
		emp=new ContractEmployee();
		emp.printDetails();
	}
	
}

abstract class Employee
{
private int eid;

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

void assignTask(Employee emp)
{
	
	emp.work();
}
public void work()
{
	
	System.out.println("All Employeed do Work");
}

private String name,email,phone;
private int salary ;

/*public void storeData(int empid,String empname,int esalary)
{
	
	eid=empid;
	name=empname;
	salary=esalary;
}*/



void printDetails()
{
	
	System.out.println(eid);
	System.out.println(name);
	
	System.out.println(salary);
	
}

}


class PermEmployee extends Employee
{
	
	void proabtionPeriod(int nom)
	{
		System.out.println("Ur Probation period is:"+nom);
	}
	
	public void work()
	{
		System.out.println("Iam doing permament work");
	}
}


class ContractEmployee extends Employee
{
	void termInMonths(int months)
	{
		
		System.out.println("Ur contract term is:"+months);
	}
	
public	void work()
	{
		System.out.println("Iam doing conract work");
	}
}





// User
public class OOPSAPP {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		/*Employee obj=new Employee();
//		obj.storeData(200,"aaa", 10000);
		obj.setEid(100);
		obj.setName("jjj");
		obj.setSalary(10000);
		
		System.out.println(obj.getName());
		
		//obj.printDetails(1000);
*/	
		
	//	ContractEmployee cobj=new ContractEmployee();
		/*cobj.setEid(100);
		cobj.setName("Akash");
		cobj.setSalary(1000);
		cobj.printDetails();
		cobj.termInMonths(7);
		*/
		/*cobj.work();
		PermEmployee p=new PermEmployee();
		p.work();
	*/
		
		Employee emp = null;
		
		
		emp.assignTask(new PermEmployee());
		
		
		/*emp=new ContractEmployee();
		emp.work();*/
		
/*Company obj=new Company();
obj.print();
obj.printEmployeeDet();*/
	
	}

}
