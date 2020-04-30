#include<iostream>
using namespace std;
class MultiplicationTable
{
	int num;
	public :void Getinput()
	{
		cout<<"Enter the number whose table you want to print : "<<endl;
		cin>>num;
	}
	public :void Mul()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			cout<<num<<" x "<<i<<" = "<<(num*i)<<endl;
		}
	}
};
int main()
{
	MultiplicationTable obj;
	obj.Getinput();
	obj.Mul();
	return 0;
}
