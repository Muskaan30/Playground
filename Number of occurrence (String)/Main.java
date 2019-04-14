#include<stdio.h>
#include<string.h>
#define MAX_SIZE 100
int count(char * str, char * toSearch);
void upper(char s[])
{
  int c = 0;
  while(s[c] != '\0')
  {
    if(s[c] >= 'a' && s[c] <= 'z')
    {
      s[c] = s[c] - 32;
    }
    c++;
  }
}
int main()
{
  char str[MAX_SIZE];
  char toSearch[MAX_SIZE];
  int count;
  scanf("%[^\n]s",str);
  upper(str);
  scanf("%s",toSearch);
  upper(toSearch);
  count = countO(str, toSearch);
  printf("%d",count);
  return 0;
}
int countO(char * str, char * toSearch)
{
  int i,j,found,count;
  int len,searchlen;
  len = strlen(str);
  searchlen = strlen(toSearch);
  count = 0;
  for(i = 0; i <= len - searchlen; i++)
  {
    found = 1;
    for(j=0; j< searchlen; j++)
    {
      if(str[i+j] != toSearch[j])
      {
        found = 0;
        break;
      }
    }
    if(found == 1)
    {
      count++;
    }
  }
  return count;
}