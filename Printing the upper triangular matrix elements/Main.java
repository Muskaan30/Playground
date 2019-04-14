#include<stdio.h>
void upper(int r,int c, int matrix[r][c]);
int main()
{
 int i,j,r,c;
  scanf("%d %d",&r, &c);
  int matrix[r][c];
  for(i=0;i < r; i++)
  {
    for(j=0; j <c; j++)
    {
      scanf("%d",&matrix[i][j]);
    }
  }
  upper(r,c,matrix);
}
void upper(int r, int c, int matrix[r][c])
{
  int i,j,k;
  for(k=0; k <c; k++)
  {
    for(i=0,j=k; j < c; i++,j++)
      printf("%d ",matrix[i][j]);
  }

	return 0;
}