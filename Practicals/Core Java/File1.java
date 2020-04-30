import java.io.*;
class File1
{
	public static void main(String args[]) throws Exception
	{
		FileReader FR=new FileReader("CS-219 14th March.txt");
		BufferedReader BR=new BufferedReader(FR);
		String S;
		while((S=BR.readLine())!=null)
		{
			System.out.println(S);
		}
	}
}