#include<iostream>
using namespace std;
int main()
{
    int i,n,fact=1;
    cin>>n;
    for(i=n;i>0;i--)
    {
      fact=fact*i;  
    }
    cout<<fact;
    return 0;
}
