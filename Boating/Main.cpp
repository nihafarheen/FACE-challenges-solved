#include<iostream>
using namespace std;
int main()
{
  int w,a,c,aa,cc,d;
  std::cin>>w;
  std::cin>>a;
  std::cin>>c;
  aa=75*a;
  cc=30*c;
  d=aa+cc;
  if(d<=w)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }

}