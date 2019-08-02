#include<stdio.h>

int main()
{
  	long fact = 1;
  	int n; 
  	scanf("%d", &n);
  	if(n==0)
      printf("0");
 	else
    {
      for(int i=1;i<=n;i++)
      {
        fact = fact * i;
      }
      printf("%ld", fact);
    }
  	return 0;
}