
package Estructura;


public class Lista<T> {
    private Nodo<T> inicio;
    private int cantNodos;
    private Nodo<T> fin;

    public Lista() {
        this.inicio = null;
        this.cantNodos = 0;
        this.fin = null;
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }

    public Nodo<T> getFin() {
        return fin;
    }

    public void setFin(Nodo<T> fin) {
        this.fin = fin;
    }


    public boolean esVacia(){
        return this.cantNodos==0;
    }    


    public void agregar(T elemento, String primaryKey){
        Nodo<T> nuevo = new Nodo<>(elemento);
        nuevo.setPrimaryKey(primaryKey);
        nuevo.setValor(elemento);
        if (this.esVacia()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            Nodo<T> aux = inicio;
            if(primaryKey.compareTo(inicio.primaryKey) < 0) agregarInicio(elemento, primaryKey);
            if(primaryKey.compareTo(fin.primaryKey) > 0) agregarFinal(elemento, primaryKey);
            boolean encontrado = false;
            while (aux != null && !encontrado){
                if(primaryKey.compareTo(aux.primaryKey) < 0){
                    nuevo.setAnterior(aux.anterior);
                    nuevo.setSiguiente(aux);
                    aux.anterior.setSiguiente(nuevo);
                    aux.setAnterior(nuevo);
                    encontrado = true;
                }
                aux = aux.siguiente;
            }
        }
        cantNodos++;
    }    

    public void agregarInicio(T elemento, String primaryKey) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        nuevo.setPrimaryKey(primaryKey);
        nuevo.setValor(elemento);
        if (this.esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio = nuevo;
        }
        cantNodos++;
    }

    public void agregarFinal(T elemento, String primaryKey){
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (this.esVacia()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
        nuevo.setPrimaryKey(primaryKey);
        nuevo.setValor(elemento);
        cantNodos++;
    }        

    public void borrarInicio(){
        if (!this.esVacia()){
            inicio = inicio.siguiente;
            cantNodos --;
        }else{
            System.out.println("Lista vacia, no hay elementos para borrar");
        }
    }    

    public void borrarFin() {
        if (!this.esVacia()){
            fin = fin.anterior;
            cantNodos --;
        }else{
            System.out.println("Lista vacia, no hay elementos para borrar");
        }
    }   

    public boolean existe(String primaryKey){
        boolean encontrado = false;
        Nodo<T> aux=inicio;
        while (aux!=null && !encontrado){
            if (aux.primaryKey.compareTo(primaryKey) == 0){
                encontrado = true;
            }
            aux=aux.siguiente;
        }
        return encontrado;
    } 

    public T obtenerPorIndice(int indice){
        verificarIndice(indice);
        Nodo<T> aux=inicio;
        for(int i=0;i<indice;i++){
            aux=aux.siguiente;
        }
        return aux.valor;
    }

    public void eliminarNodo(T elemento) {
        if (this.esVacia()) return;
        if (inicio.valor.equals(elemento)) {
            inicio = inicio.siguiente;
            cantNodos--;
            return;
        }else if(fin.valor.equals(elemento)){
            fin = fin.anterior;
            cantNodos--;
            return;
        }
        Nodo<T> aux = inicio;
        while (aux.siguiente != null && !aux.siguiente.valor.equals(elemento) && aux.siguiente != fin) aux = aux.siguiente;
        if (aux.siguiente != null && aux.siguiente != fin) {
            aux.siguiente = aux.siguiente.siguiente;
            aux.siguiente.anterior = aux;
            cantNodos--;
        }
    }    

       public T eliminar(int indice) {
            verificarIndice(indice);
            T eliminado;
            if (indice == 0) {
                eliminado = inicio.valor;
                inicio = inicio.siguiente;
            } else if (indice == cantNodos -1){
                eliminado = fin.valor;
                fin = fin.anterior;
            } else {
                Nodo<T> aux = inicio;
                for (int i = 0; i < indice - 1; i++) {
                    aux = aux.siguiente;
                }
                eliminado = aux.siguiente.valor;
                aux.siguiente = aux.siguiente.siguiente;
                aux.siguiente.anterior = aux;
            }
            cantNodos--;
            return eliminado;
        }

    private void verificarIndice(int indice){
        if (indice < 0 || indice >= cantNodos){
            throw new IndexOutOfBoundsException("Índice inválido");
        }
    }

    public String mostrar() {
        String lista="";
        Nodo<T> aux = inicio;
        while (aux!=null){
            lista += aux.valor + " - ";
            aux=aux.siguiente;
        }
        return lista;
    }   

    public String mostrar1() {
        String lista = "";
        Nodo aux = inicio;
        while (aux != null) {

            lista += aux.getValor().toString()+ " | ";
            aux = aux.siguiente;
        }
        return lista.trim();
    }
    
    public String mostrar2() {
        String lista = "";
        Nodo aux = fin;
        while (aux != null) {

            lista += aux.valor.toString() + "|";
            aux = aux.anterior;
        }
        return lista.trim();
    }
    public boolean existe(Nodo<T> x){
        Nodo aux = inicio;
        while(aux != null){
            if(aux.equals(x)) return true;
            aux = aux.siguiente;
        }
        return false;
    }
}
