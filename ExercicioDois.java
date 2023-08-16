
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin Kamilly Christ
 * Ler uma medida em polegadas e imprimir a equivalente em centímetros, sabendo que 2.54 cm equivale a 1 polegada.
 */
public class ExercicioDois {
    public static void main(String args[]){
        double medida;
        double centimetros; 
        
        medida = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida em polegadas: "));
        centimetros = medida*2.54;
        
        JOptionPane.showMessageDialog(null, medida + " polegadas equivale a " + centimetros + "cm.");
    }
}
