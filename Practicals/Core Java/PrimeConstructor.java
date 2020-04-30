import java.io.*;
class PrimeConstructor
{
	int n, f;
	PrimeConstructor(int x)
	{
		n=x;
		f=0;
	}
	void calc()
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				f++;
		}
		if(f==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number : ");
		int p=Integer.parseInt(br.readLine());
		PrimeConstructor ob=new PrimeConstructor(p);
		ob.calc();
	}
}