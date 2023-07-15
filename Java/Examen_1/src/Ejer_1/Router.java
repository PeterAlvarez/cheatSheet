package Ejer_1;
public class Router {
	private String marca;
	private String ip;
	private int bytes_in;
	private int bytes_out;
	private int in_out;

	public Router( String ip ){
		this.marca = "Marca";
		this.ip = "10.100.100.80";
		this.bytes_in = 0;
		this.bytes_out = 0;
	}
	public void setIp( String ip ) {
		this.ip = ip;
	}
	public int getBytes_in() {
		return bytes_in;
	}
	public void setBytes_in( int bytes_in ) {
		this.bytes_in = bytes_in;
	}
	public int getBytes_out() {
		return bytes_out;
	}

	public void setBytes_out( int bytes_out ) {
		this.bytes_out = bytes_out;
	}
	
	public int getIn_out() {
		return in_out;
	}

	public void setIn_out( int in , int out ) {
		this.in_out = in + out;
	}

	public String toString(){
		return "Marca : "+this.marca+" IP: "+this.ip+" bytes_in : "+this.bytes_in+" bytes_out : "+this.bytes_out+ " Trafico "+this.in_out;
	}
}



