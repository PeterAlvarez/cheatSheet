public class test {
    public static void main(String arg[]){
        Persona p1 =new Persona("Israel","Marino",20);
        Persona p2 =new Persona("Valentin","Marino",60);
        Persona p3 =new Persona("jualio","Marino",60);
        Persona p4 =new Persona("carlos","Marino",70);
        Persona p5 =new Persona("Brayan","Marino",80);
        Persona p6 =new Persona("Teofilo","Marino",100);
        Persona p7 =new Persona("Juan","Marino",150);

        p1.antecesor= p2;
        p2.antecesor= p3;
        p1.mostrar(p2);

    }
}
