import java.util.*;
class Entry
{
	int a,b;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
}
class Addition extends Entry
{
	int c;
	void add()
	{
		super.input();
		c=a+b;
		System.out.println("Sum of "+a+" and "+b+" = "+c);
	}
}
class AddUsingInheritance
{
	public static void main(String[] args) 
	{
		Addition ob=new Addition();
		ob.add();
	}
}
