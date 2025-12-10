
package controlador;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import modelo.Empleado;
import modelo.Nodo;

/**
 *
 * @author Franklin
 */
public class PrgListaSimple 
{
    Empleado emp;
    Nodo nuevo;
    Nodo inicio = null;
    Nodo fin = null;
    
    public boolean estaVacia()
    {
        if (inicio == null)
            return true;
        else
            return false;
    }
    
    
    public void insertar(int cod, String nom, float sue)
    {
        emp = new Empleado(cod, nom, sue);
        nuevo = new Nodo(emp);
        if (estaVacia())
        {
            inicio = fin = nuevo;
        }
        else 
        {
            fin.sgte = nuevo;
            fin = nuevo;
        }
    }
    
    public void mostrar(JTextArea txa)
    {
        txa.setText("");
        Nodo aux = inicio;
        while (aux != null)
        {                
            String data = aux.emp.getCodigo() + "\t" +                              
                          aux.emp.getNombre() + "\t" +
                          aux.emp.getSueldo() + "\n";
            txa.append(data);
            aux = aux.sgte;            
        }        
    }
    
    public Nodo buscarXcodigo(int cod)
    {
        Nodo aux = inicio;
        while (aux != null)
        {
            if (aux.emp.getCodigo() == cod)
            {
                return aux;
            }
            aux = aux.sgte;
        }
        return null;
    }    
    
    public Nodo getBack(int cod)
    {
        Nodo buscar = buscarXcodigo(cod);
        if (buscar != null) 
        {
            Nodo back = inicio;
            while (back.sgte != buscar) 
            {                
                back = back.sgte;
            }
            return back;
        }
        return null;
    }
    
    public void eliminarXcodigo(int cod)
    {
        Nodo b = buscarXcodigo(cod);
        if (b != null)
        {
            Empleado emple = b.emp;
            if (b == inicio && b == fin)
            {
                inicio = fin = null;
            }
            else 
            {
                if (b == inicio)
                {
                    inicio = inicio.sgte;
                    b.sgte = null;
                }
                else 
                {
                    if (b == fin) 
                    {
                        Nodo back = getBack(cod);
                        fin = back;
                        fin.sgte = null;
                    }
                    else 
                    {
                        Nodo back = getBack(cod);
                        back.sgte = b.sgte;
                        b.sgte = null;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "El empleado " + emple.getNombre() + " ha sido eliminado");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "El empleado con código \"" + cod + "\" NO existe");
        }
    }
    
    public void inicializarListaSimple(){
        insertar(100, "Ana", 1000.0f);
        insertar(200, "Beatriz", 2000.0f);
        insertar(300, "Cesar", 3000.0f);
        insertar(400, "Daniel", 4000.0f);
    }
    
    public void mostrarInfo(Component padre, String titulo, String mensaje, String rutaImagen) 
    {
        JTextArea areaTexto = new JTextArea(mensaje);
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 20));
        areaTexto.setEditable(false);

        ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

        JOptionPane.showMessageDialog(
            padre,
            areaTexto,
            titulo,
            JOptionPane.INFORMATION_MESSAGE,
            iconoEscalado
        );
    }
    
}
