// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
void rot(int list[],int size,int iter);
int main()
{
  int size,list[10],i,iter;
  scanf("%d",&size);
  for(i = 0; i< size; i++)
  {
    scanf("%d",&list[i]);
  }
  scanf("%d",&iter);
  rot(list,size,iter);
  
   return 0;
}
void rot(int list[],int size, int iter)
{
  int i,j;
  int odd,even,odd_idx,even_idx;
  odd_idx = (size%2 == 0) ? size -2:size-1;
  even_idx = (size%2 == 0) ? size -1:size -2;
  for( i = 0; i<iter ; i++)
  {
    odd = list[odd_idx];
    for( j = odd_idx; j >= 0; j= j-2)
    {
      list[j] = list[j-2];
    }
    list[0] = odd;
    even = list[1];
    for( j=1; j < size ; j=j+2)
    {
      list[j] = list[j+2];
    }
    list[even_idx] = even;
  }
  for( i = 0; i < size ; i++)
  {
    printf( "%d ",list[i]);
  }
}