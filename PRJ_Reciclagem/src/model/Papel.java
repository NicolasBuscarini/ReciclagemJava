package model;

import javax.swing.JOptionPane;

public class Papel extends Lixo {
    final private String TempoDegradação = "de 3 a 6 meses";

    public Papel(String nl, int qt) {
        super(nl, qt);
    }


    public static void mostraReciclavel() {
        JOptionPane.showMessageDialog(null,"RECICLÁVEL: Papel de fax, Jornais e Revistas, Envelopes, Listas Telefônicas,\n" +
                                           "Rascunhos, Papel Sulfite/Rascunho, Cartazes Velhos, Papel de Fax, Folhas de Caderno,\n" +
                                           "Fotocópias, Embalagens longa vida tipo Tetrapak, Formulários de Computador, Caixa de\n" +
                                           "Pizza, Caixas em Geral (ondulado), Cartolinas e papel cartão, Aparas de Papel,\n\n"+
                
                                           "NÃO RECICLÁVEL: Papéis Plastificados, Papéis Sanitários (papel higiênico), Etiquetas\n" +
                                           "adesivas, Papéis engordurados, Papel carbono, Papéis Parafinados, Fotografias, Papel\n" +
                                           "celofane, Bitucas de Cigarros, Guardanapos.");
    }

    @Override
    public void motraSeparacao() {
        JOptionPane.showMessageDialog(null,"Dicas para separar PAPÉIS:\n" +
                                           "Podem ser dobrados, mas não devem ser amassados.\n"
                                         + "Podem ser guardados diretamente em sacos plásticos secos para o envio.\n"
                                         + "Não deixe restos orgânicos junto aos papéis.");    }

    public String getTempoDegradação() {
        return TempoDegradação;
    }

}
