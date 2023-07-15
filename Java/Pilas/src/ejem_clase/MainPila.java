package ejem_clase;

import java.util.Scanner; 
public class MainPila 
{
    public static SPila Pila;
     
    public static void main(String[] ARGUMENTOS)
    {    
        int MAX;
        Scanner tec = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DE LA PILA :: ");
        MAX = tec.nextInt();  
        Pila = new SPila(MAX);
        MenuPila();
    }
     
    public static void MenuPila(){
    	
        int Opcion;
        Scanner tec = new Scanner(System.in);
        
        do
        {
            
            System.out.printf(
                    "1. INGRESAR DATOS\n"+
                    "2. ELIMINAR DATOS\n"+
                    "3. OBSERVAR DATOS\n"+
                    "4. VACIAR PILA\n"+
                    "5. SALIR\n"+
                    "--------------------------------------------------------\n");
            Opcion = tec.nextInt();  
             
            switch(Opcion)
            {
                case 1: Pila.InsertarPila();break;
                case 2: Pila.EliminarPila();break;
                case 3: Pila.MostrarPila();break;
                case 4: Pila.VaciarPila();break;
                case 5: System.exit(0);break;
                default: System.out.println("INGRESE UNA OPCION VALIDA \n");break;
            }
        }while(true); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 5
    }
}