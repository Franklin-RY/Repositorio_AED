package controlador;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import modelo.Empleado;
import modelo.NodoLD;

public class PrgListaDoble
{
    NodoLD inicio = null;
    NodoLD fin = null;
    NodoLD nuevo;
    Empleado emp;
    
    public boolean estaVacia()
    {
        if (inicio == null)
            return true;
        else
            return false;
    }
    
    public void agregar(int cod, String nom, float suel)
    {
        emp = new Empleado(cod, nom, suel);
        nuevo = new NodoLD(emp);
        if(inicio==null)
        {
            inicio = nuevo;
        }    
        else
        {
            nuevo.ant = fin;
            fin.sgte = nuevo;
        }      
        fin = nuevo;
    }
    
    public void listarIzqDer(JTextArea txa)
    {
        txa.setText("");
        NodoLD aux = inicio;
        while(aux!= null)
        {
            String data = aux.emp.getCodigo() + "\t" +                              
                          aux.emp.getNombre() + "\t" +
                          aux.emp.getSueldo() + "\n";
            txa.append(data);
            aux = aux.sgte;
        }
    }
    
    public void listarDerIzq(JTextArea txa)
    {
        txa.setText("");
        NodoLD aux = fin;
        while(aux!= null)
        {
            String data = aux.emp.getCodigo() + "\t" +                              
                          aux.emp.getNombre() + "\t" +
                          aux.emp.getSueldo() + "\n";
            txa.append(data);
            aux = aux.ant;
        }
    }
    
    public NodoLD buscarxCodigo(int cod)
    {
        NodoLD p = inicio;
        while (p!= null)
        {
            if (p.emp.getCodigo() == cod) 
                return p;
            p = p.sgte;
        }
        return null;
    }
    
    public void eliminarXcodigo(int cod) 
    {
        NodoLD b = buscarxCodigo(cod);
        if (b != null) {
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
                    inicio.ant = null;
                    b.sgte = null;
                }
                else 
                {
                    if (b == fin) 
                    {
                        fin = fin.ant;
                        fin.sgte = null;
                        b.ant = null;
                    }                
                    else 
                    {
                        b.ant.sgte = b.sgte;
                        b.sgte.ant = b.ant;
                        b.sgte = null;
                        b.ant = null;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "El empleado " + emple.getNombre() + " ha sido eliminado");
        } else {
            JOptionPane.showMessageDialog(null,
                "El empleado con código \"" + cod + "\" NO existe");
        }
    }

    public void inicializarListaDoble()
    {
        agregar(100, "Ana", 1000.0f);
        agregar(200, "Beatriz", 2000.0f);
        agregar(300, "Cesar", 3000.0f);
        agregar(400, "Daniel", 4000.0f);
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
