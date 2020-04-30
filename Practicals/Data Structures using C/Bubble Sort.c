#include<stdio.h>
void main()
{
	int arr[100],i,j,temp,n;
	printf("Enter the number of elements : ");
	scanf("%d",&n);
	printf("Enter the elements of the array : ");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<(n-1-i);j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	printf("Sorted array : ");
	for(i=0;i<n;i++)
		printf("%d	",arr[i]);
}
