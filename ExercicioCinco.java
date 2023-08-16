
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin Kamilly Christ
 * 15/08/2023
 * Número de maçãs compradas -> total da compra
 */
public class ExercicioCinco {
    public static void main(String args[]){
        int numeroMacas;
        double custoCompra;
        
        numeroMacas = Integer.parseInt(JOptionPane.showInputDialog("Quantas maçãs foram compradas?"));
        
        if(numeroMacas < 6) {
            custoCompra = numeroMacas * 1.30;
        } else {
            custoCompra = numeroMacas; 
        }
        
        JOptionPane.showMessageDialog(null, "O valor da compra de " + numeroMacas + " maçãs é R$" + custoCompra);
    }
}
