
package modelo;

/**
 *
 * @author Franklin
 */
public class Empleado 
{
    public int codigo;
    public String nombre;
    public float sueldo;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, float sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
}
