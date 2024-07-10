//........................define member function................................
//#include<iostream>
//using namespace std;
//class Display{
//	public:
//		void display(){
//			cout << "Hello World" << endl;
//		}
//};
//int main(){
//	Display d, d1;
//	d.display();
//	d1.display();
//	return 0;
//}




//.......................define data member...........................
//#include<iostream>
//using namespace std;
//class Display{
//	public:
//		int a, b, c;
//};
//int main(){
//	Display d;
//	cout << "Enter two numbers" << endl;
//	cin >> d.a >> d.b;
//	d.c = d.a+d.b;
//	cout <<"Sum = " << d.c;
//	return 0;
//}



//.........................define data member and member function........................
//#include<iostream>
//using namespace std;
//class Display{
//	private:
//		int a, b;
//	public:
//		void get(){
//			cout << "Enter two values : " << endl;
//			cin >> a >> b;
//		}
//		void put(){
//			cout << "A = " << a << endl;
//			cout << "B = " << b << endl;
//			cout << "Product = " << a*b;
//		}
//};
//int main(){
//	Display d;
//	d.get();
//	d.put();
//	return 0;
//}



//..............define member function out side the class..............................
//#include<iostream>
//using namespace std;
//class Sample{
//	public:
//		int n;
//		void get();
//		void put();
//};
//void Sample::get(){
//	cout << "Enter the value : ";
//	cin >> n;
//}
//void Sample::put(){
//	cout << "N = " << n;
//}
//int main(){
//	Sample s;
//	s.get();
//	s.put();
//	return 0;
//}



//.........................friend function................................
//#include<iostream>
//using namespace std;
//class Stud{
//	private:
//		int no, m1, m2;
//		string name;
//		public:
//			void getData();
//			friend void showData(Stud);
//};
//void Stud::getData(){
//	cout << "Enter Name and Number : " << endl;
//	cin >> name >> no;
//	cout << "Enter marks : " << endl;
//	cin >> m1 >> m2;
//}
//void showData(Stud s){
//	cout << "Name : " << s.name << endl;
//	cout << "No : " << s.no << endl;
//	cout << "Mark 1 : " << s.m1 << endl;
//	cout << "Mark 2 : " << s.m2 << endl;
//}
//int main(){
//	Stud s1;
//	s1.getData();
//	showData(s1);
//	return 0;
//}



//...........................friend class.............................
//#include<iostream>
//using namespace std;
//class Emp{
//		int eno;
//		string name;
//	private:
//		friend class sal;
//};
//class sal{
//		int sal;
//	public:
//		Emp d;
//		void input(){
//			cout << "Enter the Emp no : ";
//			cin >> d.eno;
//			cout << "Enter Emp name : ";
//			cin >> d.name;
//			cout << "Enter Emp salary : ";
//			cin >> sal;
//		}
//		void output(){
//			cout << "Emp no : " << d.eno << endl;
//			cout << "Emp name : " << d.name << endl;
//			cout << "Emp salary : " << sal << endl;
//		}
//};
//int main(){
//	sal s;
//	s.input();
//	s.output();
//	return 0;
//}











