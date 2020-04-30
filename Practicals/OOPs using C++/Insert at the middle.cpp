#include<stdio.h>
#include<conio.h>
#include<malloc.h>
#include<process.h>
void insert();
void insert1();
void display();
void addatmiddle();
struct node
{
	int info;
	struct node *link;
}
*start;
void insert(int num)
{
	struct node *q,*temp;
	temp=(struct node *)malloc(sizeof(struct node));
	temp->info=num;
	temp->link=NULL;
	if(start==NULL)
		start=temp;
	else
	{
		q=start;
		while(q->link!=NULL)
		{
			q=q->link;
		}
		q->link=temp;
	}
}
void insert1(int data)
{
	struct node *temp;
	temp=(struct node *)malloc(sizeof(struct node));
	temp->info=data;
	temp->link=start;
	start=temp;
}
void display()
{
	struct node *q;
	if(start==NULL)
	{
		printf("No node");
		return;
	}
	else
	{
		q=start;
		while(q!=NULL)
		{
			printf("%d->",q->info);
			q=q->link;
		}
		printf("\tNULL");
	}
}
void addatmiddle(int data,int pos)
{
	struct node *temp,*q;
	int i;
	q=start;
	for(i=0;i<pos;i++)
	{
		q=q->link;
		if(q==NULL)
		{
			printf("There are no nodes \n");
			return;
		}
	}
	temp=(struct node *)malloc(sizeof(struct node));
	temp->info=data;
	temp->link=q->link;
	q->link=temp;
}
int main()
{
	int i,num,choice,data,pos;
	//clrscr();
	while(1)
	{
		printf("\n 1.Create");
		printf("\n 2.Display");
		printf("\n 3.Insert");
		printf("\n 4.Add at middle");
		printf("\n 5.Exit");
		printf("\n Enter your choice : ");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:printf("\n Enter the data : ");
			for(i=0;i<3;i++)
			{
				scanf("%d",&num);
				insert(num);
			}
			break;
			case 2:display();break;
			case 3:printf("\n Enter the data for the node : ");
			scanf("%d",&data);
			insert1(data);
			break;
			case 4:printf("\n Enter the data : ");
			scanf("%d",&data);
			printf("Enter the positon : ");
			scanf("%d",&pos);
			addatmiddle(data,pos);
			break;
			case 5:exit(0);break;
			default:printf("\n End");
			return 0;
		}
	}
}
