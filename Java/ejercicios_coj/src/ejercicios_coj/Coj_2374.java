package ejercicios_coj;

import java.io.*;
import java.util.*;

public class Coj_2374{
public static void main(String [] args) throws IOException{
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a, x, y;
        StringTokenizer b;
        int min, max;
     
            a = br.readLine();
            b = new StringTokenizer(a);
            
            x = b.nextToken();
            y = b.nextToken();
            
            x = x.replaceAll("6", "5");
            y = y.replaceAll("6", "5");
            min = Integer.valueOf(x) + Integer.valueOf(y);
            
            x = x.replaceAll("5", "6");
            y = y.replaceAll("5", "6");
            max = Integer.valueOf(x) + Integer.valueOf(y);
            System.out.println(min+" "+max);
                
        

}
}
