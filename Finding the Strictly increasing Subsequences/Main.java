#include<stdio.h>
int inc(int arr_size, int arr[],int sum[]);
int main()
{
	int arr_size;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int index= 0; index < arr_size;index++)
  {
    scanf("%d",&arr[index]);
  }
  int sum[3 * arr_size];
  inc(arr_size, arr, sum);
   return 0;
}
int inc(int arr_size,int arr[],int sum[])
{
  for(int index1 = 0; index1<= arr_size-1; index1++)
  {
    int key = arr[index1];
    int flag= 1;
    for(int index2 = index1+1; index2<= arr_size-1;index2++)
    {
      if(arr[index2]>key)
      {
        for(int index3 = index1; index3 <= index2;index3++)
        {
          if(arr[index3]> arr[index2])
            flag=0;
        }
        if(flag== 1)
          printf("%d,%d\n",key,arr[index2]);
      }
      flag = 1;
    }
  }
  return 0;
}