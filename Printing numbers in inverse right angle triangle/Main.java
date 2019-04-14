#include <stdio.h>
int main() {
    int n; 
     scanf("%d", &n);
   int val = n;
  for( int row= 1; row<= n ; row++)
  {
    
    for(int col = val; col>=1 ; col--)
    {
      printf("%d",col);
    }
    val--;
    printf("\n");
  }
	return 0;
}