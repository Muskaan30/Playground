#include <stdio.h>
int main() {
	int n , fd,ld,sum;
    int temp;
    scanf("%d",&n);
    temp = n;
    ld = n % 10;
    while(n >= 10)
    {
      n /= 10;
    }
       fd = n;
      sum = fd+ld;
    printf("%d",sum);
	return 0;
}