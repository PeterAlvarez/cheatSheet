package ejercicios_coj;

import java.util.Arrays;

class Person  implements Comparable<Person>{
	String name;
	String ap;
	Integer age;
	Person(){
		
	}
	Person(String nm,String ap){
		name=nm;
		this.ap=ap;
		age=null;
	}
	Person(String nm,String ap,Integer age){
		name=nm;
		this.ap=ap;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAp() {
		return ap;
	}
	public void setAp(String ap) {
		this.ap = ap;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Person person2) {
		if(this.name.compareTo( person2.getName() )<0){
			return -1;
		}
		if(this.name.compareTo( person2.getName() )==0){
			if( this.ap.compareTo( person2.getAp() ) < 0){
				return -1;
			}
			if( this.ap.compareTo( person2.getAp() ) == 0)
				return this.age < person2.getAge()?-1:1;
			
		}
			
		return 1;
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+ap+" "+age  ;
	}
	
	
	
}
