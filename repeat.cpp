#include<iostream>
using namespace std;
int main()
{
    int i,j,n,a[100];
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n-1;j++)
       {
        if(a[i]==a[j])
        cout<<a[i]<<"\t";
        else
        continue;
       }
    }
    return 0;
}



