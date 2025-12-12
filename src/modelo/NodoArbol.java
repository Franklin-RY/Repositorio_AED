
package modelo;

public class NodoArbol 
{
    public Empleado emp;
    public NodoArbol izquierda;
    public NodoArbol derecha;

    public NodoArbol(Empleado emple) 
    {
        emp = emple;
        izquierda = derecha = null;
    }
}
