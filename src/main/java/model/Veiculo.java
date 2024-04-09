
package model;

// e Veiculo contendo Peso em quilos(int), VelocMax em Km/h(int) e Preco em R$ (float).

import javax.swing.JOptionPane;

public class Veiculo {
    private Double peso;
    private int velocMax;
    private Double price;

    public Veiculo(){
        this(0.0, 0, 0.0);
    }
    
    public Veiculo(Double peso, int velocMax, Double price) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.price = price;
    }

    public Double getPeso() {
        return peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public Double getPrice() {
        return price;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public void solicitarPeso(){
        setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso: ")));
    }
    
    public void solicitarVelocMax(){
        setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("Velocidade máxima: ")));
    }
    
    public void solicitarPrice(){
        setPrice(Double.parseDouble(JOptionPane.showInputDialog("Preço: ")));
    }
    
    public void imprimirPeso(){
        JOptionPane.showMessageDialog(null, getPeso());
    }
    
    public void imprimirVelocMax(){
        JOptionPane.showMessageDialog(null, getVelocMax());
    }
    
    public void imprimirPrice(){
        JOptionPane.showMessageDialog(null, getPrice());
    }
}
