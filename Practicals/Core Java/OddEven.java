//Program to check whether the given number is even or odd using constructor
class  OddEven
{
	int n;
	OddEven(int num)
	{
		n=num;
	}
	void comp()
	{
		if(n%2==0)
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
	}
	public static void main(String[] args) 
	{
		OddEven ob1=new OddEven(8);
		OddEven ob2=new OddEven(9);
		ob1.comp();
		ob2.comp();
	}
}
