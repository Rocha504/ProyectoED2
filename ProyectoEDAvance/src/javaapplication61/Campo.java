 
package javaapplication61;


/**
 *
 * @author josue
 */
public class Campo {
    
    private String nombre;
    private String tipo;
    private int longitud;
    private boolean llave;
    
    public Campo(){
        
    }
    
    public Campo(String nombre, String tipo,boolean llave,int longitud){
       this.nombre=nombre;
       this.tipo=tipo;
       this.llave=llave;
       this.longitud=longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isLlave() {
        return llave;
    }

    public void setLlave(boolean llave) {
        this.llave = llave;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", tipo=" + tipo + ", longitud=" + longitud + ", llave=" + llave;
    }
    
    
    
    
}
 