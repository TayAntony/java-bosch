import javax.swing.*;
import java.awt.*;

public class CampoTexto {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Campo de texto");
        frame.getContentPane().setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 200, 600, 500);
        frame.setLayout(null);


        //criando label
        JLabel label = new JLabel();
        label.setBounds(200, 200, 200, 50);
        label.setForeground(Color.MAGENTA);
        label.setFont(new Font("Calibi", Font.BOLD, 20));
        label.setText("Texto exemplo...");


        // criando um campo de texto (input)
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(150, 100, 200, 50);

        //criando botao
        JButton botao = new JButton("Botao");
        botao.setBounds(350, 100, 100, 50);

        //adicionando todos os nossos componentes na janela
        frame.add(label);
        frame.add(botao);
        frame.add(campoTexto);

        botao.addActionListener(e -> label.setText(campoTexto.getText())); //ao clicar no botao trocamos o que está escrito na label pelo que o usuário digitou no campo texto
        frame.setVisible(true);
    }
}
