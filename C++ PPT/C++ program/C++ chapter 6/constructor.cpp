//............default constructors...............
//#include<iostream>
//using namespace std;
//class Student{
//	public:
//		Student(){
//			cout<<"This is default constructor"<<endl;
//	}
//		void display(){
//			cout<<"This is normal function"<<endl;
//	}	
//};
//int main(){
//	Student s;
//	s.display();
//	return 0;
//}


//...............parametrized construtors............
//#include<iostream>
//#include<string.h>
//using namespace std;
//class Student{
//	public:
//		string name;
//		int rollNumber;		
//	Student(string name,int rollNumber){
//		name=name;
//		rollNumber=rollNumber;
//		cout<<"Student name is : "<<name<<endl;
//		cout<<"Student RollNumber is : "<<rollNumber<<endl;
//	}
//	void display(){
//		cout<<"This is normal function"<<endl;
//	}	
//};
//int main(){
//	Student s("Anu",12);
//	s.display();
//	return 0;
//}
//........copy constructors............
//#include<iostream>
//#include<string.h>
//using namespace std;
//class Student{
//	public:
//		string name;
//		int rollNumber;
//		
//	Student(string name, int rollNumber){
//		name=name;
//		rollNumber=rollNumber;
//		cout<<"Student name is : "<<name<<endl;
//		cout<<"Student RollNumber is : "<<rollNumber<<endl;
//	}
//	Student(Student &stu){
//		name=stu.name;
//		rollNumber=stu.rollNumber;
//	}	
//};
//int main(){
//	Student s("Reno",12);
//	Student r(s);   
//	return 0;
//}
//.............constructor overloading........not come....
//#include<iostream>
//#include<string.h>
//using namespace std;
//class Student{
//	public:
//		string name;
//		int rollNumber;
//		float totalMark;
//		
//	Student(string name, int rollNumber){
//		name=name;
//		rollNumber=rollNumber;
//		cout<<"Student name is:"<<name<<endl;
//		cout<<"Student RollNumber is:"<<rollNumber<<endl;
//	}
//	Student(string name, int rollNumber,float totalMark){
//	    name=name;
//		rollNumber=rollNumber;
//		totalMark=totalMark;
//		cout<<"Student name is:"<<name<<endl;
//		cout<<"Student RollNumber is:"<<rollNumber<<endl;
//		cout<<"student TotalMark is:"<<totalMark<<endl;	
//		
//	}	
//};
//int main(){
//	Student s("Reno",12);
//	Student r("shalini",34,416.00);
//   
//	return 0;
//}
