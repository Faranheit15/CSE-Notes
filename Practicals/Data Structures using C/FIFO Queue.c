#include<stdio.h>
#include<conio.h>
#include<process.h>
#include<malloc.h>
int rear=-1,front=-1,n,a[5],max=5;
void insert(int num)
{
	if(rear==(max-1))
	{
		printf("\nOverflow");
	}
	else
	{
		if((front==-1)||(front>rear))
		{
			front=0;
		}
		rear=rear+1;
		a[rear]=num;
	}
}
void del()
{
	if(front==-1)
	{
		printf("\nUnderflow");
	}
	else
	{
		printf("%d",a[front]);
		front=front+1;
	}
}
void display()
{
	if(front==-1)
	{
		printf("\nQueue is empty");
	}
	else
	{
		int i;
		for(i=front;i<=rear;i++)
		{
			printf("%d\t",a[i]);
		}
	}
}
void main()
{
	int choice;
	while(1)
	{
		printf("\n1. Insert");
		printf("\n2. Delete");
		printf("\n3. Display");
		printf("\n4. Exit");
		printf("\nEnter choice : ");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
				printf("\nEnter a number : ");
				scanf("%d",&n);
				insert(n);
				break;
			case 2:
				del();
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
