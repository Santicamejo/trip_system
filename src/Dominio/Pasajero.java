
package dominio;

public class Pasajero {
    private String cedula;
    private String Nombre;
    private int Edad;
    private Categoria Categoria;

    public Pasajero(String cedula, String Nombre, int Edad, Categoria Categoria) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Categoria = Categoria;
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }
    
    
}
