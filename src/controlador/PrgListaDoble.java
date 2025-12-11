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
    NodoLD ini = null;
    NodoLD fin = null;
    NodoLD nuevo;
    Empleado emple;
    
    public boolean estaVacia()
    {
        return ini == null;
    }
    
    public void agregar(int cod, String nom, float suel)
    {
        emple = new Empleado(cod, nom, suel);
        nuevo = new NodoLD(emple);
        if (estaVacia()) 
        {
            ini = fin = nuevo;
        }
        else 
        {
            // Enlazar el nuevo nodo al final de la lista
            nuevo.ant = fin;      // El anterior del nuevo es el fin actual
            fin.sgte = nuevo;     // El siguiente del fin actual es el nuevo
            fin = nuevo;          // El nuevo nodo pasa a ser el fin
        }
    }
    
    public NodoLD buscarxCodigo(int cod)
    {
        NodoLD p = ini;
        while (p!= null)
        {
            if (p.emp.getCodigo() == cod)
                return p;
            p = p.sgte;
        }
        return null;
    }
   
    public void eliminarXCodigo(int cod)            
    {
        NodoLD p = buscarxCodigo(cod);
        NodoLD back = getBack(p);
        back.sgte= p.sgte;
        p.sgte.ant = back;
        //back.sgte.sgte.ant=back;
        p.sgte=null;
        p.ant = null;
    }        
    
    public void elimNodo1()
    {
        if (estaVacia())
        {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }
        
        Empleado emple = ini.emp;
        
        // Si es el único nodo
        if (ini == fin)
        {
            ini = fin = null;
        }
        // Si hay más nodos
        else
        {
            NodoLD aux = ini;
            ini = ini.sgte;
            ini.ant = null;
            aux.sgte = null;
        }
        
        JOptionPane.showMessageDialog(null, 
            "El empleado " + emple.getNombre() + " (primer nodo) ha sido eliminado");
    }
    
    public NodoLD getBack(NodoLD p)
    {       
        NodoLD back = ini;
        while(back.sgte!= p)
            back = back.sgte;
        return back;
    }

    public void mostrar(JTextArea txa)
    {
        txa.setText("");
        if (estaVacia())
        {
            txa.setText("La lista está vacía");
            return;
        }
        NodoLD aux = ini;
        while (aux != null)
        {                
            String data = aux.emp.getCodigo() + "\t" +                              
                          aux.emp.getNombre() + "\t" +
                          aux.emp.getSueldo() + "\n";
            txa.append(data);
            aux = aux.sgte;            
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
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

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
    
    public String listarIzqDer()
    {
        String datos = "";
        if (estaVacia())
        {
            return "La lista está vacía";
        }
        
        datos = "CÓDIGO\tNOMBRE\t\tSUELDO\n";
        datos += "======\t======\t\t======\n";
        
        NodoLD aux = ini;
        while (aux != null)
        {
            datos = datos + aux.emp.getCodigo() + "\t" + 
                            aux.emp.getNombre() + "\t\t" + 
                            aux.emp.getSueldo() + "\n";
            aux = aux.sgte;
        }
        return datos;
    }
    
    public String listarDerIzq()
    {
        String datos = "";
        if (estaVacia())
        {
            return "La lista está vacía";
        }
        
        datos = "CÓDIGO\tNOMBRE\t\tSUELDO\n";
        datos += "======\t======\t\t======\n";
        
        NodoLD aux = fin;
        while (aux != null)
        {
            datos = datos + aux.emp.getCodigo() + "\t" + 
                            aux.emp.getNombre() + "\t\t" + 
                            aux.emp.getSueldo() + "\n";
            aux = aux.ant;
        }
        return datos;
    }
    
    public void mostrarReverso(JTextArea txa)
    {
        txa.setText("=== RECORRIDO DE DERECHA A IZQUIERDA ===\n\n");
        txa.append(listarDerIzq());
    }

    public NodoLD getIni() {
        return ini;
    }

    public void setIni(NodoLD ini) {
        this.ini = ini;
    }

    public NodoLD getFin() {
        return fin;
    }

    public void setFin(NodoLD fin) {
        this.fin = fin;
    }

    public NodoLD getNuevo() {
        return nuevo;
    }

    public void setNuevo(NodoLD nuevo) {
        this.nuevo = nuevo;
    }

    public Empleado getEmple() {
        return emple;
    }

    public void setEmple(Empleado emple) {
        this.emple = emple;
    }
    
}
