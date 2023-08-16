
import javax.swing.JOptionPane;

/**
 *@Author Yasmin Kamilly Christ
 * 15/08/23
 * Dois números inteiros e informar se são iguais ou diferentes
 */
public class ExercicioQuatro {
    public static void main(String args[]){
        int numero1;
        int numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        if(numero1 == numero2){
            JOptionPane.showMessageDialog(null, numero1 + " é igual a " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, numero1 + " é diferente de " + numero2);
        }
    }
}
