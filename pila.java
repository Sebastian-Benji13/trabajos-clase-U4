public class pila {

    private static class Nodo {
        int dato;
        Nodo siguiente;
        Nodo(int dato) { this.dato = dato; this.siguiente = null; }
    }

    private Nodo tope;

    public pila() { this.tope = null; }

    public boolean estaVacia() { return tope == null; }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public int pop() {
        if (estaVacia()) throw new IllegalStateException("La pila está vacía");
        int valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    public int peek() {
        if (estaVacia()) throw new IllegalStateException("La pila está vacía");
        return tope.dato;
    }

    public int tamaño() {
        int contador = 0;
        Nodo actual = tope;
        while (actual != null) { contador++; actual = actual.siguiente; }
        return contador;
    }

    public void imprimir() {
        if (estaVacia()) { System.out.println("La pila está vacía."); return; }
        Nodo actual = tope;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" ↓ ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}

