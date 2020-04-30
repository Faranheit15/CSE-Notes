class A
{
	public: int a , b;
	public: void show();
			int area;
}; 
class B:public A
{// here we public is the visibility mode and we write the name of the parent class here 
	public: // this is the derived class 
		int sum()
		{
			int s=a+b;
		}
}; 
int main()
{
	B b; // making the object of the derived class B 
	A a; // we need not require this as this is the instance of the parent class. 
	b.show(); // we can access the content of the parent class without even making the instance or the object of the              //parent class as we already have the derived class 
	b.area;
	b.sum();
	return 0;
} 
