import java.io.*;
class DIStream
{
	public static void main(String[] args) throws Exception
	{
		DataInputStream DS=new DataInputStream(System.in);
		System.out.print("Enter your name : ");
		String n=DS.readLine();
		System.out.println(n);
	}
}
