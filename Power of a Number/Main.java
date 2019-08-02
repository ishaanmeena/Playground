#include <stdio.h>
#include <math.h>
int main()
{
  	//Your code here
  	long long x, y;
  	scanf("%ld%ld", &x, &y);
  	if(y<0)
      printf("Wrong input");
  	else
    {
  		x = pow(x,y);
  		printf("%ld", x);
    }
    return 0;
}