#include<stdio.h>
#include<conio.h>
void main()
{
	int arr[100],i,item,loc,n,f;
	printf("Enter the range : ");
	scanf("%d",&n);
	printf("Enter the elements of the array :");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the element to be searched : ");
	scanf("%d",&item);
	for(i=0;i<n;i++)
	{
		if(arr[i]==item)
		{
			f=1;
			loc=i;
			break;
		}
	}
	if(f==1)
	{
		printf("Element found at %d",loc);
	}
	else
	{
		printf("Element not found");
	}
	getch();
}
