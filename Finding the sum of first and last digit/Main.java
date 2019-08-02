#include <stdio.h>
#include <math.h>

int main()
{
    int n, firstDigit, lastDigit, digits;
    scanf("%d", &n);
    lastDigit = n % 10;     
    digits = (int)log10(n); 
    firstDigit = (int)(n / pow(10, digits)); 
    printf("%d", firstDigit+lastDigit);
    return 0;
}