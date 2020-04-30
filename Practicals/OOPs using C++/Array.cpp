#include<iostream>
using namespace std;
class Array
{
	public:
		int A[100],n;
	public:
		void get_data();
		void show_data();
		friend void operator+(Array B);
};
void Array::get_data()
{
	cout<<"Enter number of elements";
	cin>>n;
	cout<<"Enter data";
	int i;
	for(i=0;i<n;i++)
	{
		cin>>A[i];
	}
}
void Array::show_data()
{
	cout<<"Array elements"<<endl;
	int i;
	for(i=0;i<n;i++)
	{
		cout<<A[i]<<endl;
	}
}
void operator+(Array B)
{
	int i;
	for(i=0;i<n;i++)
	{
		A[i]=A[i]+B.A[i];
	}
}
int main()
{
	Array ob1,ob2;
	ob1.get_data();
	ob1.show_data();
	ob2.get_data();
	ob2.show_data();
	ob1+ob2;
	ob1.show_data();
	return 0;
}
