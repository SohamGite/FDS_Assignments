#include<iostream>
#include<string>
using namespace std;
class str
{
    string a,b,c,r,s1,s2,s3,ss;
    int i,ct,n,j,len,k;
    public:
    void length(){	
cout<<"\n\n...Length of string...\n\n";
ct=0;
cout<<"Enter string=\n";

cin>>a;
        for(i=0;a[i]!='\0';i++){
ct++;
            }
cout<<"Length of string="<<ct;
    }
    void concatination(){
cout<<"\n\n...Concatination Operation...\n\n";
cout<<"\nEnter string 1=\t";
cin>>b;
cout<<"\nEnter string 2=\t";
cin>>c;
cout<<"\nYour entered strings are=\n"<<b<<"\n"<<c;
        n=0;
        for(i=0;b[i]!='\0';i++){
            r[n]=b[i];
            n++;
        }
        for(j=0;c[j]!='\0';++j){
            r[n]=c[j];
            n++;
        }
cout<<"\nResultant string=";
        for(i=0;r[i]!='\0';i++){
cout<<r[i];
        }
    }
void  copy(){
cout<<"\n\n**...Copy operation...**\n\n";
cout<<"\nEnter string=\t";
cin>>s1;
        s2 = s1;
cout<< "Original String = "<< s1 <<endl;
cout<< "Copied String = "<< s2;
    }
    void rev(){
cout<<"*...Reverse Operation...*";
cout<<"\n\nEnter string=";
cin>>s3;
ct=0,k=0;
        for(i=0;s3[i]!='\0';i++)
        {
ct++;
        }
        for(i=ct-1;i>=0;i--,k++)
        {
            ss[k]=s3[i];
        }
cout<<"\n Reversed=";

        for(i=0;i<k;i++)
cout<<ss[i];
    }
    void comp(){
	cout<<"*...Comparing  Operation...*";
cout<<"\nEnter string 1=";
cin>>s1;
cout<<"\nEnter string 2=";
cin>>s2;
        if(s1==s2)
        {
cout<<"\nString are Same..!!";
        }
        else
        {
cout<<"\nString are not same..!!";
        }

    }
};
   int main(){
    str s;
    char ans;
    int ch;
    do

    {
cout<<"\t\tMenu\n\n";
        cout<<"1)Length\n2)Concatination\n3)Reverse\n4)Compare\n5)Copy\n\nEnter your choice\t";
cin>>ch;
        switch(ch)
        {
            case 1 :s.length(); break;
            case 2 :s.concatination();	break;
            case 3 :s.rev();	break;
            case 4 :s.comp();		break;
            case 5 :s.copy();	break;
default:cout<<"\n Wrong Selection..!!\n";
        }
cout<<"\n\n want try more operation(Y/N)=";
cin>>ans;
}while(ans=='Y'||ans=='y');
    return 0;
}
