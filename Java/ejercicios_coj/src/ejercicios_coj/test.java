package ejercicios_coj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
 public static void main(String args[]){
	 Person p1=new Person("Israel","marino",12);
	 Person p2=new Person("Alex","Mamani",3);
	 Person p3=new Person("Peter","Alvarez",7);
	 Person p4=new Person("Peter","Surita",34);
	 Person p5=new Person("Alberto","Chura",12);
	 Person p6=new Person("Israel","marino",6);
	 Person v[]=new Person[6];
	 v[0]=p1;
	 v[1]=p2;
	 v[2]=p3;
	 v[3]=p4;
	 v[4]=p5;
	 v[5]=p6;
	 Arrays.sort(v);
	 for (int i=0;i<v.length;i++){
		 System.out.println(v[i]);
	 }
	 
 }
}
