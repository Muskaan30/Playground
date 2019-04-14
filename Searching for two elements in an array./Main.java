#include<stdio.h>
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[10];
  for(int idx = 0; idx <= arr_size -1 ;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int se_1;
  scanf("%d",&se_1);
  int se_2;
  scanf("%d",&se_2);
  int ele_1_idx = -1;
  int ele_2_idx = -1;
  for(int idx = 0; idx <= arr_size - 1; idx++)
  {
    if(se_1 == arr[idx])
    {
      ele_1_idx = idx;
    }
    if(se_2 == arr[idx])
    {
      ele_2_idx = idx;
    }
  }
  printf("%d\n",ele_1_idx);
  printf("%d\n",ele_2_idx);
  return 0;
}