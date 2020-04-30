//Program to calculate average of three numbers using constructors
import java.io.*;
class  Average
{
	int num1;
	int num2;
	int num3;
	Average(int n1,int n2, int n3)
	{
		num1=n1;
		num2=n2;
		num3=n3;
	}
	void calculate()
	{
		System.out.println("Average of "+num1+", "+num2+" and "+num3+" is "+((num1+num2+num3)/3));
	}
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the first number : ");
		int a=Integer.parseInt(br.readLine());
		System.out.print("Enter the second number : ");
		int c=Integer.parseInt(br.readLine());
		System.out.print("Enter the third number : ");
		int b=Integer.parseInt(br.readLine());
		Average ob1=new Average(a,b,c);
		Average ob2=new Average(99,11,55);
		ob1.calculate();
		ob2.calculate();
	}
}
