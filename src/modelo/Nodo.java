
package modelo;

/**
 *
 * @author Franklin
 */
public class Nodo 
{
    public Empleado emp;
    public Nodo sgte;

    public Nodo(Empleado emp) 
    {
        this.emp = emp;
        sgte = null;
    }
    
}
