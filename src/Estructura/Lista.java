
package Estructura;

public class Lista<T> {
    private Nodo<T> cabeza;
    private int tamaño;

    public Lista() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
// operaciones para manipular la lista generica

public boolean esVacia(){
    return this.cabeza==null;
}    
    
    
public void agregar(T elemento){
    Nodo<T> nuevo = new Nodo<>(elemento);
    if (cabeza==null){
        cabeza=nuevo;
    }else{
        Nodo<T> actual = cabeza;
        while (actual.siguiente!=null){
            actual=actual.siguiente;
        }
        actual.siguiente=nuevo;
    }
    tamaño++;
}    

    public void agregarInicio(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (this.esVacia()) {
            this.cabeza=nuevo;
        } else {
            Nodo<T> actual = this.cabeza;
            actual.siguiente = cabeza;
            cabeza = actual;
        }

    }

public void agregarFinal(T elemento){
    Nodo<T> nuevo = new Nodo<>(elemento);
    if (cabeza==null){
        cabeza=nuevo;
    }else{
        Nodo<T> actual = cabeza;
        while (actual.siguiente!=null){
            actual=actual.siguiente;
        }
        actual.siguiente=nuevo;
    }
    tamaño++;
}        
    
public void borrarInicio(){
    if (!this.esVacia()){
        cabeza=cabeza.siguiente;
        tamaño --;
    }else{
        System.out.println("Lista vacia, no hay elementos para borrar");
    }
}    

    public void borrarFin() {
        Nodo<T> actual=cabeza;
        while (actual !=null && actual.siguiente.siguiente!=null){
            actual=actual.siguiente;
        }
        actual.siguiente=null;
    }   
 
private Nodo<T> obtenerNodo(T elemento){
    Nodo<T> actual=cabeza;
    while (actual!=null){
        if (actual.valor.equals(elemento)){
            return actual; //si se encuentra el elemento
        }
        actual=actual.siguiente;
    }
    return null;  // si no se encuentra el elemento
} 

public T obtener(int indice){
    verificarIndice(indice);
    Nodo<T> actual=cabeza;
    for(int i=0;i<indice;i++){
        actual=actual.siguiente;
    }
    return actual.valor;
}

public void eliminarNodo(T elemento) {
    if (cabeza == null) {
        return; // Lista vacía, no hay nada que eliminar
    }

    // Si el nodo a eliminar es la cabeza
    if (cabeza.valor.equals(elemento)) {
        cabeza = cabeza.siguiente;
        tamaño--;
        return;
    }

    Nodo<T> actual = cabeza;
    while (actual.siguiente != null && !actual.siguiente.valor.equals(elemento)) {
        actual = actual.siguiente;
    }

    if (actual.siguiente != null) {
        // Nodo encontrado: eliminarlo
        actual.siguiente = actual.siguiente.siguiente;
        tamaño--;
    }
}    
    
   public T eliminar(int indice) {
        verificarIndice(indice);
        T eliminado;
        if (indice == 0) {
            eliminado = cabeza.valor;
            cabeza = cabeza.siguiente;
        } else {
            Nodo<T> anterior = cabeza;
            for (int i = 0; i < indice - 1; i++) {
                anterior = anterior.siguiente;
            }
            eliminado = anterior.siguiente.valor;
            anterior.siguiente = anterior.siguiente.siguiente;
        }
        tamaño--;
        return eliminado;
    }

private void verificarIndice(int indice){
    if (indice<0 || indice>=tamaño){
        throw new IndexOutOfBoundsException("Índice inválido");
    }
}

    public int tamaño() {
        return tamaño;
    }

 public String mostrar() {
      String listosalas="";
        Nodo<T> actual = cabeza;
        while (actual!=null){
            listosalas=listosalas + actual.valor + " - ";
            actual=actual.siguiente;
            
        }
        return listosalas;
    }   
    
public String mostrar1() {
    String resultado = "";
    Nodo actual = cabeza; // o el nodo inicial de tu lista
    while (actual != null) {
        
        resultado += actual.valor.toString() + " "; // o el método que corresponda para convertir a String
        actual = actual.siguiente; // o el puntero al siguiente nodo
    }
    return resultado.trim(); // para eliminar espacios extras
}
}
