package control;


import static model.Reciclagem.mostraMenu;
import javax.swing.JOptionPane;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        
        //Recebendo Dados para a classe Usuario
        String in_nome = JOptionPane.showInputDialog(null, "Insira seu Nome: ");
        int in_idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade: "));
        double in_kilos = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira em média o peso do seu lixo diário(Kg): "));
        Usuario usu = new Usuario(in_nome, in_idade, in_kilos);
        
        
        String valor_menu;
        boolean mantem_menu = true;
        while (mantem_menu == true ){
            valor_menu = mostraMenu();
            
            if (null == valor_menu){
                JOptionPane.showMessageDialog(null, "Valor inserido no menu nulo. Tente de novo e escolha uma das opções válidas no Menu");
            }else switch (valor_menu) {
                case "1":
                    // 1 - Calcula Lixo anual
                    usu.printCalculos(usu.kg_anuais(), usu.kg_vida(), usu.volume());
                    JOptionPane.showMessageDialog(null, "É muito lixo, não é? \n"
                            + "Talvez você queira diminuir lixo que você produz.\n"
                            + "E você pode começar hoje!\n"
                            + "Praticando a COLETA e RECICLAGEM irá diminuir seu lixo e ajudará salvar nosso planeta.\n");
                    break;
                case "3":
                    // 3 - Mostra todas as ArrayList
                    usu.rec.mostrarLista_metal();
                    usu.rec.mostrarLista_organico();
                    usu.rec.mostrarLista_papel();
                    usu.rec.mostrarLista_plastico();
                    usu.rec.mostrarLista_vidro();
                    System.out.println("\n------------------------------------------------");
                    JOptionPane.showMessageDialog(null,"Toda sua coleta de lixo para reciclagem foi mostrada no console");
                    break;
                case "21":
                    // 21 - adiciona objeto METAL à reciclagem
                    usu.rec.addLista_metal();
                    break;
                case "22":
                    // 22 - adiciona objeto ORGANICO à reciclagem
                    usu.rec.addLista_organico();
                    break;
                case "23":
                    // 23 - adiciona objeto PAPEL à reciclagem
                    usu.rec.addLista_papel();
                    break;
                case "24":
                    // 24 - adiciona objeto PLÁSTICO à reciclagem
                    usu.rec.addLista_plastico();
                    break;
                case "25":
                    // 25 - adiciona objeto VIDRO à reciclagem
                    usu.rec.addLista_vidro();
                    break;
                case "26":
                    // 26 - FECHA PROGRAMA
                    mantem_menu = false;
                    break;
                case "4":
                    // 4 - FECHA PROGRAMA
                    mantem_menu = false;
                    break;
                default:
                    // Valores Incorretos
                    JOptionPane.showMessageDialog(null, "Valor(es) no menu incorreto(s) ou nulos. Tente de novo e escolha as opções válidas no Menu");
                    break;
            }        
            
        }
        JOptionPane.showMessageDialog(null, "Fim do Programa!");
    }
}
