//2. Write a program in C to convert infix expressions to postfix expressions with the help of stack.
#include<stdio.h>
#include<ctype.h>
#include<string.h>
int top=-1,i=0,l;
char infix[50], stk[50], a;
void postfix(char);
int p(char);
int main()
{
    printf("Enter infix expression : ");
    gets(infix);
    l=strlen(infix);
    infix[l]='#';
    stk[++top]='#';
    printf"Postfix Expression");
    while(infix[i]!=#*')
    {
        if(isalpha(infix[i]))
            printf("%c",infix[i]);
        else
            postfix(infix[i]);
        i++;
    }
    while((top!=-1)&&(stk[top]!='#'))
        printf("%c",stk[top--]);
}
void postfix(char a)
{
    switch(a)
    {
        case '(':stk[++top]=a;
        break;

        default:
        if(a==')')
        {
            while(stk[++top]!=')')
            printf("%c",stk[--top]);
        }
        else if (stk[++top]=='(')
            stk[++top]=a;
        else if(p(a)>p(stk[top]))
            stk[++top]=a;
        else
        {
            while (p(stk[top])>p(a))
                printf("%c",stk[top--]);
            stk[++top]=a;
        }
    }
}
int p(char a)
{
    switch(a)
    {
        case '^':
            return 3;
            break;
        case '/':
        case '*':
            return 2;
            break;
        case '+':
        case '-':
            return 1;
            break;
        default:
            return 0;
    }
    return 0;
}
