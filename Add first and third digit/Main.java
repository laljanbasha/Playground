#include<stdio.h>
int main()
{
  //Type your code here
  int num,num1,num2;
  scanf("%d",&num);
  num1=num/100;
  num2=num%10;
  printf("%d",num1+num2);
  return 0;
}