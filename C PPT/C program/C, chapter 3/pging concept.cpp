//............................if.........................................
//#include<stdio.h>
//int main(){
//	int a=6,b=7,c=8;
//	if(a>b){
//		printf("A is greater\n");
//	}
//	if(b>a){
//		printf("B is greater\n");
//	}
//	if(c>a){
//		printf("C is greater\n");
//	}
//	return 0;
//}


//..............................if-else.....................................
//#include<stdio.h>
//int main(){
//	int num;
//	printf("Enter an integer : ");
//	scanf("%d",&num);
//	if(num%2==0){
//		printf("Number is evan");
//	}
//	else{
//		printf("Number is odd");
//	}
//	return 0;
//}



//.....................................else if...................................
//#include<stdio.h>
//int main(){
//	int number1,number2;
//	printf("Enter two integers : \n");
//	scanf("%d %d",&number1,&number2);
//	if(number1==number2){
//		printf("Numbers are equal");
//	}
//	else if(number1>number2){
//		printf("Number1 is greater");
//	}
//	else{
//		printf("Number2 is greater");
//	}
//	return 0;
//}


//.......................nested if......................................
//#include<stdio.h>
//int main(){
//	int a;
//	printf("Enter your age : ");
//	scanf("%d",&a);
//	if(a>0){
//		if(a>=18 && a<=50){
//			printf("Eligible  for working\n");
//		}
//		else{
//			printf("Not eligible for working\n ");
//		}
//	}
//	else{
//		printf("Age is not satisfactory according to the organization norms\n");
//	}
//	return 0;
//}


//..............................switch case..................................
//#include<stdio.h>
//int main(){
//	char op;
//	int n1,n2;
//	printf("Enter an operator(+,-,*,/) : \n");
//	scanf("%c",&op);
//	printf("Enter two operands : \n");
//	scanf("%d %d",&n1,&n2);
//	switch(op){
//		case '+':
//			printf("Addition of two value = %d",(n1+n2));
//			break;
//		case '-':
//			printf("Subtraction = %d",(n1-n2));
//			break;
//		case '*':
//			printf("Multiplication = %d",(n1*n2));
//			break;
//		case '/':
//			printf("Division = %d",(n1/n2));
//			break;
//		default:
//			printf("Error! operator is not correct");
//			break;
//	}
//	return 0;
//}



//.......................Looping statement.........................
//.....................while loop.................................
//#include<stdio.h>
//int main(){
//	int n=10;
//	while(n>0){
//		printf("Value of n = %d\n",n);
//		n--;
//	}
//	return 0;
//}


//......................dowhile loop...........................
//#include<stdio.h>
//int main(){
//	int n=10;
//	do{
//		printf("Value of n = %d\n",n);
//		n--;
//	}while(n>0);
//	return 0;
//}


//...................for loop.................................
//#include<stdio.h>
//int main(){
//	for(int n=10;n>0;n--){
//		printf("Value of n = %d\n",n);
//	}
//	return 0;
//}


//...................nested for loop...........................
//#include<stdio.h>
//int main(){
//	int multiplier,multiplicant,product;
//	for(multiplicant=1;multiplicant<=3;multiplicant++){
//		for(multiplier=1;multiplier<=10;multiplier++){
//			product=multiplier*multiplicant;
//			printf("%d * %d = %d\n",multiplier,multiplicant,product);
//		}
//		printf("\n");
//	}
//	return 0;
//}


//.........................break statement..........................
//#include<stdio.h>
//int main(){
//	int x=1;
//	while(x<10){
//		//x++;
//		printf("x = %d\n",x);
//		x++;
//		if(x==5){
//			break;
//		}
//	}
//	return 0;
//}


//......................continue statement..........................
//#include<stdio.h>
//int main(){
//	int i;
//	for(i=1;i<10;i++){
//		if(i==5){
//			continue;
//		}
//		printf("i = %d\n",i);
//	}
//	return 0;
//}


//.............................return statement......................
//#include<stdio.h>
//int main(){
//	printf("Return statement example");
//	return 0;
//}


//......................gotostatement..........................
//#include<stdio.h>
//#include<math.h>
//int main(){
//	float num,res;
//	input:
//		printf("Enter a decimal number (To end press -ve value): ");
//		scanf("%f",&num);
//		if(num<=0)
//		goto end;
//		res=sqrt(num);
//		printf("The square root of %f is %f \n",num,res);
//		goto input;
//		end:
//			printf("Enter any key");
//			return 0;
//}














