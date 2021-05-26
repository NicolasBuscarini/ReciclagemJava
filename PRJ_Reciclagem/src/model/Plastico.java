
package model;

import javax.swing.JOptionPane;


public class Plastico extends Lixo {
    final private String TempoDegradação = "+ de 450 anos";

    public Plastico(String nl, int qt) {
        super(nl, qt);
    }
    

    public String getTempoDegradação() {
        return TempoDegradação;
    }
      
    public static void mostraReciclavel() {
        JOptionPane.showMessageDialog(null,"RECICLÁVEL: \n" +
                                           "Garrafas, Copos, Embalagens Pet (Refrigerantes, Vinagre,Óleo…), Sacos/Sacolas,\n" +
                                           "Tampas, Frascos de produtos, Caneta (Sem a tinta), Canos e Tubos de PVC, \n" +
                                           "Embalagens de produto de limpeza, Embalagens tipo Tupperware,Brinquedos de plástico, Baldes\n\n" +
                
                                           "NÃO RECICLAVEL:\n "+
                                           "Espuma, Esponja de cozinha, Tomadas, Acrílico, Bandejas de\n" +
                                           "plástico, Embalagem Metalizada (Café e Salgadinho), Cabos de Panela, Isopor.");

    }

    @Override
    public void motraSeparacao() {
        JOptionPane.showMessageDialog(null,"Dicas para separar PLÁSTICOS:\n" + 
                                           "Lave-os bem para que não fiquem restos do produto, principalmente as embalagens de detergentes\n" +
                                           "e shampoos, que podem dificultar a triagem e o aproveitamento do material.");
         
    }

}
