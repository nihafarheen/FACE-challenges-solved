#include<iostream>
using namespace std;
int main()
{
  int p,r,n;
  float i,amt,dis,s;
  std::cin>>p;
  std::cin>>r;
  std::cin>>n;
  i=(p*n*r)/100;
  amt=p+i;
  dis=(i*2.0)/100.0;
  s=amt-dis;
  std::cout<<i<<"\n"<<amt<<"\n"<<dis<<"\n"<<s;
}