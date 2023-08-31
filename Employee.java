public class Employee {
	String name,jobposition,contactnumber;
	int empid;
	double salary;
	Date hiredate;
	Address address;
	Employee(String name,int empid,double salary,Date hiredate,String jobposition,String contactnumber,Address address)
	{
		this.name=name;
		this.empid=empid;
		this.salary=salary;
		this.hiredate=hiredate;
		this.jobposition=jobposition;
		this.contactnumber=contactnumber;
		this.address=address;
	}
	
	public String getEmpdata() {
		return("Name : "+name+"\nEmployee Id : "+empid+"\nSalary : "+salary+"\nHire Date : "+hiredate.getDate()+
			"\nJob Position : "+jobposition+"\nContact Number : "+contactnumber+"\nAddress : "+address.getAddress());
	}
	public double getSalary() {
	     return salary;
	}
	public int getEmpid() {
		return empid;
	}
	public Address getAddress() {
		return address;
	}
	public Date getDate() {
		return hiredate;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return contactnumber;
	}
	public String getJpos() {
		return jobposition;
	}

}
