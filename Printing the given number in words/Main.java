#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
  switch(num){
    case 1:
      		if(num==1)
      			printf("One");
     	 break;
    case 2:
       		if(num==2)
      			 printf("Two");
     		 break;
    case 3:
       if(num==3)
      		printf("Three");
      break;
    case 4:
      if(num==4)
      		printf("Four");
      break;
    case 5: 
      if(num==5)
		 printf("Five");
      break;
    default :
      printf("Invalid");
      break;
  }

  return 0;
}