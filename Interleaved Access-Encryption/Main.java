#include<stdio.h>
#include<string.h>
#define MAX_LEN 40
int main()
{
  char sent_str[MAX_LEN];
  scanf("%s",sent_str);
  int str_len = strlen(sent_str);
  int col_count,row_count;
  scanf("%d",&col_count);
  row_count = (str_len / col_count);
  if((str_len % col_count) > 0)
  {
    row_count = row_count + 1;
  }
  int col_index, row_index;
  for(col_index = 0; col_index < col_count; col_index++)
  {
    for(row_index = 0; row_index < row_count; row_index++)
    {
      int curr_char_idx = col_index + (row_index * col_count);
      if((row_index % 2) == 0)
      {
      }
      else
      {
        int last_col_ele = (col_count - 1)+ ( row_index * col_count);
        curr_char_idx = last_col_ele - col_index;
      }
      char ch;
      if(( curr_char_idx >= str_len))
         {
           ch = 'X';
         }
         else 
         {
           ch = sent_str[curr_char_idx];
         }
         printf("%c",ch);
         }
         }
         return 0;
}