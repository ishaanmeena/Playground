#include<stdio.h>
int main()
{
  int value, firstValue, thirdValue;
  scanf("%d", &value);
  firstValue = value%10;
  thirdValue = (value/100)%10;
  printf("%d",firstValue + thirdValue);
  return 0;
}