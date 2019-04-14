#include<stdio.h>
int fact(int);
int main()
{
	int num;
    int result;
    scanf("%d",&num);
   if( num < 0)
   {
     printf("Factorial of negative number not possible\n");
   }
  else
  {
    result = fact(num);
    printf("%d\n",result);
  }
	return 0;
}
int fact(int num)
{
  if(num == 0 || num == 1)
  {
    return 1;
  }
  else
  {
    return( num * fact(num - 1));
  }
}