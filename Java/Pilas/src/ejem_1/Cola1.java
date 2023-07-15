package ejem_1;
import java.util.Scanner;
public class Cola1 {
	
	int max=20;
	String[] v=new String [max];
	int ini,fin;
	
	public void Cola1(){
		this.ini=0;
		this.fin=0;
	}
	
	public boolean esvacia( ){
		if(this.ini==0 && this.fin==0)	
			return true;
		else
			return false;
	}
	
	public boolean estaLlena(){
		if(max==fin)
			return true;
		else
			return false;
	}
	
	public void adicionar(String elem){
		if(!estaLlena()){
			fin++;
			v[fin]=elem;
		}else{
			System.out.println("cola llena");
		}
	}
	
	public void llenar(int n){
		Scanner S = new Scanner(System.in);
		for(int i=1;i<=n;i++){
			String x=S.next();
			adicionar(x);
		}
	}
	
	public String eliminar(){
		String x=null;
		if(!esvacia()){
			ini++;
			x=v[ini];
			if(ini==fin){
				ini=0;
				fin=0;
			}
		}else{
			System.out.println("cola vacia");
		}
		return x;
	}
	
	public void vaciar(Cola1 z){
		while(!z.esvacia()){
				adicionar(z.eliminar());
		}
	}
	
	public void mostrar(){
		Cola1 aux = new Cola1();
		while( !esvacia() ){
			String x=eliminar();
			System.out.println(x);
			aux.adicionar(x);
		}
		vaciar(aux);
	}
	
	public int nroelem(){
		return fin - ini;
	}	
}
