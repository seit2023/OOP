package Ass3;
import java.util.*;
public class MainClass3{
	
	public static void main(String[] args) {
		int ch;
		Scanner input = new Scanner(System.in);
		
		do
		{
		    //Display MENU.
			System.out.println("\nSelect the employee whose payment slip you want: ");
			System.out.println("11.Programmer\n2.Team Lead\n3.Assistant Project Manager\n4.Project Manager\n5.Exit");
		    ch = input.nextInt();
		    
		    switch (ch)
		    {
		    case 1: Programmer p1 = new Programmer();
		    		p1.setData("Akash",650,"Nashik","srj@gmail.com",1122334455);
		    		p1.calculateSal();
		    		break;
		    case 2: TeamLead t1 = new TeamLead();
					t1.setData("Rajesh",987, "Pune","rjt@gmail.com",1122446677);
					t1.calculateSal();
					break;
		    case 3: AsstProjectManager a1 = new AsstProjectManager();
		    		a1.setData("Krishna",420,"San Francisco","kmalode@gmail.com",1334455221);
		            a1.calculateSal();
		            break;
		    case 4: ProjectManager pm1 = new ProjectManager();
		            pm1.setData("Shivjeet", 69, "Nashik","spider@gmail.com",1234567890);
		            pm1.calculateSal();
		            break;
		    case 5: System.out.println("You have successfully exited.");
		            break;
		    default: System.out.println("Enter appropriate choice.");
		    }
		}while (ch!=5);
	}
}

//-----Employee Class-----
class Employee
{
	String emp_name;
    int emp_id;
    String address, mail_id;
	long mobile_no;
	
	public void setData(String name,int e_id,String add,String mail,long mob)
	{
		emp_name=name;
		address=add;
		mail_id=mail;
		emp_id=e_id;
		mobile_no=mob;
	}
	public void display()
	{
		System.out.println("Name: "+emp_name+"\nID: "+emp_id+"\nAddress: "+address+"\nEmail ID: "+mail_id+"\nMobile No: "+mobile_no);
	}
	
	Scanner input = new Scanner(System.in);
}

//-----Programmer Class
class Programmer extends Employee
{
	double BP; //Basic Pay
	double gross_sal; //Gross Salary
	double net_sal; //Net Salary
	
	public void setData(String name,int e_id,String add,String mail,long mob)
	{
		super.setData(name,e_id,add,mail,mob);
		System.out.println("Enter the basic pay of Programmer: ");
		double basic=input.nextDouble();
		BP=basic;
	}
	
	public void calculateSal()
	{
		double DA = 0.97*BP; //Dearness Allowance
		double HRA = 0.10*BP; //House Rent Allowance
		
		gross_sal=BP+DA+HRA;

		double PF = 0.12*BP; //Provident Fund
		double SCF = 0.001*BP; //Staff Club Fund
		
		net_sal=gross_sal-PF-SCF;
		
		System.out.println("Programmer details are: ");
		super.display();
		System.out.println("\nThe gross salary of the Programmer is Rs. "+gross_sal);
		System.out.println("The net salary of the Programmer is Rs. "+net_sal);
	}
}

//-----Team Lead Class-----
class TeamLead extends Employee
{
	double BP; //Basic Pay
	double gross_sal; //Gross Salary
	double net_sal; //Net Salary
	
	public void setData(String name,int e_id,String add,String mail,long mob)
	{
		super.setData(name, e_id, add, mail, mob);
		System.out.println("Enter the basic pay of Team Lead: ");
		double basic=input.nextDouble();
		BP=basic;
	}
	
	public void calculateSal()
	{
		double DA = 0.97*BP; //Dearness Allowance
		double HRA = 0.10*BP; //House Rent Allowance
		
		gross_sal=BP+DA+HRA;

		double PF = 0.12*BP; //Provident Fund
		double SCF = 0.001*BP; //Staff Club Fund
		
		net_sal=gross_sal-PF-SCF;
		
		System.out.println("Team Lead details are: ");
		super.display();
		System.out.println("\nThe gross salary of the Team Lead is Rs. "+gross_sal);
		System.out.println("The net salary of the Team Lead is Rs. "+net_sal);
	}
}

//-----Assistant Project Manager Class-----
class AsstProjectManager extends Employee
{
	double BP; //Basic Pay
	double gross_sal; //Gross Salary
	double net_sal; //Net Salary
	
	public void setData(String name,int e_id,String add,String mail,long mob)
	{
		super.setData(name, e_id, add, mail, mob);
		System.out.println("Enter the basic pay of Assistant Project Manager: ");
		double basic=input.nextDouble();
		BP=basic;
	}
	
	public void calculateSal()
	{
		double DA = 0.97*BP; //Dearness Allowance
		double HRA = 0.10*BP; //House Rent Allowance
		
		gross_sal=BP+DA+HRA;

		double PF = 0.12*BP; //Provident Fund
		double SCF = 0.001*BP; //Staff Club Fund
		
		net_sal=gross_sal-PF-SCF;
		
		System.out.println("Assistant Project Manager details are: ");
		super.display();
		System.out.println("\nThe gross salary of the Assistant Project Manager is Rs. "+gross_sal);
		System.out.println("The net salary of the Assistant Project Manager is Rs. "+net_sal);
	}
}

//-----Project Manager Class-----
class ProjectManager extends Employee
{
	double BP; //Basic Pay
	double gross_sal; //Gross Salary
	double net_sal; //Net Salary
	
	public void setData(String name,int e_id,String add,String mail,long mob)
	{
		super.setData(name, e_id, add, mail, mob);
		System.out.println("Enter the basic pay of Project Manager: ");
		double basic=input.nextDouble();
		BP=basic;
	}
	
	public void calculateSal()
	{
		double DA = 0.97*BP; //Dearness Allowance
		double HRA = 0.10*BP; //House Rent Allowance
		
		gross_sal=BP+DA+HRA;

		double PF = 0.12*BP; //Provident Fund
		double SCF = 0.001*BP; //Staff Club Fund
		
		net_sal=gross_sal-PF-SCF;
		
		System.out.println("Project Manager details are: ");
		super.display();
		System.out.println("\nThe gross salary of the Project Manager is Rs. "+gross_sal);
		System.out.println("The net salary of the Project Manager is Rs. "+net_sal);
	}
}