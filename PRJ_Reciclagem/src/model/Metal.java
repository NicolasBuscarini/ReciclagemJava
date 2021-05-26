package model;

import javax.swing.JOptionPane;

public class Metal extends Lixo{
    final private String TempoDegradação = "+ de 100 anos";
    

    public Metal(String nl, int qt)  {
        super(nl, qt);
    }


    public String getTempoDegradação() {
        return TempoDegradação;
    }

    public static void mostraReciclavel() {
        JOptionPane.showMessageDialog(null,"RECICLÁVEL: Enlatados, Tampinhas de Garrafas, Chapas, Latas, Ferragens, Arames,\n" +
                                           "Talheres de metal, Panelas sem cabo, Papel alumínio limpo, Canos, Pregos, Aerossóis,\n" +
                                           "Cobre, Embalagem de marmitex.\n\n"+
                                           "NÃO RECICLÁVEL: Clipes, Tachinhas, Latas de inseticidas, Grampos, Latas de solventes\n" +
                                           "Químicos, Esponja de Aço, Latas de Verniz.");
    }

    @Override
    public void motraSeparacao() {
        JOptionPane.showMessageDialog(null,"Dicas para separar METAIS:\n" +
                                           "Latinhas de refrigerantes, cervejas e enlatados devem ser\n" +
                                           "amassados ou prensados para facilitar o armazenamento.");
    }

    

    
    
   
    

}
