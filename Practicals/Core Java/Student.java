class Student 
{
	int rno;
	String name;
	Student(int x,String y)
	{
		rno=x;
		name=y;
	}
	void display()
	{
		System.out.println("Student roll number : "+rno);
		System.out.println("Student name : "+name);
	}
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"Faran");
		Student s2=new Student(2,"POpo");
		s1.display();
		s2.display();
	}
}
