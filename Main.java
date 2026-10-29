public class Main {
    public static void main(String[] args) {
        cola Cola = new cola();
        System.out.println(" ¿Esta vacia? " + Cola.estaVacia()); //True

        Cola.encolar(10);
        Cola.encolar(20);
        Cola.encolar(30);
        System.out.println("Cola tras encolar 10, 20, 30: ");
        Cola.imprimir();

        System.out.println("verFrente():  " + Cola.verFrente());
        System.out.println("desenColar(:  " + Cola.desencolar());
        System.out.println("Cola tras desencolar: ");
        Cola.imprimir();

        System.out.println("Tamaño " + Cola.tamaño());
        System.out.println("desencolar(): " + Cola.desencolar());
        System.out.println("¿Esta vacia?" + Cola.estaVacia());
    }
}
