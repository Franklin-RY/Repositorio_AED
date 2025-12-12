
package controlador;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import modelo.Nodo;
import modelo.Empleado;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class PrgCola 
{
    Empleado emp;
    Nodo nuevo;
    Nodo frente = null;
    Nodo fin = null;

    public void insertar(int cod, String nom, float sue)
    {
        emp = new Empleado(cod, nom, sue);
        nuevo = new Nodo(emp);
        if(estaVacia())
        {
            frente = nuevo;  
            fin = nuevo;
        }
        else   
        {
            fin.sgte = nuevo;     
            fin = nuevo;            
        } 
            
    }

    public boolean estaVacia()
    {
            if(frente==null)
                        return true;
            else
                        return false;
    }

    public Empleado atenderCola(JTextField txtCod, JTextField txtNom, JTextField txtSue)
    {
        if(!estaVacia())
        {
            Empleado emple = frente.emp;      
            txtCod.setText(emple.getCodigo() + "");
            txtNom.setText(emple.getNombre());
            txtSue.setText(emple.getSueldo() + "");
            int resp = JOptionPane.showConfirmDialog(null,
                    "¿Está seguro de eliminar?", 
                    "Confirmar eliminar", 
                    JOptionPane.YES_NO_OPTION);
            if(resp==0)
            {
                if(frente.sgte==null) // preguntando si la cola tiene 1 solo nodo
                {
                    frente = fin = null;
                }else
                {
                    Nodo aux = frente;
                    frente = frente.sgte;
                    aux.sgte = null;
                }
                String nom = emple.getNombre();
                JOptionPane.showMessageDialog(null, nom + ", fue eliminado");
                limpiar(txtCod, txtNom, txtSue);
                return emple;
            } 
            limpiar(txtCod, txtNom, txtSue);
        }
        else
            JOptionPane.showMessageDialog(null, "No existe la Cola");
        return null;
    }

    public void limpiar(JTextField txtCod, JTextField txtNom, JTextField txtSue)
    {
        txtCod.setText("");
        txtNom.setText("");
        txtSue.setText("");
        txtCod.requestFocus();            
    }

    public void mostrarEmpleados(JTextArea txa)
    {
        txa.setText("");
        Nodo aux = frente;
        while(aux!=null)
        {
            txa.append(     aux.emp.getCodigo() + "\t" + 
                            aux.emp.getNombre() + "\t" +
                            aux.emp.getSueldo() + "\n"); 
            aux = aux.sgte;
        }
    }
    
    public void inicializarCola(){
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
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
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
