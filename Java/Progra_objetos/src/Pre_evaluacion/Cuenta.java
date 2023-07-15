package Pre_evaluacion;

public class Cuenta {
	
	private String titular;
	private String cantidad;
	
	public Cuenta( String titular , String cantidad ) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular( String titular ) {
		this.titular = titular;
	}
	
	public String getCantidad() {
		return cantidad;
	}
	
	public void setCantidad( String cantidad ) {
		this.cantidad = cantidad;
	}
}
