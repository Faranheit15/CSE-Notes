#include<iostream>
using namespace std;
class Complex
{
	Public:
		int x,y;
	Public:
		Complex()
		{
			x=15;
			y=5;
		}
		void display()
		{
			cout<<x"+"y;
		}
		void operator --()
		{
			this->x=this->x+3;
			this->y=this->y-3;
		}
};
void main()
{
	Complex a,b;
	a.display();
	a--;
	a.display();
	b--;
	b.display();
}
