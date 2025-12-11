package modelo;

import modelo.Empleado;

public class NodoLD 
{
    public Empleado emp;
    public NodoLD sgte, ant;
    
    public NodoLD(Empleado emple)
    {
        emp = emple;
        sgte = ant = null;
    }
}
