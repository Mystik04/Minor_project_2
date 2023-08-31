import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of employees: ");
		int num=sc.nextInt();
		Employee e1[]=empdatabase(num);
		System.out.println("sorting the data according to salary.");
		arrangeEmployeeBySalary(e1);
		System.out.println("\nsorting done.");
		System.out.println("\nTo search for employee by job position enter the position: ");
		String pos=sc.next();
		getEmployeesByJobPosition(e1,pos);
		System.out.println("\nTo search for employee between 2 date to joining enter the dates:");
		System.out.println("Enter Date 1:");
		int d1=sc.nextInt();
        int m1=sc.nextInt();
        int y1=sc.nextInt();
        Date dt1=new Date(d1, m1, y1);
        System.out.print("Enter Date 2:");
        int d2=sc.nextInt();
        int m2=sc.nextInt();
        int y2=sc.nextInt();
        Date dt2=new Date(d2, m2, y2);
        getEmployeesByHireDate(e1,dt1,dt2);
        System.out.println("\nTotal number of foreign employees are:");
        foreignEmployeeCount(e1);
        System.out.println("\nTo search for employees between a range of salary enter the salaries:");
        System.out.println("Enter starting salary:");
        double s1=sc.nextDouble();
        System.out.println("Enter final salary:");
        double s2=sc.nextDouble();
        getEmployeesBySalary(e1,s1,s2);
	}
	public static Employee[] empdatabase(int n) {
		Scanner inp=new Scanner(System.in);
		Employee[] empdata=new Employee[n];
		for (int i=0;i<n;i++) {
			System.out.println("Employee: "+(i+1));
			
			System.out.println("Enter name: ");
			String name=inp.next();
			
			System.out.println("Enter employee ID: ");
			int eid=inp.nextInt();
			System.out.println("Enter Salary: ");
			double salary=inp.nextDouble();
			
			System.out.println("Enter hire date(dd/mm/yyyy): ");
			int day=inp.nextInt();
			int month=inp.nextInt();
			int year=inp.nextInt();
			Date hdate=new Date(day,month,year);
			
			System.out.println("Enter Job Position: ");
			String jobpos=inp.next();
			
			System.out.println("Enter contact number:");
			String number=inp.next();
			
			System.out.println("Enter Address: ");
			String houseno=inp.next();
			String street = inp.next();
	        String city = inp.next();
	        String state = inp.next();
	        String pincode = inp.next();
	        Address Address1=new Address(houseno,street,city,state,pincode);
	        
	        empdata[i]=new Employee(name,eid,salary,hdate,jobpos,number,Address1);
		}
		return empdata;
	}
	public static void arrangeEmployeeBySalary(Employee e[]) {
		for (int i=0 ; i<e.length ; i++) {
            for (int j=0 ; j<e.length ; j++) {
                if (e[j].getSalary() < e[i].getSalary()) {
                    Employee abc = e[i];
                    e[i] = e[j];
                    e[j] = abc;
                }
            }
        }		
	}
	public static void getEmployeesByJobPosition(Employee e[], String xy) {
		System.out.println("the following employees are "+xy+": ");
		for(int i=0;i<e.length;i++) {
			if(e[i].getJpos()==xy) {
				System.out.println((i+1)+": ");
				System.out.println(e[i].getEmpdata());
			}
		}
	}
	public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2){
		System.out.println("the following employees were hired between "+d1.getDate()+" & "+d2.getDate()+": ");
		for(int i=0;i<e.length;i++) {
			if((e[i].hiredate.day>=d1.day&&e[i].hiredate.month>=d1.month&&e[i].hiredate.year>=d1.year) &&
				(e[i].hiredate.day<=d2.day&&e[i].hiredate.month<=d2.month&&e[i].hiredate.year<=d2.year)) {
				System.out.println(e[i].getEmpdata());
			}
		}
	}
	public static int foreignEmployeeCount(Employee e[]) {
		int ctr=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].getNumber().charAt(0)!=9 && e[i].getNumber().charAt(1)!=1) {
				ctr++;
			}
		}
		return ctr;
	}
	public static void getEmployeesBySalary(Employee e[], double s1, double s2) {
		System.out.println("details of employees are: ");
		for(int i=0;i<e.length;i++) {
			if(e[i].getSalary()>s1 && e[i].getSalary()<s2) {
				System.out.println(e[i].getEmpdata());
			}
		}
	}
}
