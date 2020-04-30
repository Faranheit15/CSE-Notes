#include<stdio.h>
void main()
{
	int arr[100],i,j,n,t;
	printf("Enter the number of elements : ");
	scanf("%d",&n);
	printf("Enter the elements of the array : ");
	for(i=0;i<n;i++)
		scanf("%d",&arr[i]);
	for(i=0;i<n;i++)
	{
		j=i;
		while((j>0)&&(arr[j-1]>arr[j]))
		{
			t=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=t;
			j--;
		}
	}
	printf("Sorted Array : ");
	for(i=0;i<n;i++)
		printf("%d	",arr[i]);
}
