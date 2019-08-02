#include <stdio.h>

int main(){
  float r, a;
  scanf("%f%f", &r, &a);
  float len = (a/360)*2*3.14*r;
  printf("%.2f", len);
}