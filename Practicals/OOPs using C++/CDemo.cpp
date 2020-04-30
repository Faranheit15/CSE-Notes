#include <iostream.h>
class SumOfDigits
{
	int num,s;
	void getinput()
	{
		cout<<"Enter a number"<<endl;
		cin>>num;
	}
	void Sum()
	{
		int k=num,r;
		s=0;
		while(k>0)
		{
			r=k%10;
			s=s+r;
			k=k/10;
		}
	}
	void Display()
	{
		cout<<"The sum of the digits of the number "<<num<<" is "<<s;
	}
	void main()
	{
		SumOfDigits obj;
		obj.getinput();
		obj.Sum();
		obj.Display();
		getch();
	}
}
