/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
void larg(int list[],int size);
int main()
{
  int size,list[10],i;
  scanf("%d",&size);
  for(i = 0; i < size; i++)
  {
    scanf("%d",&list[i]);
  }
  larg(list,size);
  return 0;
}
void larg(int list[],int size)
{
  int i, bat1_sum = 0, bat2_sum = 0;
  for(i = 0; i < size/2; i++)
  {
    bat1_sum = bat1_sum + list[i];
  }
  for(i= size/2;i< size; i++)
  {
    bat2_sum = bat2_sum + list[i];
  }
  if(bat1_sum == bat2_sum)
  {
    printf("Perfect Batch");
  }
  else
  {
    printf("Not a Perfect Batch");
  }
}