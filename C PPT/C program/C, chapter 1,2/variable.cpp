//.................basic structure of C........................
//#include<stdio.h>
//int main(){
//	printf("Hi, hello");
//	return 0;
//}



//..................declaring and asign the variable to value.......................
//#include<stdio.h>
//int main(){
//	int number1=12;
//	float number2=50.25;
//	char ch='A';
//	printf("Integer value = %d\n",number1);
//	printf("Float value = %f\n",number2);
//	printf("Character value = %c\n",ch);
//	return 0;
//}


//........................printf & scanf..............................
//#include<stdio.h>
//int main(){
//	int number;
//	printf("Enter the number : ");
//	scanf("%d",&number);
//	printf("Entered number = %d",number);
//	return 0;
//}



//.......................getchar() display single char................................
//#include<stdio.h>
//int main(){
//	char variable;
//	printf("Enter character : ");
//	variable=getchar();
//	printf("Entered character = %c",variable);
//	return 0;
//}



//................................putchar()...................................
//#include<stdio.h>
//int main(){
//	char variable;
//	printf("Enter character : ");
//	variable=getchar();
//	printf("Entered character = ");
//	putchar(variable);
//	return 0;
//}



//............input of string display one word only..........................
//#include<stdio.h>
//int main(){
//	char sentence[20];
//	printf("Enter any sentence : ");
//	scanf("%s",&sentence);
//	printf("Entered sentence is %s",sentence);
//	return 0;
//}


//...........................input of string display all words..........................
//#include<stdio.h>
//int main(){
//	char sentence[30];
//	printf("Enter any sentence : ");
//	gets(sentence);
//	printf("Entered sentence is %s",sentence);
//	return 0;
//}


//.............................define string..................................
//#include<stdio.h>
//int main(){
//	char firstname[10];
//	char lastname[10];
//	printf("Enter firstname : ");
//	scanf("%s",&firstname);
//	printf("Enter lastname : ");
//	scanf("%s",&lastname);
//	printf("%s\n",firstname);
//	printf("%s\n",lastname);
//// printing the input value in the same line with a space using printf()
//	printf("%s %s",firstname,lastname);
//	return 0;
//}


//...........................using puts()..................................
//#include<stdio.h>
//int main(){
//	char f_name[20];
//	char l_name[20];
//	printf("Enter your first_name : ");
//	fgets(f_name,20,stdin);
//	printf("Enter your last_name : ");
//	fgets(l_name,20,stdin);
//	puts(f_name);
//	puts(l_name);
//	return 0;
//}



//..........................Arithmetic operators..............................
//#include<stdio.h>
//int main(){
//	int numberOne,numberTwo;
//	printf("Enter two numbers : ");
//	scanf("%d %d",&numberOne,&numberTwo);
//	printf("Addition of two number is %d\n",(numberOne+numberTwo));
//	printf("Subtraction of two number is %d\n",(numberOne-numberTwo));
//	printf("Multiplication of two number is %d\n",(numberOne*numberTwo));
//	printf("Division of two number is %d\n",(numberOne/numberTwo));
//	printf("Modulus of two number is %d\n",(numberOne%numberTwo));
//	return 0;
//}



//....................Assignment operator..................................
//#include<stdio.h>
//int main(){
//	int a=10,b=5;
//	int c=a+b;
//	printf("value of c = %d\n",c);
//	c+=a;
//	printf("value of c = %d\n",c);
//	b-=c;
//	printf("value of b = %d\n",b);
//	a*=b;
//	printf("value of a = %d\n",a);
//	return 0;
//}



//.................Comparison operator...................................
//#include<stdio.h>
//int main(){
//	int a,b;
//	printf("Enter two numbers : ");
//	scanf("%d %d",&a,&b);
//	printf("Lessthan:%d\n",(a<b));
//	printf("Greaterthan:%d\n",(a>b));
//	printf("Lessthan or equal:%d\n",(a<=b));
//	printf("Greaterthan or equal:%d\n",(a>=b));
//	printf("Equal to :%d\n",(a==b));
//	printf("Not equal to :%d\n",(a!=b));
//	return 0;
//}


//.............................bitwise operator...........................
//#include<stdio.h>
//int main(){
//	int a,b;
//	printf("Enter two values : ");
//	scanf("%d %d",&a,&b);
//	printf("AND value = %d\n",(a&b));
//	printf("OR value = %d\n",(a|b));
//	printf("XOR value = %d\n",(a^b));
//	printf("NOT value = %d\n",(~a));
//	printf("Rightshift value = %d\n",(a>>2));
//	printf("Leftshift value = %d\n",(a<<2));
//	return 0;
//}


//.....................logical operator..................................
//#include<stdio.h>
//int main(){
//	int a=10,b=5;
//	printf("%d\n",(a>b)&&(a<b));
//	printf("%d\n",(a>b)||(a<b));
//	printf("%d\n",!((a>b)&&(a<b)));
//	return 0;
//}


//...........................pre increment...................................
//#include<stdio.h>
//int main(){
//	printf("++ preincrement\n");
//	int a=5;
//	printf("value of a : %d\n",a);
//	printf("value of a : %d\n",++a);
//	printf("value of a : %d\n",a);
//	return 0;
//}


//.........................post increment...............................
//#include<stdio.h>
//int main(){
//	printf("preincrement ++\n");
//	int a=5;
//	printf("value of a : %d\n",a);
//	printf("value of a : %d\n",a++);
//	printf("value of a : %d\n",a);
//	return 0;
//}


