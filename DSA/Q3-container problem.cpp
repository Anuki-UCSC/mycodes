#include <string>
#include <iostream>
#include <algorithm>

using namespace std;
int main()
{
    int n,containers;
    n=3;
   //int w[n]={1,2,3,4,5,10,11,17,18,100};
   //int w[n]={1,2,3,7,12,14,21,21};
   //int w[n]={1,2,3,4};
   //int w[n]={1,2,3,10,11,20,22,100,110,1000};
   int w[n]={1,10,25};

    sort(w, w + n);

    int i=0;
    int c=1;
    int u=0;
    containers=0;

    //cout<<w[i+c];


    while((i+c)<n+c){
    cout<<i<<" \n";
        while(u<5){
            //cout<<w[i+c]<<" ";
            if(w[i+c]==w[i]+u){
                if(w[i+c]==w[i+c+1]){
                    c++;
                    //cout<<"equal\n";
                }else{
                    //cout<<"not equal\n";
                    c++;
                    u++;
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
        //containers++;



cout<<"containers :"<<containers;
}
