package model;

import javax.swing.JOptionPane;

public class Organico extends Lixo{
    final private String TempoDegradação = "de 2 a 12 meses";

    public Organico(String nl, int qt) {
        super(nl, qt);
    }

    public static void mostraReciclavel() {
        JOptionPane.showMessageDialog(null,"Lixo Orgânico: cascas de legumes, restos de comida, frutas, cascas de ovos, etc. \n\n"
                                         + "O processo de compostagem pode ser definido como a reciclagem de matéria orgânica.");    }

    @Override
    public void motraSeparacao() {
        JOptionPane.showMessageDialog(null,"Dicas para separar lixo ORGÂNICO:\n" +
                                           "Não colocar embalagens, sacolas e  recepientes que não poderá ser feita a compostagem. ");    }

    public String getTempoDegradação() {
        return TempoDegradação;
    }

}
