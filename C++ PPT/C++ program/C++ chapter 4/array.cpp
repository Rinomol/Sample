//.........................example pg............................................
//#include<iostream>
//using namespace std;
//int main()
//{
//		int x[5] = {2, 4, 5, 6, 8};
//		cout << x[0]  << endl;
//		cout << x[1]  << endl;
//		return 0;
//}



//.........................Declaring uninitialized array..............................
//#include<iostream>
//using namespace std;
//int main()
//{
//	int arr[5];
//	int i;
//	for(i=0; i<=4; i++){
//		cout << arr[i] << endl;
//	}
//	return 0;
//}



//.........................Declaring initialized array............................
//#include<iostream>
//using namespace std;
//int main(){
//	int arr[5] = {0};
//	int i;
//	for(i=0; i<=4; i++){
//		cout << arr[i] << endl;
//	}
//	return 0;
//}

//........................................................................
//#include<iostream>
//using namespace std;
//int main(){
//	int arr[5] = {1,2};
//	int i;
//	for(i=0; i<=4; i++){
//		cout << arr[i] << endl;
//	}
//	return 0;
//}

//.......................................................................
//#include<iostream>
//using namespace std;
//int main(){
//	int arr[5] = {1, 2, 3, 4, 5};
//	cout << "Size of array : " << sizeof(arr);
//	return 0;
//}



//............................one dimensional array................................
//#include<iostream>
//using namespace std;
//int main(){
//	int arr[5] = {1, 2, 3, 4, 5}; 
//	int i, sum =0;
//	for(i=0; i<=4; i++){
//		cout << arr[i]<< endl;
//		sum = sum + arr[i];
//	}
//	cout << "Sum " << sum;
//	return 0;
//}


//...................one dimension user input...............................
//#include<iostream>
//using namespace std;
//int main(){
//	int arr[5]; 
//	int i, num;
//	cout << "Enter number" << endl;
//	cin >> num;
//	cout << "Enter values : " << endl;
//	for(i=0; i<num; i++){
//		cin >> arr[i];		
//	}
//	cout << "Elements are" << endl ;
//	for(i=0; i<num; i++){
//		cout << arr[i] << endl;		
//	}	
//	return 0;
//}



//................................two dimensional array........................
//#include<iostream>
//#include<conio.h>
//using namespace std;
//int main(){
//	int i, j, a[10][10], b[10][10], d[10][10], r, c;
//	{
//	cout<<"Enter the rows and columns value"<<endl;
//	cin >> r >> c;
//	cout<<"enter the first matrix value\n";
//	for(i=0;i<r;i++){
//		for(j=0;j<c;j++){
//			cin >> a[i][j];
//		}
//	}
//	cout<<"Enter the second matrix value\n";
//	for(i=0;i<r;i++){
//		for(j=0;j<c;j++){
//			cin >> b[i][j];
//		}
//	}
//	cout<<"The addition matrix is\n";
//	for(i=0;i<r;i++){
//		for(j=0;j<r;j++){
//			d[i][j] = a[i][j]+b[i][j];
//			cout << d[i][j] << "\t";
//			}
//		cout << endl;
//		}
//	}
//	getch();
//	return 0;
//}





