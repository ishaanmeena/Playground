#include<stdio.h>
int main()
{
  //Type your code here
  int x,y;
  scanf("%d%d", &x, &y);
  if(x>y)
    printf("num1 is the greatest");
  else
    if(x<y)
      printf("num2 is the greatest");
  else
    printf("Both number Equal");
  return 0;
}