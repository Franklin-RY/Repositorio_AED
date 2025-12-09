
package controlador;
 
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Franklin
 */
public class PrgArreglosBidi 
{
    float[][] notas = new float[51][3];
    int indice = 4;
    
    public PrgArreglosBidi()
    {
        notas[0][0] = 20.0f; notas[0][1] = 20.0f; notas[0][2] = 20.0f;
        notas[1][0] = 19.0f; notas[1][1] = 19.0f; notas[1][2] = 19.0f;
        notas[2][0] = 18.0f; notas[2][1] = 18.0f; notas[2][2] = 18.0f;
        notas[3][0] = 17.0f; notas[3][1] = 17.0f; notas[3][2] = 17.0f;
    }
    
    public void guardarDatos(float n1, float n2, float n3)
    {
        notas[indice][0] = n1;
        notas[indice][1] = n2;
        notas[indice][2] = n3;
        indice++;
    }
    
    public DefaultTableModel crearModeloBase()
    {
        String columnas[] = {"Nota 1", "Nota 2", "Nota 3"};
        return new DefaultTableModel(columnas, 0);
    }
    
    public void mostrarDatos(JTable tabla)
    {
        DefaultTableModel modelo = crearModeloBase();
        for(int f = 0; f < indice; f++)
        {
            Object fila[] = {notas[f][0], notas[f][1], notas[f][2]};
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }
    
    public void eliminarPorPosicion(int pos)
    {
        if (pos >= 0 && pos < indice){
            for(int f = pos; f < indice - 1; f++){
                notas[f][0] = notas[f + 1][0];
                notas[f][1] = notas[f + 1][1];
                notas[f][2] = notas[f + 1][2];
            }
            indice--;
            JOptionPane.showMessageDialog(null, "Notas eliminadas correctamente");
        }
        else {
            JOptionPane.showMessageDialog(null, "Introducir un número de indice valido");
        }
    }
    
    public void mostrarInfo(Component padre, String titulo, String mensaje, String rutaImagen) 
    {
        JTextArea areaTexto = new JTextArea(mensaje);
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 20));
        areaTexto.setEditable(false);

        ImageIcon iconoOriginal = new ImageIcon(rutaImagen);
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(290, 250, Image.SCALE_SMOOTH);
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
