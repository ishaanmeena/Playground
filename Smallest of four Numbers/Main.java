#include<bits/stdc++.h>

using namespace std;

int main()
{
  int static n=1;
  map<int,int> m;
  map<int,int>::iterator itr;
  for(int i=1;i<=4;i++)
  {
    int v;
    cin>>v;
    m.insert(pair<int,int>(v,n));
    n = n+1;
  }
  for(itr=m.begin();itr!=m.end();itr++)
  {
      cout<<itr->first;
      break;
  }
  return 0;
}
