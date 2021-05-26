
package model;

import javax.swing.JOptionPane;


public class Vidro extends Lixo {
    final private String TempoDegradação = "+ de 1000 anos";

    public Vidro(String nl, int qt) {
        super(nl, qt);
    }
    
    public String getTempoDegradação() {
        return TempoDegradação;
    }
    
    public static void mostraReciclavel() {
        JOptionPane.showMessageDialog(null,"RECICLÁVEL: Embalagens, Copos, Vidros especiais como tampa de forno micro-ondas),\n" +
                                           "Frascos de remédio vazio, Potes de conserva, Cacos, Garrafas.\n\n"+
                
                                           "NÃO RECICLÁVEL: : Óculos, Lâmpadas, Espelhos, Louças, Ampolas de remédios, Boxes\n" +
                                           "Temperados, Pirex, Cerâmicas, Para-brisa de carros, Porcelanas, Tubos de TV e\n" +
                                           "monitores.");
    }

    @Override
    public void motraSeparacao() {
        JOptionPane.showMessageDialog(null,"Dicas para separar VIDROS:\n" +
                                           "Lave-os bem e retire as tampas e os objetos indesejados.");    }


}
