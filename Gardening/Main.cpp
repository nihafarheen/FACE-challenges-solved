#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r;
  std::cin>>c;
  std::cin>>n;
  
  if(n%c==0 && n%r==0 &&n<r*c)
  {
    std::cout<<"It is a mango tree";
  }
  else
  {
    std::cout<<"It is not a mango tree";}
    
}