package Hola_mundo_objeto;

public class Oficina {

private boolean  puerta , cerrojo , persona ;
	
	public void setpuerta(boolean puerta){
		this.puerta = puerta;
	}
	
	public String getpuerta(){
		if(puerta == true){
			return "cerrado";
		}else{
			return "abierto";
		}
	}
	
	public void setcerrojo(boolean cerrojo){
		this.cerrojo = cerrojo;
	}
	
	public String getcerrojo(){
		if(cerrojo == true){
			return "cerrado";
		}else{
			return "abierto";
		}
	}
	
	public void setpersona(boolean persona){
		this.persona = persona;
	}
	
	public String getpersona(){
		if(persona == true){
			return "afuera";
		}else{
			return "adentro";
		}
		
	}
	
}
