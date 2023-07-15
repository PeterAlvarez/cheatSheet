package code_1;

import java.util.Scanner;

public class code_1 {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int N = S.nextInt();
        for (int i = 0; i < N; i++) {
            String W = S.next();
            String H = W;
            boolean u=true;
            for(int k=0 , j=W.length()-1 ; k<W.length();k++,j--){
                if(H.charAt(k)!=W.charAt(j)){
                    u=false;
                }
            }
            if(u==true){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
                System.out.println("hola");
        }
    }
}
//var N = parseInt(readline());
//var inputs = readline().split(' ');
//s=0
//for (var i = 0; i < N; i++) {
//    var X = parseInt(inputs[i]);
//    s+=X
//}
//print(s/N)


//}
//prnt(s/N)
