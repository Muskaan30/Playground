#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
   for(int row = 1; row <= n; row++)
   {
     
     for(int col = 1; col<= n; col++)
     {
       
       if((( row % 2 == 0 ) && ( col == 1)) 
          || (( row % 2 == 1) && ( col == n)))
       {
         printf("%d",row + 1);
       }
       else{
         printf("%d",row);
       }
     }
     printf("\n");
   }
	return 0;
}