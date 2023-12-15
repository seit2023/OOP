package Ass4;
import java.util.*;
public class MainClass4{
	
	public static void main(String[] args) {
		int ch;
		Scanner input = new Scanner(System.in);
		
		do
		{
			//Display MENU.
			System.out.println("\nSelect the shape you want to access: ");
			System.out.println("1.Triangle\n2.Rectangle\n3.Exit");
			ch = input.nextInt();
			
			switch (ch)
			{
			case 1: Triangle t1 = new Triangle();
					t1.setLength();
					t1.setHeight();
					t1.compute_area();
					break;
			case 2: Rectangle r1 = new Rectangle();
			        r1.setLength();
			        r1.setWidth();
			        r1.compute_area();
			        break;
			case 3: System.out.println("You have successfully exited.");
			        break;
			default: System.out.println("Enter appropriate choice.");
			}
		}while (ch!=3);
	}
}

//-----Shape Class-----
abstract class Shape
{
	Scanner input = new Scanner(System.in);
	
	//Variables
	double length,width;
	
	public void setLength()
	{
		System.out.println("Enter the length: ");
		double len = input.nextDouble();
		length=len;
	}
	public void setWidth()
	{
		System.out.println("Enter the width: ");
		double wid = input.nextDouble();
		width = wid;
	}
	
	abstract public void compute_area();
}

//-----Triangle Class-----
class Triangle extends Shape
{
	double height;
	
	public void setHeight()
	{
		System.out.println("Enter the height: ");
		double ht = input.nextDouble();
		height = ht;
	}
	
	public void compute_area()
	{
		double area = 0.5*length*height;
		System.out.println("The area of the triangle is "+area+" sq. units.");
	}
}

//-----Rectangle Class-----
class Rectangle extends Shape
{
	public void compute_area()
	{
		double area = length*width;
		System.out.println("The area of the triangle is "+area+" sq. units.");
	}
}