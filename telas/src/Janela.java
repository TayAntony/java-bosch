import javax.swing.*; //import de componentes, botao, label, etc
import java.awt.*; //import das estilizações de label

public class Janela {
    public static  void main(String[] args){
        JFrame janela = new JFrame("Título da janela"); //criando a janela
        janela.setSize(500, 300); //tamanho da janela
        janela.setLocation(100, 100); //posição da janela na tela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //o que acontece quando se clica no X

        janela.setLayout(null);  //configura a movimentação dos componentes na janela

        //CRIANDO UMA LABEL
        JLabel rotulo = new JLabel("Isso é uma label"); //criando uma label
        rotulo.setBounds(100,100, 600, 100); //definindo o tamanho da label e a posição na janela
        rotulo.setForeground(new Color(255, 75, 75)); //definindo o texto da label ou
        // também pode ser definida usando rotulo.setForeground(Color.RED)
        rotulo.setFont(new Font("arial", Font.BOLD, 20)); //definindo propriedades de fonte
        janela.add(rotulo); //adicionando o nosso componente label na janela


        janela.setVisible(true); //para a janela aparecer TEM QUE SER SEMPRE A ÚLTIMA LINHA DO CÓDIGO
    }
}
