#include<iostream>
using namespace std;
class Templ
{
	private:
		int a; int b;
	public:
		void get()
		{
			cin>>a>>b;
		}
		void put()
		{
			cout<<a<<" ÷ "<<b;
		}
		void div()
		{
			double d;
			try
			{
				if(b!=0)
				{
					d=a/b;
					cout<<" = "<<d;
				}
				else
				{
					throw(d);
				}
			}
			catch(int b)
			{
				cout<<"Divide by 0";
			}
		}
};
int main()
{
	Templ obj;
	obj.get();
	obj.put();
	obj.div();
	return 0;
}
