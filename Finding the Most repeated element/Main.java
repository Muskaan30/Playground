#include<stdio.h>
static int most(int arr[],int n, int freq[])
{
  int max = 0;
  int curr = 1;
  for(int i = 0; i < n; i++)
  {
    for(int j = i+1; j < n; j++)
    {
      if(arr[i] == arr[j])
        curr++;
    }
    freq[i] = curr;
    curr = 1;
  }
  for(int i = 0; i <n ; i++)
  {
    if(freq[i]>freq[max])
      max = i;
  }
  return arr[max];
}

int main()
{
  int n;
  scanf("%d",&n);
  int arr[10];
  for(int i = 0; i < n; i++)
  {
    scanf("%d",&arr[i]);
  }
  int freq[n];
  printf("%d" , most(arr,n,freq));
  return 0;
}