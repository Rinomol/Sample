//..................................structure.................................
//#include<stdio.h>
//#include<string.h>
//struct employee{
//	int id;
//	char name[10];
//}e1;
//int main(){
//	e1.id=1;
////	e1.name="Iniya";// it dose not store value
//	strcpy(e1.name,"Thamarai");
//	printf("ID : %d\n",e1.id);
//	printf("NAME : %s",e1.name);
//	return 0;
//}


//#include<stdio.h>
//struct Emp{
//	int id;
//	char name[10];
//}e1;
//int main(){
//	printf("Enter id number : ");
//	scanf("%d",&e1.id);
//	printf("Enter name : ");
//	scanf("%s",&e1.name);
//	printf("ID = %d\nNAME = %s\n",e1.id,e1.name);
//	return 0;
//}


//.........................taking 2 structure variable.........................
//#include<stdio.h>
//#include<string.h>
//struct employee{
//	int id;
//	char name[10];
//	float salary;
//}e1,e2;
//int main(){
//	e1.id=1;
//	strcpy(e1.name,"Roja");
//	e1.salary=50000;
//	
//	e2.id=2;
//	strcpy(e2.name,"Thamarai");
//	e2.salary=30000;
//	
//	printf("First Employee Details are : \n");
//	printf("ID : %d\nNAME : %s\nSALARY : %f\n",e1.id,e1.name,e1.salary);
//	printf("\n");
//	printf("Second Employee Details are : \n");
//	printf("ID : %d\nNAME : %s\nSALARY : %f",e2.id,e2.name,e2.salary);
//	return 0;
//}



//..............................Array of structure.............................
//#include<stdio.h>
//struct employee{
//	int id;
//	char name[10];
//	float salary;
//};
//int main(){
//	struct employee em[5];
//	printf("Enter 3 records of employee :- \n");
//	for(int i=0;i<3;i++){
//		printf("Enter id : ");
//		scanf("%d",&em[i].id);
//		printf("Enter name : ");
//		scanf("%s",&em[i].name);
//		printf("Enter salary : ");
//		scanf("%f",&em[i].salary);
//		printf("\n");
//	}
//	printf("Employee information :- \n");
//	for(int i=0;i<3;i++){
//		printf("ID : %d\nNAME : %s\nSALARY : %f",em[i].id,em[i].name,em[i].salary);
//		printf("\n");
//	}
//	return 0;
//}


//.............................Nested structure..................................
//#include<stdio.h>
//#include<string.h>
//struct employee{
//	int id;
//	char name[20];
//	struct birth{
//		int dd;
//		int mm;
//		int yyyy;
//	}dob;
//}e1;
//int main(){
//	e1.id=101;
//	strcpy(e1.name,"Roja");
//	e1.dob.dd=20;
//	e1.dob.mm=11;
//	e1.dob.yyyy=2014;
//	printf("Employee id : %d\n",e1.id);
//	printf("Employee name : %s\n",e1.name);
//	printf("Employee date of joining (dd/mm/yyyy) : %d/%d/%d\n",e1.dob.dd,e1.dob.mm,e1.dob.yyyy);
//	return 0;
//}


//.....................structure to function....................................
//#include<stdio.h>
//struct student{
//	int id;
//	char name[20];
//}s1;
//void display(struct student s);
//int main(){
//	printf("Enter Id : ");
//	scanf("%d",&s1.id);
//	printf("Enter Name : ");
//	scanf("%s",&s1.name);
//	display(s1);
//	return 0;
//}
//void display(struct student s){
//	printf("Id : %d\n",s.id);
//	printf("Name : %s\n",s.name);
//}



//...................difference b/w structure and union........................
//........................difference in size...............................
//#include<stdio.h>
//struct student{
//	int a;
//	char b;
//	double c;
//}s1;
//union stud{
//	char b;
//	int a;
//	double c;
//}s2;
//int main(){
//	printf("Size of struct : %d\n",sizeof(s1));
//	printf("Size of union : %d",sizeof(s2));
//	return 0;
//}	


//.............................difference in mry address......................
//#include<stdio.h>
//#include<string.h>
//struct student{
//	int id;
//	char name[30];
//}s1;
//union stud{
//	int id;
//	char name[30];
//}s2;
//int main(){
//	s1.id=101;
//	strcpy(s1.name,"Roja");
//	s2.id=102;
//	strcpy(s2.name,"Ramya");
//	printf("Structure :- \n");
//	printf("%p\n",&s1.id);
//	printf("%p\n",&s1.name);
//	printf("Union :- \n");
//	printf("%p\n",&s2.id);
//	printf("%p\n",&s2.name);
//	return 0;
//}












