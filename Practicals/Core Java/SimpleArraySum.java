import java.util.*;
class Solution
{
  public static void main(String args[])throws Exception
  {
    Scanner sc=new Scanner(System.in);
    int n,s=0;
    System.out.print("Enter the number of elements : ");
    n=sc.nextInt();
    int ar[] = new int[n];
    System.out.print("Enter the elements of the Array : ");
    for(int i=0;i<n;i++)
      ar[i]=sc.nextInt();
    for(int i=0;i<n;i++)
      s=s+ar[i];
    System.out.println("Sum of the Array elements = "+s);
  }
}
