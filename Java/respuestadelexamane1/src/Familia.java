import java.util.Scanner;
public class Familia  {
	Persona Abuelo;
	Persona Abuela;
	Persona Padre;
	Persona Madre;
	Persona Hijo;
	Persona Hija;
	Persona Esposa_del_hijo;
	Persona Esposo_de_la_hija;
	Persona Nieto;
	Persona Nieta;
	
	public void agregarintegrante(Persona x, int jerarquia){
		switch(jerarquia){
		case 0:{
			Abuelo=x;
			break;
		}
		case 1:{
			Abuela=x;
			break;
		}
		case 2:{
			Padre=x;
			break;
		}
		case 3:{
			Madre=x;
			break;
		}
		case 4:{
			Hijo=x;
			break;
		}
		case 5:{
			Hija=x;
			break;
		}
		case 6:{
			Esposa_del_hijo=x;
			break;
		}
		case 7:{
			Esposo_de_la_hija=x;
			break;
		}
		case 8:{
			Nieto=x;
			break;
		}
		case 9:{
			Nieta=x;
			break;
		}
		}
	}
	public void mostrararbolfamiliar(){
		if(Abuelo!=null){
			Abuelo.mostrarPersona();}
		if(Abuela!=null){
			Abuela.mostrarPersona();
		}if(Padre!=null){
			Padre.mostrarPersona();
		}if(Madre!=null){
			Madre.mostrarPersona();
		}if(Hijo!=null){
			Hijo.mostrarPersona();
		}if(Hija!=null){
			Hija.mostrarPersona();
		}if(Esposa_del_hijo!=null){
			Esposa_del_hijo.mostrarPersona();
		}if(Esposo_de_la_hija!=null){
			Esposo_de_la_hija.mostrarPersona();
		}if(Nieto!=null){
			Nieto.mostrarPersona();
		}if(Nieta!=null){
			Nieta.mostrarPersona();
		}
			
	}

}
