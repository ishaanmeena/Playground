#include<stdio.h>
int main()
{
  //Type your code here
  int value, second;
  scanf("%d", &value);
  second = (value/10)%10;
  printf("%d", second);
  return 0;
}