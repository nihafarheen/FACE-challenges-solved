#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  int r;
  std::cin>>n;
  if(n<=200)
  {
    r=n*0.5;
  }
  else if(n>200 && n<=400)
  {
    r=(0.65*n)+100;
  }
  else if(n>400 && n<=600)
  {
    r=(0.80*n)+200;
  }
  else if(n>600)
  {
    r=(1.25*n)+ 425;
  }
 std::cout<<"Rs."<<r;
}
