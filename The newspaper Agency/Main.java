 #include<iostream>
using namespace std;
int main()
{
  int w,x,y,amt,profit;
  std::cin>>w;
  std::cin>>x;
  std::cin>>y;
  profit=(x*w)-(y*w);
  std::cout<<profit-100;
}