#include <stdio.h>
int gcd(int n1 , int n2);
int main() {
  int n1, n2, n3;
  scanf("%d%d%d",&n1, &n2,&n3);
  int result = gcd(n1,n2);
  printf("%d",gcd(result ,n3));
	return 0;
}
int gcd(int n1 , int n2)
{
  int min = 0,gcd= 0;
  if(n1 < n2)
  {
    min = n1;
  }
  else{
    min = n2;
  }
  while(min > 1)
  {
    if((n1 % min == 0) && (n2 % min == 0))
    {
      gcd = min ;
      break;
    }
  }
  return gcd;
}