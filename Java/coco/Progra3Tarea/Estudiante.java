
public class Estudiante{

    private String nombre, aPaterno, aMaterno;
    private boolean covid;

    public Estudiante(String nombre, String aPaterno, String aMaterno, boolean covid) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.covid = covid;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getCovid() {
        return this.covid;
    }


}

