#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
    for(int row = 1; row<= n; row++){
      for(int sp = 1; sp <= n - row; sp++){
        printf(" ");
      }
      for(int col = 1; col<= 2 * row -1 ; col++){
        printf("*");
      }
      printf("\n");
    }
	return 0;
}