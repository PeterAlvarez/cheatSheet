#include <algorithm>
#include <iostream>
#include <iterator>
#include <math.h>
using namespace std;
void pares( int a );

int main(){
    int a, b, c, d, aux=0;
    cin>>a>>b>>c>>d;
    aux = max( { a , b , c , d } );
    if (aux==a) {
        a=d;
        d=aux;
    }
    if (aux==b) {
        b=d;
        d=aux;
    }
    if (aux==c) {
        c=d;
        d=aux;
    }
    if( a>b ){
        if( a>c ){
            if( b>c ){
                cout<<d<<" "<<a<<" "<<b<<" "<<c<<endl;
            }else{
                cout<<d<<" "<<a<<" "<<c<<" "<<b<<endl;
            }
        }else {
            cout<<d<<" "<<c<<" "<<a<<" "<<b<<endl;
        }
    }else{
        if( b>c ){
            if( c>a ){
                cout<<d<<" "<<b<<" "<<c<<" "<<a<<endl;
            }else{
                cout<<d<<" "<<b<<" "<<a<<" "<<c<<endl;
            }
        }else{
            cout<<d<<" "<<c<<" "<<b<<" "<<a<<endl;
        }
    }
}
