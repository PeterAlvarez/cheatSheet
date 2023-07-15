public class Principal {
    public static void main(String[] args) {

        Persona Abuelo = new Abuelo("Tomas", "Garcia",60);
        Persona Abuela = new Abuelo("Ana", "Lopez",57);
        Persona Padre = new Padres("Cosme", "Fulanito",40);
        Persona Madre = new Padres("Anastasi", "Fulanita",39);
        Persona Hija = new Hijos("Tux","Prex",20);
        Persona hijo = new Hijos("Peter", "Alvarez", 23);

        Familia  Alvarez = new Familia(Abuelo, Abuela, Padre, Madre, Hija);
        Alvarez.agregarIntegrante(hijo);


        System.out.println(Alvarez.mostrarFamilia());


    }
}
