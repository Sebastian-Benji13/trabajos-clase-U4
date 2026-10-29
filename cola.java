public class  cola {

    private static class Nodo {
    int dato;
    Nodo siguiente;
    Nodo(int dato) { this.dato = dato; this.siguiente=null;}
}

private Nodo frente;
private Nodo fin;

public cola() { this.frente = null; this.fin = null;}
public boolean estaVacia() {return frente == null; }

public void encolar(int dato) {
    Nodo nuevo = new Nodo(dato);
    if (estaVacia()){
        frente = nuevo;
        fin    = nuevo;
        return ;
    }
    fin.siguiente = nuevo;
    fin=nuevo;
}
public int desencolar(){
    if(estaVacia()) throw new IllegalStateException("La cola esta vacia");
    return frente.dato;
}

public int verFrente() {
    if(estaVacia()) throw new IllegalStateException("La cola esta vacia");
    return  frente.dato;
}

public int tamaño(){
    int contador = 0;
    Nodo actual = frente;
    while (actual != null) {contador++; actual = actual.siguiente; }
    return contador;
}

public void imprimir(){
    if (estaVacia()) {System.out.println("La cola esta vacia."); return; }
    Nodo actual = frente;
    while (actual != null) {
        System.out.println(actual.dato);
        if (actual.siguiente != null) System.out.println("->");
        actual = actual.siguiente;
    }
    System.out.println();
}
}
