
package model;

import model.Veiculo;
import javax.swing.JOptionPane;

public class Caminhao extends Veiculo{
    private Double toneladas;
    private Double AlturaMax;
    private Double Comprimento;

    public Caminhao(Double toneladas, Double AlturaMax, Double Comprimento) {
        this.toneladas = toneladas;
        this.AlturaMax = AlturaMax;
        this.Comprimento = Comprimento;
    }

    public Caminhao(Double toneladas, Double AlturaMax, Double Comprimento, Double peso, int velocMax, Double price) {
        super(peso, velocMax, price);
        this.toneladas = toneladas;
        this.AlturaMax = AlturaMax;
        this.Comprimento = Comprimento;
    }

    public Double getToneladas() {
        return toneladas;
    }

    public Double getAlturaMax() {
        return AlturaMax;
    }

    public Double getComprimento() {
        return Comprimento;
    }

    public void setToneladas(Double toneladas) {
        this.toneladas = toneladas;
    }

    public void setAlturaMax(Double AlturaMax) {
        this.AlturaMax = AlturaMax;
    }

    public void setComprimento(Double Comprimento) {
        this.Comprimento = Comprimento;
    }
    
    public void solicitarToneladas(){
        setToneladas(Double.parseDouble(JOptionPane.showInputDialog("Toneladas: ")));
    }
    
    public void solicitarAlturaMax(){
        setAlturaMax(Double.parseDouble(JOptionPane.showInputDialog("Altura Máxima: ")));
    }
    
    public void solicitarComprimento(){
        setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Comprimento: ")));
    }
    
    public void imprimirToneladas(){
        JOptionPane.showMessageDialog(null, getToneladas());
    }
    
    public void imprimirAlturaMax(){
        JOptionPane.showMessageDialog(null, getAlturaMax());
    }
    
    public void imprimirComprimento(){
        JOptionPane.showMessageDialog(null, getComprimento());
    }
}
