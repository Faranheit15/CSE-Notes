import java.io.*;


class Email
{
	public static void main(String arr[]) throws IOException
	{
	  
	  int i=0,j=0,countRate=0,countDot=0,countChar=0;
	  char c; 

	  System.out.println("Enter The E_Mail Id");

	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String str = br.readLine();
	  
	   System.out.println("Entered String is " + str);

	  int l = str.length();
	  System.out.println("Length of string is" + l);
 	    			
	  for(i=0;i<l;i++)
	   {
	     	c=str.charAt(i);
		   
		
		if(i==0)
	         {
		  if(c=='_')
		   System.out.println("ERROR:  '_' is not allowed at first position"); 	

		  if(c == '0' || c == '1' || c == '2' || c== '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')
		   System.out.println("ERROR:  Numbers are not allowed at first position"); 	 	



	         }
        
		if(i>=1)
		 
 
		 //for(j=i;j<l;j++)
                   {
			c = str.charAt(i);
			if (c =='@')
			  countRate = countRate + 1;
			if (countRate > 1)
			System.out.println("ERROR: More than one '@' is not allowed");
			
			if (c =='.')
			  countDot = countDot + 1;
			
			if (countDot==1)
			  countChar = countChar+1;
				if(countChar>3)	
 					System.out.println("ERROR: More than one three char is not allowed after '.'");
		        if (countDot==2)
			  countChar = countChar+1;
				if(countChar>3)	
 					System.out.println("ERROR: More than one three char is not allowed after '.'");
			
			if (countDot > 2)
			System.out.println("ERROR: More than TWO '.' is not allowed");         					
					    
                   }
				
		 

	    }


			
	}

}	