#include<stdio.h>
int main()
{
 int n;
  scanf("%d",&n);
  int arr[10];
  for(int idx=0; idx <= n-1; idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int k;
  scanf("%d",&k);
  sel(n,arr);
  printf("%d",arr[n-k]);
  
return 0;
}
void sel(int n, int arr[])
{
  for(int start = 0; start<= n-2; start++)
  {
    int min = find(start , arr, n-1);
    swap(start,min,arr);
  }
}
void swap(int start, int min, int arr[])
{
  int temp = arr[start];
  arr[start] = arr[min];
  arr[min] = temp;
}
int find(int start, int arr[], int end)
{
  int min = 0;
  if(arr[start]< arr[start +1])
  {
    min = start;
  }
  else
  {
    min = start+1;
  }
  for(int i = start +2; i <= end; i++)
  {
    if(arr[min] > arr[i])
    {
      min =i;
    }
  }
  return min;
}