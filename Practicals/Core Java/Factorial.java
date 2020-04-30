import java.io.*;
class Factorial 
{
	public static void main(String[] args) throws Exception
	{
		int f=1;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter the number : ");
		int n=Integer.parseInt(br.readLine());
		for(int i=n;i>=1;i--)
			f=f*i;
		System.out.println("Factorial of "+n+" is "+f);
	}
}
