/*Write a program in C to to find and check the string:
1. is constant or not
2. is keyword or not
3. is identifier or not
1 & 2 can be asked together in exam, 3 will be asked separately*/

#include<stdio.h>
int isiden(char*);
int second(char*);
int third();
int main()
{
    char *str;
    int i=-1;
    printf("\n\n\t\tEnter the desired String : ");
    do
    {
        ++i;
        str[i]=getch();
        if(str[i]!=10 && str[i]!=13)
            printf("%c",str[i]);
        if(str[i]=='\b')
        {
            i--;
            printf('\b');
        }
    }while(str[i]!=10 && str[i]!=13);
    if(isident(str))
        printf("\n\n\t\tThe given String is an identifier");
    else
        printf("\n\n\t\tThe given String is not an identifier");
    int isident(char *str)
    {

    }
}
