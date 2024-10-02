// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

int fb(int a){
    if(a<2){
        return a;
    }
    else{
        return fb(a-1)+fb(a-2);
    }
}

int main() {
    int num;
    cin>>num;
    cout<<fb(num);
    return 0;
}
