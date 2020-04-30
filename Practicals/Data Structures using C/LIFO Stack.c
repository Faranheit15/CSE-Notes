#include<stdio.h>
#include<conio.h>
#include<process.h>
#include<malloc.h>
int top=-1,MAX=5,a[5],i,num;
void push(int num)
{
	if(top==(MAX-1))
	{
		printf("\tOVERFLOW");
	}
	else
	{
		top=top+1;
		a[top]=num;
	}
}
void pop()
{
	if(top==-1)
	{
		printf("\tUNDERFLOW");
	}
	else
	{
		printf("%d",a[top]);
		top=top-1;
	}
}
void display()
{
	if(top==-1)
	{
		printf("Stack empty");
	}
	else
	{
		for(i=top;i>=0;i--)
			printf("%d\t",a[i]);
	}
}
void main()
{
	int i,ch;
	while(1)
	{
		printf("\n1. Push");
		printf("\n2. Pop");
		printf("\n3. Display");
		printf("\n4. Exit");
		printf("\nEnter your choice : ");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				printf("\nEnter a number : ");
				scanf("%d",&num);
				push(num);
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				exit(0);
				break;
			default:
				printf("Invalid entry!");
		}
	}
	getch();
}
