#include<stdio.h>
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[10];
  for(int idx = 0; idx <= arr_size -1; idx++)
  { 
    scanf("%d",&arr[idx]);
  }
  int max;
  if(arr[0] > arr[1])
  {
    max = arr[0];
  }
  else
  {
    max = arr[1];
  }
  for(int idx = 2; idx <= arr_size -1; idx++)
  {
    if(max < arr[idx])
    {
      max = arr[idx];
    }
  }
  printf("%d",max );
  return 0;
}