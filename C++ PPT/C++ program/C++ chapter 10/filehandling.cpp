//........................create file.......................................
//#include<iostream>
//#include<fstream>
//using namespace std;
//int main(){
//	fstream filename;
//	filename.open("Kingston.txt",ios::out);
//	if(!filename){
//		cout<<"File not created"<<endl;
//	}
//	else{
//		cout<<"File created successfully"<<endl;
//		filename.close();
//	}
//	return 0;
//}




//............................write in file.................................
//#include<iostream>
//#include<fstream>
//using namespace std;
//int main(){
//	fstream filename;
//	filename.open("Kingston.txt",ios::out);
//	if(!filename){
//		cout<<"File not created"<<endl;
//	}
//	else{
//		cout<<"File created successfully"<<endl;
//		filename<<"Hi Hello, How are you?"<<endl;
//		filename.close();
//	}
//	return 0;
//}


//..........................read a file....................................
#include<iostream>
#include<fstream>
#include<string>
using namespace std;
int main(){
	fstream filename;
	filename.open("Kingston.txt",ios::in);
	string text;
	while(getline(filename,text)){
		cout<<text;
		filename.close();
	}
	return 0;
}










