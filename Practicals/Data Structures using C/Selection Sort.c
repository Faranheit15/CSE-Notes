#include<stdio.h>
void main()
{
	int a[100],i,j,t,small,n;
	printf("Enter the number of elements : ");
	scanf("%d",&n);
	printf("Enter the elements of the array : ");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		small=i;
		for(j=(i+1);j<n;j++)
			if(a[small]>a[j])
				small=j;
		if(i!=small)
		{
			t=a[i];
			a[i]=a[small];
			a[small]=t;
		}
	}
	printf("Sorted Array : ");
	for(i=0;i<n;i++)
		printf("%d	",a[i]);
}
