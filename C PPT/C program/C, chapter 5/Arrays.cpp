//......................one dimensional array................................
//........................declaring uninitialized array..........................
//#include<stdio.h>
//int main(){
//	int a[5];
//	for(int i=0;i<5;i++){
//		printf("a[%d] : %d\n",i,a[i]);
//	}
//	return 0;
//}


//.....................Declaring initialized array.................................
//#include<stdio.h>
//int main(){
//	int a[5]={1,2,3,4,5};
//	for(int i=0;i<5;i++){
//		printf("a[%d] = %d\n",i,a[i]);
//	}
//	return 0;
//}


//#include<stdio.h>
//int main(){
//	int a[5]={1,2};
//	for(int i=0;i<5;i++){
//		printf("a[%d] = %d\n",i,a[i]);
//	}
//	return 0;
//}


//......................sizeofarray().....................................
//#include<stdio.h>
//int main(){
//	int a[5]={1,2,3,4,5};
//	printf("Size of array = %d",sizeof(a));
//	return 0;
//}



//.................input from keyboard in one dimensional array...............................
//#include<stdio.h>
//int main(){
//	int a[5];
//	printf("Enter 5 numbers :\n"); 
//	for(int i=0;i<5;i++){
//		scanf("%d",&a[i]);
//	}
//	for(int i=0;i<5;i++){
//		printf("\na[%d] = %d",i,a[i]);
//	}
//	return 0;
//}



//.............sum of elements one dimensional array.................................
//#include<stdio.h>
//int main(){
//	int a[5],i,sum=0;
//	printf("Enter 5 numbers :\n");
//	for(i=0;i<5;i++){
//		scanf("%d",&a[i]);
//		sum=sum+a[i];
//	}
//	printf("Sum = %d\n",sum);
//	return 0;
//}



//........................Two dimensional array..............................
//#include<stdio.h>
//int main(){
//	int a[2][4]={{1,2,3,4},{5,6,7,8}};
//	printf("Value of a[1][2] = %d\n",a[1][2]);
//	a[1][2]=24;
//	printf("Value of a[1][2] = %d\n\n",a[1][2]);
//	for(int i=0;i<2;i++){
//		for(int j=0;j<4;j++){
//			printf("a[%d][%d] = %d\n",i,j,a[i][j]);
//		}
//	}
//	return 0;
//}


//.......................matrix addition................................
//#include<stdio.h>
//int main(){
//	int m,n,i,j,a[10][10],b[10][10],sum[10][10];
//	printf("Enter row and column : ");
//	scanf("%d %d",&m,&n);
//	printf("Enter first matrix :\n");
//	for(i=0;i<m;i++){
//		for(j=0;j<n;j++){
//			scanf("%d",&a[i][j]);
//		}
//	}
//	printf("Enter second matrix :\n");
//	for(i=0;i<m;i++){
//		for(j=0;j<n;j++){
//			scanf("%d",&b[i][j]);
//		}
//	}
//	for(i=0;i<m;i++){
//		for(j=0;j<n;j++){
//			sum[i][j]=a[i][j]+b[i][j];
//		}
//	}
//	printf("Sum of matrixes : \n");
//	for(i=0;i<m;i++){
//		for(j=0;j<n;j++){
//			printf("%d\t",sum[i][j]);
//		}
//		printf("\n");
//	}
//	return 0;
//}




















