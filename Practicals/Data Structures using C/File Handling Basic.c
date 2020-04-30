#include<stdio.h>
void main()
{
	FILE* fp;
	fp=fopen("D:\\Studyzone\\3rd Semester\\Syllabus.pdf","r");
	if(fp==NULL)
		printf("File not present");
	else
		printf("File opened in read mode");
}

