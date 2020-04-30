#include <iostream>
using namespace std;
class SumOfDigits
{
	int num,s;
	public :void getinput()
	{
		cout << "Enter a number" <<endl;
		cin >> num;
	}
	public :void Sum()
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
	public :void Display()
	{
		cout << "The sum of the digits of the number " << num << " is " << s;
	}
};
	int main()
	{
		SumOfDigits obj;
		obj.getinput();
		obj.Sum();
		obj.Display();
		return 0;
	}
