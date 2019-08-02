#include<stdio.h>
#include<math.h>

int main()
{
  //Type your code here
  float x=0, y=0, z=0;
  scanf("%f%f", &x, &y);
  z = sqrt(x*x + y*y);
  printf("%.2f", z);
  return 0;
}