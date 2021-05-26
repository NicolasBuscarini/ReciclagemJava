
package model;

import javax.swing.JOptionPane;

public class Usuario {
    private String nome;
    private int idade;
    private double kilos;
    public Reciclagem rec = new Reciclagem();


    public Usuario(String n, int i, double k) {
        this.setNome(n);
        this.setIdade(i);
        this.setKilos(k);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
      public double kg_anuais(){
        return (365 * this.getKilos());
        
    }
    
    public double kg_vida(){
        return kg_anuais() * this.getIdade() ;
            
    }
    
    public double volume(){
        return (kg_vida() * 1000/200)/1000 ; // 1.000 litros = mais ou menos 200 kg 
    }

    
    public void printCalculos(double kg_anuais, double kg_vida, double volume){
        String msg = "Nome: " + this.getNome() +
                   "\nIdade: " + this.getIdade() +
                   "\nMédia Kg/Dia: " + this.getKilos() +
                   "\n\nIsto significa que você produziu:\n\n• " +
                   kg_anuais + "Kg de lixo por ano.\n• " +
                   kg_vida + "Kg de Lixo durante toda sua vida.\n• " +
                   volume + "m³ de Lixo durante toda sua vida.\n• "+ 
                   "Equivalentes a " + volume + " caixas d'agua de mil litros sozinho.\n"; // 1 caixa d'agua 1m³ = 1.000 litros
        JOptionPane.showMessageDialog(null, msg);
    }
}
