#include<stdio.h>
int main()
{
  int value, d1, d2;
  scanf("%d", &value);
  d1 = value%10;
  d2 = (value/10)%10;
  printf("%d", d1+d2);
  return 0;
}