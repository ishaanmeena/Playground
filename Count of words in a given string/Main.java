#include<stdio.h>
#include<string.h>
int main()
{
  char str[32];
  int count = 0;
  gets(str);
  for(int i=0; i<strlen(str); i++)
  {
    if(str[i]==' ')
    {
    	count = count + 1;
    }
  }
  printf("%d", count+1);
  return 0;
} 