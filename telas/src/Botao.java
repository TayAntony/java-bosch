import javax.swing.*;
import java.awt.*;

public class Botao {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Janela com botão");
        janela.setBounds(200, 200, 400, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        JButton botao = new JButton("Clique aqui");
        botao.setBounds(150, 150, 100, 50);
        botao.setFont(new Font("Helvetica", Font.ITALIC, 16));
        botao.setForeground(Color.YELLOW);
        botao.setBackground(Color.BLACK); //definindo o bg do botao
        botao.addActionListener(e -> System.out.println("CLIQUEI AQUI"));

        janela.add(botao);

        janela.setVisible(true);

    }

}
