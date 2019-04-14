#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
    int val = 1;
    for(int row = 1 ; row <= n; row++)
    {
      // space
      for(int sp = 1; sp <= (n - row); sp++){
        printf(" ");
      }
      //space
      for(int col = 1 ; col <= row; col++)
      {
        printf("%d ", val);
        val++;
      }
      printf("\n");
    }  
	return 0;
}