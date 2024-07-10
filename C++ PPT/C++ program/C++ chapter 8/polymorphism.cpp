//......................function overloading.................................
//#include<iostream>
//using namespace std;
//class Addition{
//	public:
//		void sum(int a,int b){
//			cout<<"Addition of two number is:"<<a+b<<endl;
//		}
//		void sum(int a,int b,int c){
//			cout<<"Addition of three number is:"<<a+b+c<<endl;
//		}
//};
//int main(){
//	Addition add;
//	add.sum(2,5);
//	add.sum(3,5,7);
//	return 0;
//}



//..........................operator overloading.............................
//#include<iostream>
//using namespace std;
//class Space{
//	int x,y,z;
//	public:
//		void getData(){
//			cout<<"Enter 3 numbers"<<endl;
//			cin>>x>>y>>z;
//		}
//		void display(){
//			cout<<"x = "<<x<<endl;
//			cout<<"x = "<<x<<endl;
//			cout<<"x = "<<x<<endl;
//		}
//		void operator +(){
//			x=-x;
//			y=-y;
//			z=-z;
//		}
//};
//int main(){
//	Space s;
//	s.getData();
//	+s;
//	s.display();
//	return 0;
//}


//..........................virtual function...............................
//.....................with virtual function................................
//#include<iostream>
//using namespace std;
//class A{
//	public:
//		virtual void show(){
//			cout<<"Content of base class"<<endl;
//		}
//};
//class B:public A{
//	public:
//		void show(){
//			cout<<"Content of derived class"<<endl;
//		}
//};
//int main(){
//	A *bptr;
//	B b;
//	bptr=&b;
//	bptr->show();
//	return 0;
//}



//.......................
//#include<iostream>
//using namespace std;
//class A{
//	public:
//		void show(){
//			cout<<"Content of base class"<<endl;
//		}
//};
//class B:public A{
//	public:
//		void show(){
//			cout<<"Content of derived class"<<endl;
//		}
//};
//int main(){
//	A *bptr;
//	B b;
//	bptr=&b;
//	bptr->show();
//	return 0;
//}

