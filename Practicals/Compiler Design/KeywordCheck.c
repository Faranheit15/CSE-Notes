/*Write a program in C to to find and check the string:
1. is constant or not
2. is keyword or not
3. is identifier or not
1 & 2 can be asked together in exam, 3 will be asked separately*/

#include<stdio.h>
#include<string.h>
int main()
{
    int i,flag=0,m;
    char s[5][10]={"if","else","goto","continue","return"},st[10];
    printf("\nEnter the String : ");
    gets(st);
    for(i=0;i<5;i++)
    {
        m=strcmp(st,s[i]);
        if(m==0)
            flag=1;
    }
    if(flag==0)
        printf("\nIt is not a keyword");
    else
        printf("\nIt is a keyword");
    return 0;
}
