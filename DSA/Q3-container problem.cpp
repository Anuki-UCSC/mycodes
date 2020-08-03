#include <string>
#include <iostream>
#include <algorithm>

using namespace std;
int main()
{
    int n,containers;
    n=10;
   //int w[n]={1,2,3,4,5,10,11,17,18,100};  // answer=4
   //int w[n]={1,2,3,7,12,14,21,21};    // answer=4
   //int w[n]={1,2,3,4};  // answer=1
   int w[n]={1,2,3,10,11,20,22,100,110,1000};   // answer=6
   //int w[n]={1,10,5,5,3,7,2,1,3,7,10,11};   // answer=3
   //int w[n]={1,10,25};  // answer=3

    sort(w, w + n);

    int i=0;
    int c=1;
    int u=0;
    containers=0;
    while((i+c)<n+c){
    cout<<i<<" \n";
        while(u<5&c<5){
            if(w[i+c]==w[i]+u){
                if(w[i+c]==w[i+c+1]){
                    c++;
                }else{
                    c++;u++;
                }
            }else{
                u++;
            }
        }
        cout<<"\n";
            i=i+c;
            u=0;
            c=1;
            containers++;
        }
     
cout<<"containers :"<<containers;
}
