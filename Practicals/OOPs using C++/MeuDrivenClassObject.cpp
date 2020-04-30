#include<iostream>
using namespace std;
class Complex
{
	private:
		int real,img;
	public:
		Complex()
		{
			real=5;
			img=10;
		}
		Complex(int r,int i)
		{
			real=r;
			img=i;
		}
		void read()
		{
			cout<<"Enter the number : ";
			cin>>real>>img;
		}
		void show()
		{
			cout<<real<<"+i"<<img;
		}
		Complex add(Complex a,Complex b)
		{
			Complex temp;
			temp.real=a.real+b.real;
			temp.img=a.img+b.img;
			return temp;
		}
		Complex sub(Complex a,Complex b)
		{
			Complex temp;
			temp.real=a.real-b.real;
			temp.img=a.img-b.img;
			return temp;
		}
};
int main()
{
	Complex a,b(10,15),e;
	while(1)
	{
		int n;
		cout<<"1. Read\n2. Show\n3. Add\n4. Subtract\n5. Exit\nEnter your choice : ";
		cin>>n;
		switch(n)
		{
			case 1:a.read();
				   b.read();
				   break;
			case 2:a.show();
				   b.show();
				   e.show();
				   break;
			case 3:e=e.add(a,b);
				   break;
			case 4:e=e.sub(a,b);
				   break;
			case 5:exit(0);
			default:cout<<"Invalid entry!";
		}
	}
}
