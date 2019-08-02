#include <stdio.h>

int main() {
	int sum = 0, rem = 0, value =0;
  	scanf("%d", &value);
  	while(value!=0)
    {
      rem = value%10;
      sum = sum + rem;
      value = value/10;
    }
  	printf("%d", sum);
}