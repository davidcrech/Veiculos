
package principal;

import model.*;
import javax.swing.JOptionPane;

public class MenuVeiculo {
    public static void main(String args[]){
        Veiculo vei1 = new Veiculo();
        
        int opt = -1;
        
        while (opt != 23){
            opt = Integer.parseInt(JOptionPane.showInputDialog("1 - Caminhão\n"
                    + "2 - Carro de Passeio\n"
                    + "3 - Setar dados do Veículo\n"
                    + "23 - SAIR"));
            switch (opt){
                case 3:
                    vei1.solicitarPeso();
                    vei1.solicitarVelocMax();
                    vei1.solicitarPeso();;
                    break;
                case 23:
                    opt = 23;
                    break;
                    
            }           
        }
    }
}
