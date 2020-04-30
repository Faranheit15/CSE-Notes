#include<stdio.h>
#include<conio.h>
void main()
{
	int arr[100],i,item,loc=-1,n,u=0,h=n-1,mp;
	printf("Enter the range : ");
	scanf("%d",&n);
	printf("Enter the elements of the array :");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the element to be searched : ");
	scanf("%d",&item);
	while(u<=h)
	{
		mp=(u+h)/2;
		if(arr[mp]==item)
		{
			loc=mp;
			break;
		}
		else if(arr[mp]>item)
		{
			h=mp-1;
		}
		else
		{
			u=mp+1;
		}
	}
	if(loc=-1)
	{
		printf("Not found");
	}
	else
	{
		printf("Element found at location : %d",loc);
	}
	getch();
}

