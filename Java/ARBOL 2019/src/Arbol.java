package ARBOL;

public class Arbol {
    NodoBinario Raiz;
    public Arbol() {
        Raiz = null;
    }

    public void insertaNodo(int elem) {
        if ( Raiz == null ) {
            Raiz = new NodoBinario(elem);
            System.out.println("Raiz: " + Raiz.dat);
        } else {
            Raiz.insertaBinario(elem);
        }
    }

    public void PreOrden(NodoBinario nodo) {
        if (nodo == null) {
            return;
        } else {
            System.out.print(nodo.dat + " ");
            PreOrden(nodo.Hizq);
            PreOrden(nodo.Hder);
        }
    }

    public void inOrden(NodoBinario nodo) {
        if(nodo == null) {
            return;
        }
        else {
            PreOrden(nodo.Hizq);
            System.out.print(nodo.dat+ " ");
            PreOrden(nodo.Hder);

        }
    }

    public int Altura(NodoBinario nodo) {
        //	int Altder=(nodo.Hder==null? 0:1+Altura(nodo.Hder));
        //		int Altiz=(nodo.Hizq==null? 0:1+Altura(nodo.Hizq));
        int Altder,Altiz;
        if(nodo.Hder==null)
        Altder=0;
        else
        Altder=1+Altura(nodo.Hder);
        if(nodo.Hizq==null)
        Altiz=0;
        else
        Altiz=1+Altura(nodo.Hizq);
        return Math.max(Altder, Altiz);
    }

    public void Buscar(NodoBinario nodo, int num) {
        if (nodo == null) {
            System.out.println("No encontrado");
        } else if (num == nodo.dat)
        System.out.println("encontrado: " + nodo.dat);
        else if (num > nodo.dat)
        Buscar(nodo.Hder, num);
        else
        Buscar(nodo.Hizq, num);

    }

    public int ContarHijos(NodoBinario nodo) {
        if(nodo==null)
        return 0;
        else {
            if(nodo.Hder==null && nodo.Hizq==null)
            return 1;
            else {
                return ContarHijos(nodo.Hder)+ContarHijos(nodo.Hizq);
            }
        }
    }

    public void balanceado(NodoBinario nodo) {
        if (nodo.Hizq == null && nodo.Hder == null)
        System.out.println("ARBOL");
        else {
            this.ContarHijos(nodo.Hizq);
            if (this.ContarHijos(nodo.Hizq) > this.ContarHijos(nodo.Hder))
            System.out.println("ARBOL NO BALANCEADO");
            else {
                if (this.ContarHijos(nodo.Hizq) < this.ContarHijos(nodo.Hder))
                System.out.println("ARBOL NO BALANCEADO");
                else
                System.out.println("ARBOL  BALANCEADO");
            }
        }

    }

}
