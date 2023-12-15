package Ass2;
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		int ch;
		Scanner input = new Scanner (System.in);
		
		do
		{
			//Display MENU.
			System.out.println("\nSelect operation to be done: ");
			System.out.println("1.Display total sale of Publication.\n2.Find out how many copies of Book are ordered.\n3.Find out required issue of Magazine.\n4.Exit");
			ch = input.nextInt();
			
			switch (ch)
			{
			case 1: Publication p1 = new Publication();
					p1.setData("TechNeo",450.00,250);
					p1.display();
					p1.saleCopy();
					break;
			case 2: Book b1 = new Book();
					b1.setData("Introduction to OOP",650.50,345,"Ramesh Shukla");
					b1.display();
					b1.orderCopies();
					break;
			case 3: Magazine m1 = new Magazine();
					m1.setData("Coding Hub",150.00,25);
					m1.receiveIssue();
					m1.display();
					break;
			case 4: System.out.println("You have successfully exited.");
			        break;
			default: System.out.println("Enter appropriate choice.");
			}
		}while (ch!=4);
	}
}

//-----Publication Class-----
class Publication
{
	//Instance variables common for Book and Magazine.
	String title;
	double price;
	int copies; //Copies available in stock.

	Scanner input = new Scanner(System.in);
	
	Publication()
	{
		title = " ";
		price=0;
		copies=0;
	}
	public void setData(String t,double p,int c)
	{
		title=t;
		price=p;
		copies=c;
	}
	public void display()
	{
		System.out.println("Publication details: ");
		System.out.println("Title: "+title+"\nPrice: "+price+"\nCopies: "+copies);
	}
	
	//Method common for Book and Magazine.
	public void saleCopy()
	{
		System.out.println("Enter number of copies required: ");
		int sold = input.nextInt();
		System.out.println("Total sale is Rs. "+sold*price);
	}
}

//-----Book Class (Sub-class)-----
class Book extends Publication
{
	//Instance variables unique to Book.
	private String author;
	
	public void setData(String t,double p,int c,String auth) //Overloading
	{
		super.setData(t, p, c);
		author=auth;
	}
	public void display() //Overrides Publication.display()
	{
		System.out.println("Book details: ");
		System.out.println("Title: "+title+"\nPrice: "+price+"\nCopies: "+copies+"\nAuthor: "+author);
	}
	
	//Method unique to Book.
	public void orderCopies()
	{
		System.out.println("Enter the number of copies of books ordered: ");
		int order=input.nextInt();
		System.out.println("The number of copies of books ordered is "+order);
	}
}

//-----Magazine Class (Sub-class)-----
class Magazine extends Publication
{	
	private int current_issue=2023;
	
	public void setData(String t,double p,int c) //Overriding
	{
		super.setData(t,p,c);
	}
	
	//Methods unique to Magazine.
	public void orderQty()
	{
		System.out.println("Enter the quantity of magazines ordered: ");
		int qty = input.nextInt();
		System.out.println("The quanity of magazines ordered is "+qty);
	}
	public void currentIssue(int year)
	{
		current_issue=year;
		System.out.println("Current issue available is: "+current_issue);
	}
	public void receiveIssue()
	{
		System.out.println("Enter the issue of magazine to be ordered: ");
		int rec = input.nextInt();
		System.out.println("The required issue is "+rec+".");
	}
	
	public void display() //Overrides Publication.display()
	{
		System.out.println("\nMagazine details: ");
		System.out.println("Title: "+title+"\nPrice: "+price+"\nCopies: "+copies+"\nCurrent Issue: "+current_issue);
	}
}