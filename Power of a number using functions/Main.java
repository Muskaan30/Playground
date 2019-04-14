#include<stdio.h>
int power(int base, int exp);
int main(){
  int base, exp;
  scanf("%d%d",&base , &exp);
  printf("%d",power(base, exp));
    return 0;
}
int power(int base , int exp)
{
  int power = 1;
  while ( exp >= 1)
  {
    power = power * base ;
    exp-- ;
  }
  return power;
}