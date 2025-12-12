
package controlador;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.NodoArbol;
import modelo.Empleado;
import javax.swing.JTextArea;

public class PrgArbolBusqueda 
{
    NodoArbol raiz;
    Empleado emple;    
    
    public void insertar(int cod, String nom, float sue) 
    {
        emple = new Empleado(cod, nom, sue);
        raiz = insertarRec(raiz, emple);
    }

    private NodoArbol insertarRec(NodoArbol nodo, Empleado empl) 
    {
        if (nodo == null) 
        { 
            return new NodoArbol(empl);
        }
        if (empl.getCodigo() < nodo.emp.getCodigo()) 
        {
            nodo.izquierda = insertarRec(nodo.izquierda, empl);
        } else
            if (empl.getCodigo() > nodo.emp.getCodigo()) 
            {
                nodo.derecha = insertarRec(nodo.derecha, empl);
            }
        return nodo;
    }
    
    private NodoArbol eliminarRec(NodoArbol nodo, int cod) 
    {
        if (nodo == null) return null;

        if (cod < nodo.emp.getCodigo()) 
        {
            nodo.izquierda = eliminarRec(nodo.izquierda, cod);
        } 
        else 
            if (cod > nodo.emp.getCodigo()) 
            {
                nodo.derecha = eliminarRec(nodo.derecha, cod);
            } 
            else 
            {
                if (nodo.izquierda == null) return nodo.derecha;
                else if (nodo.derecha == null) return nodo.izquierda;

                NodoArbol sucesor = obtenerMinimoNodo(nodo.derecha);
                nodo.emp = sucesor.emp; 
                nodo.derecha = eliminarRec(nodo.derecha, sucesor.emp.getCodigo());
            }
        return nodo;
    }
    
    private NodoArbol obtenerMinimoNodo(NodoArbol nodo) 
    {
        while (nodo.izquierda != null) 
        {
            nodo = nodo.izquierda;
        }
        return nodo;
    }

    public boolean buscar(int cod) 
    {
        return buscarRec(raiz, cod);
    }

    private boolean buscarRec(NodoArbol nodo, int cod) 
    {
        if (nodo == null) 
	{
            return false;
        }
        if (cod == nodo.emp.getCodigo()) 
	{
            return true;
        } else 
            if (cod < nodo.emp.getCodigo()) 
            {
            	return buscarRec(nodo.izquierda, cod);
            } else 
            {
            	return buscarRec(nodo.derecha, cod);
            }
    }

    // Eliminar un nodo del árbol
    public void eliminar(int cod) 
    {
        raiz = eliminarRec(raiz, cod);
    }

    

    // Recorrido en orden (para mostrar el árbol)
    public void inOrden(JTextArea txa) 
    {
            inOrdenRec(raiz, txa);
            System.out.println();
    }

    private void inOrdenRec(NodoArbol nodo, JTextArea txa) 
    {
        if (nodo != null) 
        {
            inOrdenRec(nodo.izquierda, txa);
            txa.append(nodo.emp.getCodigo() + "\t" +
                       nodo.emp.getNombre() + "\t" +
                       nodo.emp.getSueldo() + "\n");
            inOrdenRec(nodo.derecha, txa);
        }
    }    
    
    public void mostrarInfo(Component padre, String titulo, String mensaje, String rutaImagen) 
    {
        JTextArea areaTexto = new JTextArea(mensaje);
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 20));
        areaTexto.setEditable(false);

        ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(400, 250, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

        JOptionPane.showMessageDialog(
            padre,
            areaTexto,
            titulo,
            JOptionPane.INFORMATION_MESSAGE,
            iconoEscalado
        );
    }
    
    public void inicializarArbol(){
        insertar(100, "Ana", 1000.0f);
        insertar(200, "Beatriz", 2000.0f);
        insertar(300, "Cesar", 3000.0f);
        insertar(400, "Daniel", 4000.0f);
    }
    
}
