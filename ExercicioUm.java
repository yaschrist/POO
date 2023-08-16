
import javax.swing.JOptionPane;

/**
 *
 * @Author Yasmin Kamilly Christ
 * 15/08/23
 * Faça um algoritmo que leia seu antecessor e sucessor
 */
public class ExercicioUm {
    public static void main(String args[]){
        int numero; 
        int antecessor;
        int sucessor; 
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
        antecessor = numero-1;
        sucessor = numero+1;
        
        JOptionPane.showMessageDialog(null, "O antecessor de " + numero + " é " + antecessor + " e o sucessor é " + sucessor);
    }
}
