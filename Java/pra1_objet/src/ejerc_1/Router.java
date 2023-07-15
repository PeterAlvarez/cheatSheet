package ejerc_1;

public class Router {

	private String marca;
	private String ip;
	private int bytes_in;
	private int bytes_out;
	private int in_out;

	public Router(String ip) {
		this.marca = "Marca";
		this.ip = "10.100.100.80";
		this.bytes_in = 0;
		this.bytes_out = 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getBytes_in() {
		return bytes_in;
	}


	public void setBytes_in(int bytes_in) {
		this.bytes_in = bytes_in;
	}

	public int getBytes_out() {
		return bytes_out;
	}

	public void setBytes_out(int bytes_out) {
		this.bytes_out = bytes_out;
	}

	public int getIn_out() {
		return in_out;
	}

	public void setIn_out(int in_out) {
		this.in_out = in_out;
	}

	public String toString() {
		return "Marca : " + this.marca + " IP: " + this.ip + " bytes_in : " + this.bytes_in + " bytes_out : "
				+ this.bytes_out + " Trafico : "+ (this.bytes_in+this.bytes_out);
	}

}
