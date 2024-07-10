//.......................single inheritance............................
//#include<iostream>
//#include<string.h>
//using namespace std;
//class Programmer{
//	public:
//		string id;
//        string name;
//        string age;
//        
//		Programmer(string id,string name,string age){
//        	id=id;
//        	name=name;
//        	age=age;
//        	cout<<"Id is:"<<id<<endl;
//        	cout<<"Name is:"<<name<<endl;
//        	cout<<"Age is:"<<age<<endl;        	
//		}
//};
//class Employee:public Programmer{
//	public:
//		string salary;
//		
//		Employee(string id,string name,string age,string salary):Programmer(id,name,age){			
//			salary=salary;
//			cout<<"Salary is:"<<salary<<endl;			
//		}
//};
//int main(){
//	Employee e("1","shalini","23","34567");
//	return 0;		
//}



//................................Multilevel...........................
//#include<iostream>
//#include<string.h>
//using namespace std;
//class Programmer{
//	public:
//		string id;
//        string name;
//        string age;
//        
//		Programmer(string id,string name,string age){
//        	id=id;
//        	name=name;
//        	age=age;
//        	cout<<"Id is:"<<id<<endl;
//        	cout<<"Name is:"<<name<<endl;
//        	cout<<"Age is:"<<age<<endl;        	
//	}
//};
//class Employee:public Programmer{
//	public:
//		string salary;
//		
//		Employee(string id,string name,string age,string salary):Programmer(id,name,age){			
//			salary=salary;
//			cout<<"Salary is:"<<salary<<endl;			
//		}
//};
//class TeamLeader:public Employee{
//	public:
//		string experience;
//		TeamLeader(string id,string name,string age,string salary,string experience):Employee(id,name,age,salary){
//		experience=experience;
//		cout<<"Experience is:"<<experience<<endl;
//	}
//};
//int main(){
//	TeamLeader t("1","shalini","23","34567","5");
//	return 0;		
//	}
	


//................................Hierarichal.................................
//#include<iostream>
//#include<string.h>
//using namespace std;
//class Programmer{
//	public:
//		string id;
//        string name;
//        string age;
//        
//		Programmer(string id,string name,string age){
//        	id=id;
//        	name=name;
//        	age=age;
//        	cout<<"Id is:"<<id<<endl;
//        	cout<<"Name is:"<<name<<endl;
//        	cout<<"Age is:"<<age<<endl;       	
//	}
//};
//class Employee:public Programmer{
//	public:
//		string salary;
//		
//		Employee(string id,string name,string age,string salary):Programmer(id,name,age){			
//			salary=salary;
//			cout<<"Salary is:"<<salary<<endl;			
//	}
//};
//class TeamLeader:public Programmer{
//	public:
//		string experience;
//		TeamLeader(string id,string name,string age,string experience):Programmer(id,name,age){
//		experience=experience;
//		cout<<"Experience is:"<<experience<<endl;
//	}
//};
//int main(){
//	Employee e("1","shalini","23","34567");	
//	cout<<endl;
//	TeamLeader t("1","shalini","23","5");
//	return 0;	
//}
	


//.......................................Multiple.....................................
//#include<iostream>
//#include<string.h>
//using namespace std;
//class Programmer{
//	public:
//		string id;
//        string name;
//        string age;
        
//		Programmer(string id,string name,string age){
//        	id=id;
//        	name=name;
//        	age=age;
//        	cout<<"Id is:"<<id<<endl;
//        	cout<<"Name is:"<<name<<endl;
//        	cout<<"Age is:"<<age<<endl;        	
//	}
//};
//class Employee{
//	public:
//		string salary;
//		
//		Employee(string salary){			
//			salary=salary;
//			cout<<"Salary is:"<<salary<<endl;			
//	}
//};
//class TeamLeader:public Programmer, public Employee{
//	public:
//		string experience;
//		
//		TeamLeader(string id,string name,string age,string salary,string experience):Programmer(id,name,age),Employee(salary){
//			experience=experience;
//			cout<<"Experience is:"<<experience<<endl;
//	}
//};
//int main(){
//	TeamLeader t("1","shalini","23","50000","5");
//	return 0;	
//}



//..............................Hybrid...................................
//#include<iostream>
//#include<string.h>
//using namespace std;
//class Programmer{
//		public:
//		string id;
//        string name;
//        string age;
//        
//		Programmer(string id,string name,string age){
//        	id=id;
//        	name=name;
//        	age=age;
//        	cout<<"Id is:"<<id<<endl;
//        	cout<<"Name is:"<<name<<endl;
//        	cout<<"Age is:"<<age<<endl;       	
//	}
//};
//class Employee{
//		public:
//		string salary;
//		
//		Employee(string salary){			
//			salary=salary;
//			cout<<"Salary is:"<<salary<<endl;			
//	}
//};
//class TeamLeader:public Programmer, public Employee{
//	public:
//		string experience;
//		
//		TeamLeader(string id,string name,string age,string salary,string experience):Programmer(id,name,age),Employee(salary){
//		experience=experience;
//		cout<<"Experience is:"<<experience<<endl;
//	}
//};
//class Manager:public TeamLeader{
//	public:
//		string designation;
//		
//		Manager(string id,string name,string age,string salary, string experience, string designation):TeamLeader(id,name,age,salary,experience){
//			designation=designation;
//			cout<<"Designation is : "<<designation<<endl;
//		}
//};
//int main(){
//	Manager m("1","shalini","23","50000","5","manager");
//	return 0;	
//}


	
