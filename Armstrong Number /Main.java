#include <stdio.h>
#include <math.h>
int main() {
	int n,temp,sum = 0, rem,digit = 0;
    scanf("%d",&n);
    temp = n;
    while ( temp != 0)
    {
      digit++;
      temp = temp /10;
    }
     temp = n;
    while( temp != 0)
    {
      rem = temp % 10;
      sum = sum + pow(rem,digit);
      temp = temp / 10;
    }
   if(n == sum)
     printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}