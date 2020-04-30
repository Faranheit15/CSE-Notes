#include<iostream>
using namespace std;
class Student
{
	public:
		int id,rno,m1,m2,m3;
		string name;
		void input()
		{
			cout<<"Enter the name of the student : ";
			cin>>name;
			cout<<"Enter the id of the student : ";
			cin>>id;
			cout<<"Enter the roll number of the student : ";
			cin>>rno;
			cout<<"Enter the marks in three subjects : ";
			cin>>m1>>m2>>m3;
		}
};
class Result:public Student
{
	public:
		void display()
		{
			cout<<"The name of the student is "<<name<<endl;
			cout<<"The ID of the student is "<<id<<endl;
			cout<<"The roll number of the student is "<<rno<<endl;
		}
};
class finaldata:public Result
{
	float cal;
	public:
		void reckoning()
		{
			cal=(m1+m2+m3)/3;
		}
		void print()
		{
			cout<<"The average of the marks is : "<<cal;
		}
};
int main()
{
	finaldata obj;
	obj.input();
	obj.display();
	obj.reckoning();
	obj.print();
	return 0;
}
