#include <stdio.h>
#include <math.h>

int main() {
	//Type your code
  	int num=0, rem=0, value=0, sum=0, powe=0, cnum = 0, src=0;
  	scanf("%d", &num);
  	cnum = num;
  	src = cnum;
  	while(num!=0)
    {
      rem = num%10;
      powe++;
      num = num/10;
    }
  	//printf("%d", powe);
  	rem=0, value=0, sum=0;
  	while(cnum!=0)
    {
      rem = cnum%10;
      sum = sum + pow(rem,powe);
      cnum = cnum/10;
    }
  	if(sum==src)
    	printf("Armstrong Number");
  	else
      printf("Not an Armstrong Number");
	return 0;
}