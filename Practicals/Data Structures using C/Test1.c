#include<stdio.h>
void main()
{
	int arr[100],i,loc=-1,n,item,u=0,mp;
	printf("Enter the range of the Array : ");
	scanf("%d",&n);
	printf("Enter the elements of the Array : ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the element to be searched : ");
	scanf("%d",&item);
	int h=n-1;
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
	if(loc==-1)
	{
		printf("Element not found");
	}
	else
	{
		printf("Element found at location %d",loc);
	}
}
