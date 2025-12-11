package controlador;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import modelo.Empleado;
import modelo.Nodo;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Franklin
 */
public class PrgPila 
{
    Empleado emp;
    Nodo nuevo;
    Nodo tope = null;
    
    public boolean estaVacia()
    {
        if (tope == null) 
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void push(int cod, String nom, float sue)
    {
        emp = new Empleado(cod, nom, sue);
        nuevo = new Nodo(emp);
        
        if (estaVacia())
        {
            tope = nuevo;
        }
        else 
        {
            nuevo.sgte = tope;
            tope = nuevo;
        }
    }

    public Empleado pop()
    {
        if (estaVacia())
        {
            JOptionPane.showMessageDialog(null, "La pila esta VACIA");
            return null;
        }
        else 
        {
            Nodo aux = tope;
            Empleado emple = aux.emp;
            tope = aux.sgte;
            aux.sgte = null;
            JOptionPane.showMessageDialog(null, "El empleado " + emple.getNombre() + " fue ELIMINADO ");
            return emple;
        }
    }
    
    public void mostrar(JTextArea txa)
    {
        txa.setText("");
        if (!estaVacia()) 
        {
            Nodo aux = tope;
            while (aux != null)
            {
                txa.append(aux.emp.getCodigo() + "\t" +
                           aux.emp.getNombre() + "\t" +
                           aux.emp.getSueldo() + "\n");
                aux = aux.sgte;
            }
        }
    }
    
    public Nodo buscar(JTextField txtCod)
    {
        Nodo b = tope;
        while (b != null)
        {
            if (Integer.parseInt(txtCod.getText()) == b.emp.getCodigo()) 
            {
                return b;
            }
            b = b.sgte;
        }
        return null;
    }
    
    public void consultar(JTextField txtCod, JTextField txtNom, JTextField txtSue)
    {
        Nodo b = buscar(txtCod);
        
        if (b == null){
            JOptionPane.showMessageDialog(null, "El empleado no exite");
        }
        else {
            txtNom.setText(b.emp.getNombre());
            txtSue.setText(b.emp.getSueldo() + "");
        }
    }
    
    public void limpiar(JTextField txtCod, JTextField txtNom, JTextField txtSue)
    {
        txtCod.setText("");
        txtNom.setText("");
        txtSue.setText("");
        
        txtCod.requestFocus();
    }
    
    public void inicializarPila(){
        push(100, "Ana", 1000.0f);
        push(200, "Beatriz", 2000.0f);
        push(300, "Cesar", 3000.0f);
        push(400, "Daniel", 4000.0f);
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
