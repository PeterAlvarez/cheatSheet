#include <iostream>
#include <math.h>
using namespace std;
void pares( int a );

int main(){
    int n ;
    float suma=0;
    cin>>n;
    for (int i=1 ; i<=n ; i++ ) {
        if ( i%2 !=0 ) {
            suma += pow( i , -2 );
        }else{
            suma += pow( i ,  2 );
        }
    }
    cout<<suma<<endl;
    pares(10);
}


void pares( int a ){
    std::cout << "hola como estas" << std::endl;
}






















// #include <iostream>
// #include <iomanip>

// using namespace std;

// int main(){
//     int f, c, x, y, cont=0;
//     float salida=0, sum=0;
//     cout<<"Ingrese filas, columnas y rangos x y"<<endl;
//     cin>>f>>c>>x>>y;
//     cout<<"Ingrese datos matriz"<<endl;
//     int vec[f][c];
//     for(int i=0 ; i<f ; i++){
//         for (int j=0 ; j<c ; j++){
//             cin>>vec[i][j];
//         }
//     }
//     for(int i=0 ; i<f ; i++){
//         for (int j=0 ; j<c ; j++){
//             if( vec[i][j]>x && vec[i][j]<y ){
//                 sum+=vec[i][j];
//                 cont+=1;
//             }
//         }
//     }
//     //imprime la matriz
//     for(int i=0 ; i<f ; i++){
//         for (int j=0 ; j<c ; j++){
//             cout<<vec[i][j]<<" ";
//         }
//         cout<<endl;
//     }

//     salida = sum/cont;
//     cout<<"salida:"<<salida<<endl;
// }










































// // #include <iostream>
// // #include <iomanip>

// // using namespace std;
// // void prueba(float a);

// // int main(){
// //     float a;
// //     cout<<"Ingrese un numero flotante"<<endl;
// //     cin>>a;
// //     prueba( a );
// //     return 0;
// // }

// // void prueba(float a){
// //     int entera=0;
// //     float decimal=0;
// //     entera = int(a);
// //     decimal = a - entera;
// //     cout<<"parte entera = "<<entera<<endl;
// //     cout<<"parte decimal = "<<decimal<<endl;
// // }






























// // #include <iostream>
// // #include <iomanip>

// // using namespace std;
// // float promedio();

// // int main(){;
// //     cout<<promedio()<<endl;
// //     return 0;
// // }

// // float promedio(){
// //     float a, b, c, pro=0;
// //     cin>>a>>b>>c;
// //     if( c<=a && c<b){
// //         pro = ( (a+b)/2 );
// //     }else if( a<=c && a<b){
// //         pro = ( (c+b)/2 );
// //     }else if( b<=c && b<a  ){
// //         pro =  ( (a+c)/2 );
// //     }
// //     return pro;
// // }
