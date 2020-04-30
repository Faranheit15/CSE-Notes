#include<iostream>
using namespace std;
class Factorial
{
	int num,f;
	public :void getinput()
	{
		cout<<"Enter the number whose factorial you want to calculate : ";
		cin>>num;
	}
	public :void Fact()
	{
		int f=1,i;
		for(i=num;i>=1;i--)
		{
			f=f*i;
		}
	}
	public :void Display()
	{
		cout<<"The factorial of "<<num<<" is "<<f;
	}
};
int main()
{
	Factorial obj;
	obj.getinput();
	obj.Fact();
	obj.Display();
	return 0;
}
