package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Reciclagem {
    ArrayList<Metal> lista_metal = new ArrayList<Metal>();
    ArrayList<Organico> lista_organico = new ArrayList<Organico>();
    ArrayList<Papel> lista_papel = new ArrayList<Papel>();
    ArrayList<Plastico> lista_plastico = new ArrayList<Plastico>();
    ArrayList<Vidro> lista_vidro = new ArrayList<Vidro>();
    
    public static String mostraMenu(){
        String escolha = JOptionPane.showInputDialog(null, "MENU: \n 1- Calcular lixo anual \n 2- Reciclar/Separar Lixo \n 3- Mostrar Reciclagem \n 4- Fechar Programa");
        if("2".equals(escolha)){
            escolha += JOptionPane.showInputDialog(null, "Escolha um material para Reciclar: \n 1- Metal \n 2- Organico \n 3- Papel \n 4- Plástico \n 5- Vidro \n 6- Fechar Programa");

            }
        return escolha;
    }
    
    public void addLista_metal(){        
        Metal.mostraReciclavel();
        String nome_metal = JOptionPane.showInputDialog(null, "Digite qual material de METAL irá reciclar: ");
        int qtd_metal = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos você irá reciclar: "));
        Metal m = new Metal(nome_metal, qtd_metal);
        lista_metal.add(m);
        m.motraSeparacao();
        JOptionPane.showMessageDialog(null, "Reciglagem concluida!\nVocê pode reciclar quantas vezes quiser.");
        
    }
    
    public void mostrarLista_metal(){
        System.out.println("\n------------------------------------------------");
        if(lista_metal.size() > 0){
            System.out.println("METAL - Tempo de degradação: " + lista_metal.get(0).getTempoDegradação());
            System.out.println("Nome  | quantidade");
            for(int i = 0; i < lista_metal.size(); i++) {   
                System.out.print(lista_metal.get(i).getNomeLixo() + " | " + lista_metal.get(i).getQtd()+"\n");
            }            
        }else{
                System.out.println("Não reciclou nenhum METAL.");
        
        }
    }
    public void addLista_organico(){        
        Organico.mostraReciclavel();
        String nome_organico = JOptionPane.showInputDialog(null, "Digite qual material ORGÂNICO você irá reciclar: ");
        int qtd_organico = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos você irá reciclar: "));
        Organico o = new Organico(nome_organico, qtd_organico);
        lista_organico.add(o);
        o.motraSeparacao();
        JOptionPane.showMessageDialog(null, "Reciglagem concluida!\nVocê pode reciclar quantas vezes quiser.");
        
    }
    public void mostrarLista_organico(){
        System.out.println("\n------------------------------------------------");
        if(lista_organico.size() > 0){
            System.out.println("ORGÂNICO - Tempo de degradação: " + lista_organico.get(0).getTempoDegradação());
            System.out.println("Nome  | quantidade");
            for(int i = 0; i < lista_organico.size(); i++) {   
                System.out.print(lista_organico.get(i).getNomeLixo() + " | " + lista_organico.get(i).getQtd()+"\n");
            }            
        }else{
                System.out.println("Não reciclou nenhum MATERIAL ORGÂNICO.");
        
        }
    }
    
    public void addLista_papel(){        
        Papel.mostraReciclavel();
        String nome_papel = JOptionPane.showInputDialog(null, "Digite qual material de PAPEL você irá reciclar: ");
        int qtd_papel = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos você irá reciclar: "));
        Papel p = new Papel(nome_papel, qtd_papel);
        lista_papel.add(p);
        p.motraSeparacao();
        JOptionPane.showMessageDialog(null, "Reciglagem concluida!\nVocê pode reciclar quantas vezes quiser.");
    }
    
    public void mostrarLista_papel(){
        System.out.println("\n------------------------------------------------");
        if(lista_papel.size() > 0){
            System.out.println("PAPEL - Tempo de degradação: " + lista_papel.get(0).getTempoDegradação());
            System.out.println("Nome  | quantidade");
            for(int i = 0; i < lista_papel.size(); i++) {   
                System.out.print(lista_papel.get(i).getNomeLixo() + " | " + lista_papel.get(i).getQtd()+"\n");
            }            
        }else{
                System.out.println("Não reciclou nenhum PAPEL.");
        
        }
    }
    
    public void addLista_plastico(){        
        Plastico.mostraReciclavel();
        String nome_plastico = JOptionPane.showInputDialog(null, "Digite qual material de PLÁSTICO você irá reciclar: ");
        int qtd_plastico = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos você irá reciclar: "));
        Plastico pl = new Plastico(nome_plastico, qtd_plastico);
        lista_plastico.add(pl);
        pl.motraSeparacao();
        JOptionPane.showMessageDialog(null, "Reciglagem concluida!\nVocê pode reciclar quantas vezes quiser.");
    }
    
    public void mostrarLista_plastico(){
        System.out.println("\n------------------------------------------------");
        if(lista_plastico.size() > 0){
                        System.out.println("PLÁSTICO - Tempo de degradação: " + lista_plastico.get(0).getTempoDegradação());
            System.out.println("Nome  | quantidade");
            for(int i = 0; i < lista_plastico.size(); i++) {   
                System.out.print(lista_plastico.get(i).getNomeLixo() + " | " + lista_plastico.get(i).getQtd()+"\n");
            }            
        }else{
                System.out.println("Não reciclou nenhum PLÁTISCO.");
        
        }
    }
    
    public void addLista_vidro(){        
        Vidro.mostraReciclavel();
        String nome_vidro = JOptionPane.showInputDialog(null, "Digite qual material de VIDRO você irá reciclar: ");
        int qtd_vidro = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos você irá reciclar: "));
        Vidro v = new Vidro(nome_vidro, qtd_vidro);
        lista_vidro.add(v);
        v.motraSeparacao();
        JOptionPane.showMessageDialog(null, "Reciglagem concluida!\nVocê pode reciclar quantas vezes quiser.");
    }
    
    public void mostrarLista_vidro(){
        System.out.println("\n------------------------------------------------");
        if(lista_vidro.size() > 0){
                        System.out.println("VIDRO - Tempo de degradação: " + lista_vidro.get(0).getTempoDegradação());
            System.out.println("Nome  | quantidade");
            for(int i = 0; i < lista_vidro.size(); i++) {   
                System.out.print(lista_vidro.get(i).getNomeLixo() + " | " + lista_vidro.get(i).getQtd()+"\n");
            }            
        }else{
                System.out.println("Não reciclou nenhum VIDRO.");
        
        }
    }
    
    
}
