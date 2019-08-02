#include <stdio.h>
#include <math.h>

int main() {
	//Type your code
  	int num=0, rem=0, value=0, sum=0, powe=0, cnum = 0, src=0;
  	scanf("%d", &num);
    src = num;
  	while(num!=0)
    {
      rem = num%10;
      sum = sum + fact(rem);
      num = num/10;
    }
  	//printf("%d %d", sum, src);
  	if(sum==src)
    	printf("Yes");
  	else
      printf("No");
	return 0;
}

int fact(int num) {
  	int fact=1;
  	for(int i=1;i<=num;i++)
      fact = fact * i;
	return fact;
}