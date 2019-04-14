#include <stdio.h>
int main() {
	int num, sum = 0;
    scanf("%d",&num);
    while(num != 0)
    {
      int y = num % 10;
      sum = sum + y;
      num = num / 10;
    }
      printf("%d",sum);
	return 0;
}