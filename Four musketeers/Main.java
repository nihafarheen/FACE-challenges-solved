#include<iostream>
using namespace std;
int main()
{
  int x1,y1,x2,y2,x3,y3;
  float m,d;
  std::cin>>x1;
  std::cin>>y1;
  std::cin>>x2;
  std::cin>>y2;
  std::cin>>x3;
  std::cin>>y3;
  m=(x1+x2+x3)/3.0;
  d=(y1+y2+y3)/3.0;
  std::cout<<m<<"\n";
  std::cout<<d;
}