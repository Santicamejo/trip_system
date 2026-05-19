
package Estructura;

public class Cola<T> {
   private Nodo frente;
   private Nodo fondo;

    public Cola() {
        this.frente = null;
        this.fondo = null;
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getFondo() {
        return fondo;
    }

    public void setFondo(Nodo fondo) {
        this.fondo = fondo;
    }
// operaciones para manipular el tad cola
    
 public void encolar(T valor) {
        Nodo nuevo = new Nodo(valor);
        if (fondo != null) {
            fondo.siguiente = nuevo;
        }
        fondo = nuevo;
        if (frente == null) {
            frente = nuevo;
        }
    }

    public T desencolar() {
        if (estaVacia()) return null;
        T valor = (T) frente.valor;
        frente = frente.siguiente;
        if (frente == null) fondo = null;
        return valor;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void mostrar() {
        Nodo actual = frente;
        while (actual != null) {
            System.out.println("  - " + actual.valor);
            actual = actual.siguiente;
        }
    } 
}
