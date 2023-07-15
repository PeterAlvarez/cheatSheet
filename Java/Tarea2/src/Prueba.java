public class Prueba {
    public static void main(String[] args) {
        Arbol arbolito = new Arbol();
        arbolito.insertar(new Persona("Giova", 22, 'M'));
        arbolito.insertar(new Persona("Andre", 14, 'M'));
        arbolito.insertar(new Persona("Rocio", 13, 'F'));
        arbolito.insertar(new Persona("Flori", 22, 'F'));
        System.out.println("Ordenado por nombre");
        arbolito.enOrden();
        arbolito.toString();
   }
}
