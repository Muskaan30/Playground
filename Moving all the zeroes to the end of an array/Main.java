#include<stdio.h>
int main()
{
  int i, count = 0;
  int arr_size;
  scanf("%d",&arr_size);
   int arr[20];
   for(int index = 0; index <= arr_size - 1; index++)
   {
     scanf("%d",&arr[index]);
   }
  for( i = 0; i < arr_size ; i++)
  {
    if(arr[i] > 0)
    {
      arr[count++] = arr[i] ;
    }
  }
  while(count < arr_size)
  {
    arr[count++] = 0;
  }
  for(i = 0; i< arr_size ; i++)
  {
    printf("%d ",arr[i]);
  }
      
  return 0;
}