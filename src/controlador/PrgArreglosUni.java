
package controlador;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Franklin
 */
public class PrgArreglosUni {
    int[] codigos = new int[50];
    String[] nombres = new String[50];
    float[] sueldos = new float[50];
    private int tamaño = 4;

    public PrgArreglosUni() 
    {
        codigos[0] = 100;
        codigos[1] = 200;
        codigos[2] = 300;
        codigos[3] = 400;
        
        nombres[0] = "Ana";
        nombres[1] = "Beatriz";
        nombres[2] = "Cesar";
        nombres[3] = "Daniel";
        
        sueldos[0] = 1000.00f;
        sueldos[1] = 2000.00f;
        sueldos[2] = 3000.00f;
        sueldos[3] = 4000.00f;
    }
    
    public void guardarDatos(int cod, String nom, float sue)
    {
        codigos[tamaño] = cod;
        nombres[tamaño] = nom;
        sueldos[tamaño] = sue;
        tamaño++;
    }
    
    public void mostrarDatos(JTable tabla)
    {
        DefaultTableModel modelo = crearModeloBase();
        
        for (int i = 0; i < tamaño; i++) 
        {
            Object[] fila = {codigos[i], nombres[i], sueldos[i]};
            modelo.addRow(fila);
        }
        
        tabla.setModel(modelo);
    }
    
    public DefaultTableModel crearModeloBase() 
    {
        String[] columnas = {"Código", "Nombre", "Sueldo"};
        return new DefaultTableModel(columnas, 0);
    }
    
    
    public void eliminarXcodigo(int cod)
    {
        int pos = -1;
        for (int i = 0; i < tamaño; i++)
        {
            if (codigos[i] == cod)
            {
                pos = i;
                break;
            }
        }
        if (pos != -1)
        {
            for (int i = pos; i < tamaño - 1; i++)
            {
                codigos[i] = codigos[i+1];
                nombres[i] = nombres[i+1];
                sueldos[i] = sueldos[i+1];
            }
            tamaño--;
        }
    }
    
    public void mayorSueldo(JTable tabla)
    {
        DefaultTableModel modelo = crearModeloBase();
        
        float mayorSue = sueldos[0];
        int pos = 0;
        
        for(int i = 0; i < tamaño; i++)
        {
            if (sueldos[i] > mayorSue)
            {
                mayorSue = sueldos[i];
                pos = i;
            }
        }
        
        Object[] fila = {codigos[pos], nombres[pos], sueldos[pos]};
        modelo.addRow(fila);
        tabla.setModel(modelo);
    }
}
