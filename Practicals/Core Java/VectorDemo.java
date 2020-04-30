//ArrayList
import java.util.*;

class VectorDemo
{
	public static void main(String tak[])
	{
		//create an Vector
		Vector al = new Vector(10,20);
		System.out.println("Initial size of al : "+ al.size());
		System.out.println("Initial capacity of al : "+ al.capacity());
		//add elements to the Vector
		al.add("T");
		al.add("a");
		al.add("h");
		al.add("m");
		al.add("i");
		al.add("r");
		al.add("a");
		al.add(" ");
		al.add("K");
		al.add("h");
		al.add("a");
		al.add("n");
		System.out.println("size of al after additions : "+ al.size());
		System.out.println("Initial capacity of al after additions : "+ al.capacity());
		System.out.println("Contents of al : "+ al);
		al.remove(3);
		al.remove(5);
		System.out.println("size of al after deletion   : "+ al.size());
		System.out.println(" capacity of al after deletion : "+ al.capacity());
		System.out.println("Contents of al after deletion : "+ al);
		
	}
}