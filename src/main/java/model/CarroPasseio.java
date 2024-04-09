/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

import model.*;

public class CarroPasseio extends Veiculo{
    private String cor;
    private String modelo;

    public CarroPasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public CarroPasseio(String cor, String modelo, Double peso, int velocMax, Double price) {
        super(peso, velocMax, price);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void solicitarCor(){
        setCor(JOptionPane.showInputDialog("Cor: "));
    }
    
    public void solicitarModelo(){
        setModelo(JOptionPane.showInputDialog("Modelo: "));
    }
    
    public void imprimirCor(){
        JOptionPane.showMessageDialog(null, getCor());
    }
    
    public void imprimirModelo(){
        JOptionPane.showMessageDialog(null, getModelo());
    }
    
    
}
