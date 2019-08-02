#include <stdio.h>
int main() {
	//Type your code
  	int num, fact=1;
  	scanf("%d", &num);
  	for(int i=1;i<=num;i++)
      fact = fact * i;
  	printf("%d", fact);
	return 0;
}