#include<iostream>
using namespace std;
int main()
{
  int n,d,s,t;
  std::cin>>n;
  d=n%10;
  s=(n/1000)%10;
  t=d+s;
  std::cout<<t;
}