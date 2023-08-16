
import javax.swing.JOptionPane;

/**
 *
 * @Author Yasmin Kamilly Christ
 * 15/08/23
 * ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 */
public class ExercicioTres {
    public static void main(String args[]){
        double custoFabrica;
        double custoFinal;
        
        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de Fábrica: "));
        custoFinal = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);
        
        JOptionPane.showMessageDialog(null, "Custo Final: R$" + custoFinal);
    
    }
}
