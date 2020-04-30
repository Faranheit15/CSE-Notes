//Program to calculate volume of cube, cylinder and rectangular box using method overloading
class  Volume
{
	void vol(int s)
	{
		System.out.println("Volume of cube = "+(s*s*s));
	}
	void vol(int a,int b,int c)
	{
		System.out.println("Volume of cuboid = "+(a*b*c));
	}
	void vol(double r)
	{
		System.out.println("Volume of cylinder = "+(3.14*r*r));
	}
	public static void main(String[] args) 
	{
		Volume o=new Volume();
		o.vol(5);
		o.vol(2,4,5);
		o.vol(9.9);
	}
}
