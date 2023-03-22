#include <iostream>
#include <math.h>
using namespace std;

int main(){

    int num, aux, i, tam, out=0;
    cin>>tam;

    while(tam != 0) {
        aux =tam%10;
        tam /= 10;
        cout<<aux<<" => Cuadrado => "<<aux*aux<<endl;
        cout<<aux<<" => Cubo => "<<aux*aux*aux<<endl;
    }
}

