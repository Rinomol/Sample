//...................if statement................................
//#include<iostream>
//using namespace std;
//int main(){
//	int a=6,b=7,c=8;
//	if(a>b){
//		cout << " A is greater";
//	}
//	if(b>c){
//		cout << " B is greater";
//	}
//	if(c>a){
//		cout << " C is greater";
//	}
//return 0;
//}


//.......................if else statements............................
//#include<iostream>
//using namespace std;
//int main(){
//	int num;
//	cout << "Enter number : " << endl;
//	cin >> num;
//	if(num%2==0){
//		cout << "Evan number" << endl;
//	}
//	else{
//		cout << "Odd number" << endl;
//	}
//	return 0;
//}

//.................else if ladder statement...........................
//#include<iostream>
//using namespace std;
//int main()
//{
//	int number1,number2;
//	cout << "Enter two numbers : " << endl;
//	cin >> number1 >> number2;
//	if(number1 == number2){
//		cout << "Numbers are eqal" << endl;
//	}
//	else if(number1 > number2){
//		cout << "Number1 is greater" << endl;
//	}
//	else if(number2 > number1){
//		cout << "Number2 is greater" << endl;
//	}
//	else{
//		cout << "Nothing" << endl;
//	}
//	return 0;
//}



//....................Nested if else statement...............................
//#include<iostream>
//using namespace std;
//int main()
//{
//	int a;
//	cout<< "Enter your current Age Here:";
//	cin >> a;
//	if(a > 0){
//		if( a < 18 ){
//			cout << "Consider as minor";
//			cout << "Not fit for Working";
//		}	
//	else{
//		cout << "eligible for Working ";
//	}	
//	}	
//	else{
//		cout << "Age is not satisfactory according to the organization norms";
//	}
//return 0;
//}


//.........................Switch case statement.................................
//#include<iostream>
//using namespace std;
//int main()
//{
//	char op;
//	int n1, n2;
//	cout << "Enter Operator (+, -, *, /)" << endl;
//	cin >>op;
//	cout << "Enter two operands" << endl;
//	cin >> n1 >> n2;
//	switch(op){
//		case '+':
//			cout << "Addition : " << n1+n2 << endl;
//			break;
//		case '-':
//			cout << "Subtraction : " << n1-n2 <<endl;
//			break;
//		case '*':
//			cout << "Multiplication : " << n1*n2 <<endl;
//			break;
//		case '/':
//			cout << "Division : " << n1/n2 << endl;
//			break;
//		default:
//			cout << "Error! operator is not correct" << endl;
//	}
//	return 0;
//}


//..................Looping statement...........................
//...................While loop.................................
//#include<iostream>
//using namespace std;
//int main()
//{
//	int n=10;
//	while(n>0)
//	{
//		cout << n << endl;
//		n--;
//	}
//	return 0;
//}


//..........................do while.............................
//#include<iostream>
//using namespace std;
//int main()
//{
//int n=10;
//do{
//	cout << n << endl;
//	n--;
//}while(n>0);
//return 0;
//}


//............................for loop...................................
//#include<iostream>
//using namespace std;
//int main()
//{
//	for(int n=0; n<10; n++){
//	cout << n << endl;
//	}
//	return 0;
//}


//....................nested for loop..........................
//#include<iostream>
//using namespace std;
//int main()
//{
//	int multiplier, multiplicand, product;
//	for(multiplicand=1; multiplicand<=3; multiplicand++)
//	{
//		cout << "Multiplication table for : " << multiplicand <<endl;
//		for(multiplier=1; multiplier<=10; multiplier++)
//		{
//			product = multiplicand*multiplier;
//			cout  << multiplicand << "*" << multiplier << "=" << product << endl;
//		}
//		cout<<endl;
//	}
//	return 0;
//}



//..................Jumping/Branching statements..........................
//...................break statement..................................
//#include<iostream>
//using namespace std;
//int main()
//{
//	int x=0;
//	while(x<=10){
//		cout << x << endl;
//		if(x==5)
//		break;
//		x++;
//	}
//	return 0;
//}


//..................continue statement.......................
//#include<iostream>
//using namespace std;
//int main(){
//	int i=0;
//	while (i<10){
//		i++;
//		if(i==5){
//			continue;
//		}
//		cout << i << endl;
//	}
//	return 0;
//}











